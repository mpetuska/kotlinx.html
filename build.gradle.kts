@file:Suppress("UNUSED_VARIABLE")

import Build_gradle.MavenPomFile
import kotlinx.html.js.packageJson
import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask

/**
 * This build script supports following parameters:
 * -Prelease      - activates "release" profile (uploading to Bintray "kotlin/kotlinx" without publication and
 *                  publication to npmjs "kotlinx-html").
 * -Pbranch-build - activates "branch-build" profile (publication to Bintray "kotlin/kotlin-dev" and to npmjs
 *                  "@kotlinx-branch-build/kotlinx-html").
 * -Pmaster-build - activates "master-build" profile (publication to OSS Sonatype snapshot repository and to npmjs
 *                  "@kotlinx-master-build/kotlinx-html").
 * -PversionTag   - works together with "branch-build" profile and overrides "-SNAPSHOT" suffix of the version.
 */
plugins {
    kotlin("multiplatform") version "1.4.0"
    id("maven-publish")
}

group = "org.jetbrains.kotlinx"
version = "0.7.2-SNAPSHOT"

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlinx:binary-compatibility-validator:0.2.3")
    }
}

apply(plugin = "binary-compatibility-validator")

/**
 * If "release" profile is used the "-SNAPSHOT" suffix of the version is removed.
 */
if (hasProperty("release")) {
    val versionString = version as String
    if (versionString.endsWith("-SNAPSHOT")) {
        version = versionString.replace("-SNAPSHOT", "")
    }
}

/**
 * Handler of "versionTag" property.
 * Required to support Bintray and NPM repositories that doesn't support "-SNAPSHOT" versions. To build and publish
 * artifacts with specific version run "./gradlew -PversionTag=my-tag" and the final version will be "0.6.13-my-tag".
 */
if (hasProperty("versionTag")) {
    val versionString = version as String
    val versionTag = properties["versionTag"]
    if (versionString.endsWith("-SNAPSHOT")) {
        version = versionString.replace("-SNAPSHOT", "-$versionTag")
        logger.lifecycle("Project will be built with version '$version'.")
    } else {
        error("Could not apply 'versionTag' together with non-snapshot version.")
    }
}

publishing {
    publications {
        repositories {
            when {
                hasProperty("release") -> {
                    maven {
                        url = uri("https://api.bintray.com/maven/kotlin/kotlinx/kotlinx.html;publish=1")
                        credentials {
                            username = System.getenv("BINTRAY_USERNAME")
                            password = System.getenv("BINTRAY_PASSWORD")
                        }
                    }
                }
                hasProperty("branch-build") -> {
                    require(!(version as String).endsWith("-SNAPSHOT")) {
                        "Profile 'branch-build' assumes non-snapshot version. Use -PversionTag to fix the build."
                    }

                    maven {
                        url = uri("https://api.bintray.com/maven/kotlin/kotlin-dev/kotlinx.html/;publish=1")
                        credentials {
                            username = System.getenv("BINTRAY_USERNAME")
                            password = System.getenv("BINTRAY_PASSWORD")
                        }
                    }
                }
                hasProperty("master-build") -> {
                    require((version as String).endsWith("-SNAPSHOT")) {
                        "Profile 'master-build' assumes snapshot version. Change the version or use another profile."
                    }

                    maven {
                        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
                        credentials {
                            username = System.getenv("SONATYPE_USERNAME")
                            password = System.getenv("SONATYPE_PASSWORD")
                        }
                    }
                }
            }
        }

        create<MavenPublication>("kotlinx-html-assembly") {
            artifactId = "kotlinx-html-assembly"
            jar("jsWebJar") {
                archiveBaseName by "${project.name}-assembly"
                archiveClassifier by "webjar"
                from("$buildDir/js/packages/${project.name}/kotlin/kotlinx-html-js.js")
                into("META-INF/resources/webjars/${project.name}/${project.version}/")
            }
        }
    }
}

repositories {
    jcenter()
    mavenCentral()

    // It is just for release against pre-release versions
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }

    when {
        /** Allow all profiles but release to use development and SNAPSHOT dependencies. */
        !hasProperty("release") -> {
            maven { url = uri("https://dl.bintray.com/kotlin/kotlin-dev") }
            maven {
                url = uri("https://oss.sonatype.org/content/repositories/snapshots")
                mavenContent {
                    snapshotsOnly()
                }
            }
        }
    }
}

fun KotlinTarget.setupPublishing() {
    mavenPublication {
        groupId = group as String
        pom.config { name by "${project.name}-$targetName" }
    }
}

val commonGenDir = "src/commonMain/generated"
val browserGenDir = "src/browserMain/generated"
val jsGenDir = "src/jsMain/generated"
kotlin {
    jvm {
        compilations["main"].kotlinOptions.apply {
            freeCompilerArgs += "-Xdump-declarations-to=${buildDir}/declarations.json"
        }

        mavenPublication {
            groupId = group as String
            pom.config { name by "${project.name}-jvm" }

            javadocJar("jvmJavadocJar")
            jar("jvmTestSourcesJar") {
                archiveClassifier by "test-sources"
                with(sourceSets["jvmTest"]) {
                    from(kotlin, resources)
                }
            }
        }
    }

    js(BOTH) {
        moduleName = project.name
        browser {
            testTask {
                useKarma {
                    useChromeHeadless()
                    useConfigDirectory("${project.projectDir}/src/jsTest/karma")
                }
            }
        }

        compilations["main"].packageJson {
            main = "kotlin/kotlinx-html-js.js"
            name = "kotlinx-html-js"
        }

        compilations["main"].kotlinOptions.apply {
            outputFile = "$buildDir/js/packages/${project.name}/kotlin/${project.name}-js.js"
            moduleKind = "umd"
            sourceMap = true
            sourceMapEmbedSources = "always"
        }

        compilations["test"].kotlinOptions.apply {
            moduleKind = "umd"
            metaInfo = true
            sourceMap = true
        }

        mavenPublication {
            groupId = group as String
            pom.config { name by "${project.name}-js" }

            javadocJar("jsJavadocJar")
            jar("jsTestSourcesJar") {
                archiveClassifier by "test-sources"
                with(sourceSets["jsTest"]) {
                    from(kotlin, resources)
                }
            }
        }
    }

    wasm32 {}

    val mingwTargets = listOf(
        mingwX64(),
        mingwX86()
    )
    val unixTargets = listOf(
        linuxArm32Hfp(),
        linuxArm64(),
        linuxMips32(),
        linuxMipsel32(),
        linuxX64(),
        iosArm32(),
        iosArm64(),
        iosX64(),
        macosX64()
    )

    metadata {
        mavenPublication {
            groupId = group as String
            artifactId = "${project.name}-common"
            pom.config { name by "${project.name}-common" }

            javadocJar("commonJavadocJar")
            jar("commonTestSourcesJar") {
                archiveClassifier by "test-sources"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            kotlin.srcDirs(commonGenDir)
        }

        val browserMain by creating {
            dependsOn(commonMain)
            kotlin.srcDirs(browserGenDir)
        }

        val desktopMain by creating {
            dependsOn(commonMain)
        }

        val unixMain by creating {
            dependsOn(desktopMain)
        }

        configure(unixTargets) {
            this.compilations["main"].defaultSourceSet.dependsOn(unixMain)
        }

        val mingwMain by creating {
            dependsOn(desktopMain)
        }

        configure(mingwTargets) {
            this.compilations["main"].defaultSourceSet.dependsOn(mingwMain)
        }

        val jsMain by getting {
            dependsOn(browserMain)
            kotlin.srcDirs(jsGenDir)
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation(npm("puppeteer", "*"))
            }
        }

        val jvmMain by getting {
            dependsOn(desktopMain)
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                /* Jackson is required to parse declarations.json. */
                implementation("com.fasterxml.jackson.core:jackson-core:2.10.1")
                implementation("com.fasterxml.jackson.core:jackson-databind:2.10.1")
            }
        }

        val wasm32Main by getting {
            dependsOn(browserMain)
            wasm32().compilations["main"].apply {
                kotlinOptions.freeCompilerArgs = resources.files.flatMap {
                    listOf("-include-binary", it.invariantSeparatorsPath)
                }
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "6.5"
        distributionType = Wrapper.DistributionType.ALL
    }
    register<Task>("generate") {
        group = "source-generation"
        description = "Generate tag-handling code using tags description."

        outputs.dirs(commonGenDir, browserGenDir, jsGenDir)
        doLast {
            kotlinx.html.generate.generate(
                packg = "kotlinx.html",
                todir = commonGenDir,
                browserdir = browserGenDir,
                jsdir = jsGenDir
            )
        }
    }
    register<Copy>("jsPackagePrepare") {
        dependsOn("jsLegacyMainClasses")
        getByName("assemble").dependsOn(this)

        group = "build"
        description = "Assembles NPM package (result is placed into 'build/tmp/jsPackage')."

        val baseTargetDir = "$buildDir/tmp/jsPackage"

        from("README-JS.md")
        from("$buildDir/js/packages/${project.name}/kotlin")
        into(baseTargetDir)

        rename("README-JS.md", "README.md")

        doLast {
            var npmVersion = version as String
            if (npmVersion.endsWith("-SNAPSHOT")) {
                npmVersion = npmVersion.replace("-SNAPSHOT", "-${System.currentTimeMillis()}")
            }

            val organization = when {
                project.hasProperty("branch-build") -> "kotlinx-branch-build"
                project.hasProperty("master-build") -> "kotlinx-master-build"
                else -> null
            }

            File(baseTargetDir, "package.json").writeText(packageJson(npmVersion, organization))
            file("$baseTargetDir/kotlinx-html-js").renameTo(File("$buildDir/js-module/kotlinx-html-js"))
        }
    }
    register<Exec>("publishNpm") {
        dependsOn("jsPackagePrepare")
        dependsOn("kotlinNodeJsSetup")

        group = "publishing"
        description = "Publishes ${project.name} NPM module to 'registry.npmjs.org'."

        val kotlinNodeJsSetupTask = getByName("kotlinNodeJsSetup") as NodeJsSetupTask

        // For some unknown reason, the node distributive's structure is different on Windows and UNIX.
        val node = if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            kotlinNodeJsSetupTask.destination
                .resolve("node.exe")
        } else {
            kotlinNodeJsSetupTask.destination
                .resolve("bin")
                .resolve("node")
        }

        val npm = if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            kotlinNodeJsSetupTask.destination
                .resolve("node_modules")
                .resolve("npm")
                .resolve("bin")
                .resolve("npm-cli.js")
        } else {
            kotlinNodeJsSetupTask.destination
                .resolve("lib")
                .resolve("node_modules")
                .resolve("npm")
                .resolve("bin")
                .resolve("npm-cli.js")
        }

        commandLine(
            node,
            npm,
            "publish",
            "$buildDir/tmp/jsPackage",
            "--//registry.npmjs.org/:_authToken=${System.getenv("NPMJS_AUTH")}",
            "--access=public"
        )
    }
    withType<GenerateModuleMetadata> {
        enabled = true
    }
    withType<Jar> {
        manifest {
            attributes += sortedMapOf(
                "Built-By" to System.getProperty("user.name"),
                "Build-Jdk" to System.getProperty("java.version"),
                "Implementation-Vendor" to "JetBrains s.r.o.",
                "Implementation-Version" to archiveVersion.get(),
                "Created-By" to org.gradle.util.GradleVersion.current()
            )
        }
    }
}

typealias MavenPomFile = org.gradle.api.publish.maven.MavenPom

fun MavenPomFile.config(config: MavenPomFile.() -> Unit = {}) {
    config()

    url by "https://github.com/Kotlin/kotlinx.html"

    licenses {
        license {
            name by "The Apache License, Version 2.0"
            url by "https://www.apache.org/licenses/LICENSE-2.0.txt"
        }
    }

    scm {
        connection by "scm:git:git@github.com:Kotlin/kotlinx.html.git"
        url by "https://github.com/Kotlin/kotlinx.html"
        tag by "HEAD"
    }

    developers {
        developer {
            name by "Sergey Mashkov"
            organization by "JetBrains s.r.o."
            roles to "developer"
        }

        developer {
            name by "Anton Dmitriev"
            organization by "JetBrains s.r.o."
            roles to "developer"
        }
    }
}

fun MavenPublication.jar(taskName: String, config: Action<Jar>) = artifact(tasks.create(taskName, Jar::class, config))

fun MavenPublication.javadocJar(taskName: String, config: Jar.() -> Unit = {}) = jar(taskName) {
    archiveClassifier by "javadoc"
    config()
}

infix fun <T> Property<T>.by(value: T) {
    set(value)
}
