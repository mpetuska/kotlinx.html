package kotlinx.html

/*******************************************************************************
DO NOT EDIT
This file was generated by module generate
 *******************************************************************************/

@Suppress("unused")
open class H1<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h1", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class H2<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h2", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class H3<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h3", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class H4<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h4", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class H5<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h5", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class H6<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("h6", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingPhrasingContent<E>

@Suppress("unused")
open class HEAD<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("head", consumer, initialAttributes, null, false, false), HtmlHeadTag<E> {
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun Entities.unaryPlus(): Unit {
        @Suppress("DEPRECATION") entity(this)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun String.unaryPlus(): Unit {
        @Suppress("DEPRECATION") text(this)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(s: String): Unit {
        super<HTMLTag>.text(s)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(n: Number): Unit {
        super<HTMLTag>.text(n)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun entity(e: Entities): Unit {
        super<HTMLTag>.entity(e)
    }
    
}

@Suppress("unused")
open class HEADER<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("header", consumer, initialAttributes, null, false, false), HtmlBlockTag<E>

@Suppress("unused")
open class HGROUP<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("hgroup", consumer, initialAttributes, null, false, false),
    CommonAttributeGroupFacadeFlowHeadingContent<E>

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h1(classes: String? = null, crossinline block: H1<E>.() -> Unit = {}): Unit =
    H1(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h2(classes: String? = null, crossinline block: H2<E>.() -> Unit = {}): Unit =
    H2(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h3(classes: String? = null, crossinline block: H3<E>.() -> Unit = {}): Unit =
    H3(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h4(classes: String? = null, crossinline block: H4<E>.() -> Unit = {}): Unit =
    H4(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h5(classes: String? = null, crossinline block: H5<E>.() -> Unit = {}): Unit =
    H5(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <E> HGROUP<E>.h6(classes: String? = null, crossinline block: H6<E>.() -> Unit = {}): Unit =
    H6(attributesMapOf("class", classes), consumer).visit(block)

val <E> HGROUP<E>.asFlowContent: FlowContent<E>
    get() = this

val <E> HGROUP<E>.asHeadingContent: HeadingContent<E>
    get() = this


@Suppress("unused")
open class HR<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("hr", consumer, initialAttributes, null, false, true), HtmlBlockTag<E>

@Suppress("unused")
open class HTML<E>(
    initialAttributes: Map<String, String>,
    override val consumer: TagConsumer<*, E>,
    namespace: String? = null
) : HTMLTag<E>("html", consumer, initialAttributes, namespace, false, false), CommonAttributeGroupFacade<E> {
    var manifest: String
        get() = attributeStringString.get(this, "manifest")
        set(newValue) {
            attributeStringString.set(this, "manifest", newValue)
        }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun Entities.unaryPlus(): Unit {
        @Suppress("DEPRECATION") entity(this)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override operator fun String.unaryPlus(): Unit {
        @Suppress("DEPRECATION") text(this)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(s: String): Unit {
        super<HTMLTag>.text(s)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun text(n: Number): Unit {
        super<HTMLTag>.text(n)
    }
    
    @Deprecated("This tag most likely doesn't support text content or requires unsafe content (try unsafe {}")
    override fun entity(e: Entities): Unit {
        super<HTMLTag>.entity(e)
    }
    
}

/**
 * Document body
 */
@HtmlTagMarker
inline fun <E> HTML<E>.body(classes: String? = null, crossinline block: BODY<E>.() -> Unit = {}): Unit =
    BODY(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Document head
 */
@HtmlTagMarker
inline fun <E> HTML<E>.head(crossinline block: HEAD<E>.() -> Unit = {}): Unit = HEAD(emptyMap, consumer).visit(block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document head
 */
@HtmlTagMarker
fun <E> HTML<E>.head(content: String = ""): Unit = HEAD(emptyMap, consumer).visit({ +content })

