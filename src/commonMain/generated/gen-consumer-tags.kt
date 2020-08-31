package kotlinx.html

import kotlinx.html.attributes.enumEncode

/*******************************************************************************
DO NOT EDIT
This file was generated by module generate
 *******************************************************************************/

/**
 * Anchor
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.a(
    href: String? = null,
    target: String? = null,
    classes: String? = null,
    crossinline block: A<E>.() -> Unit = {}
): T = A(attributesMapOf("href", href, "target", target, "class", classes), this).visitAndFinalize(this, block)

/**
 * Abbreviated form (e.g., WWW, HTTP,etc.)
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.abbr(
    classes: String? = null,
    crossinline block: ABBR<E>.() -> Unit = {}
): T = ABBR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Information on author
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.address(
    classes: String? = null,
    crossinline block: ADDRESS<E>.() -> Unit = {}
): T = ADDRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Client-side image map area
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.area(
    shape: AreaShape? = null,
    alt: String? = null,
    classes: String? = null,
    crossinline block: AREA<E>.() -> Unit = {}
): T = AREA(attributesMapOf("Shape", shape?.enumEncode(), "alt", alt, "class", classes), this).visitAndFinalize(
    this,
    block
)

/**
 * Self-contained syndicatable or reusable composition
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.article(
    classes: String? = null,
    crossinline block: ARTICLE<E>.() -> Unit = {}
): T = ARTICLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Sidebar for tangentially related content
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.aside(
    classes: String? = null,
    crossinline block: ASIDE<E>.() -> Unit = {}
): T = ASIDE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Audio player
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.audio(
    classes: String? = null,
    crossinline block: AUDIO<E>.() -> Unit = {}
): T = AUDIO(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Bold text style
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.b(classes: String? = null, crossinline block: B<E>.() -> Unit = {}): T =
    B(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document base URI
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.base(
    classes: String? = null,
    crossinline block: BASE<E>.() -> Unit = {}
): T = BASE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Text directionality isolation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.bdi(classes: String? = null, crossinline block: BDI<E>.() -> Unit = {}): T =
    BDI(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * I18N BiDi over-ride
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.bdo(classes: String? = null, crossinline block: BDO<E>.() -> Unit = {}): T =
    BDO(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Long quotation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.blockQuote(
    classes: String? = null,
    crossinline block: BLOCKQUOTE<E>.() -> Unit = {}
): T = BLOCKQUOTE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document body
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.body(
    classes: String? = null,
    crossinline block: BODY<E>.() -> Unit = {}
): T = BODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Forced line break
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.br(classes: String? = null, crossinline block: BR<E>.() -> Unit = {}): T =
    BR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Push button
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.button(
    formEncType: ButtonFormEncType? = null,
    formMethod: ButtonFormMethod? = null,
    name: String? = null,
    type: ButtonType? = null,
    classes: String? = null,
    crossinline block: BUTTON<E>.() -> Unit = {}
): T = BUTTON(
    attributesMapOf(
        "formenctype",
        formEncType?.enumEncode(),
        "formmethod",
        formMethod?.enumEncode(),
        "name",
        name,
        "type",
        type?.enumEncode(),
        "class",
        classes
    ), this
).visitAndFinalize(this, block)

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.canvas(classes: String? = null, content: String = ""): T =
    CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.canvas(
    classes: String? = null,
    crossinline block: CANVAS<E>.() -> Unit = {}
): T = CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table caption
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.caption(
    classes: String? = null,
    crossinline block: CAPTION<E>.() -> Unit = {}
): T = CAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Citation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.cite(
    classes: String? = null,
    crossinline block: CITE<E>.() -> Unit = {}
): T = CITE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Computer code fragment
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.code(
    classes: String? = null,
    crossinline block: CODE<E>.() -> Unit = {}
): T = CODE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table column
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.col(classes: String? = null, crossinline block: COL<E>.() -> Unit = {}): T =
    COL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table column group
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.colGroup(
    classes: String? = null,
    crossinline block: COLGROUP<E>.() -> Unit = {}
): T = COLGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.command(
    type: CommandType? = null,
    classes: String? = null,
    crossinline block: COMMAND<E>.() -> Unit = {}
): T = COMMAND(attributesMapOf("type", type?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Container for options for
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dataList(
    classes: String? = null,
    crossinline block: DATALIST<E>.() -> Unit = {}
): T = DATALIST(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Definition description
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dd(classes: String? = null, crossinline block: DD<E>.() -> Unit = {}): T =
    DD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Deleted text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.del(classes: String? = null, crossinline block: DEL<E>.() -> Unit = {}): T =
    DEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Disclosure control for hiding details
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.details(
    classes: String? = null,
    crossinline block: DETAILS<E>.() -> Unit = {}
): T = DETAILS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Instance definition
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dfn(classes: String? = null, crossinline block: DFN<E>.() -> Unit = {}): T =
    DFN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Dialog box or window
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dialog(
    classes: String? = null,
    crossinline block: DIALOG<E>.() -> Unit = {}
): T = DIALOG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic language/style container
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.div(classes: String? = null, crossinline block: DIV<E>.() -> Unit = {}): T =
    DIV(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Definition list
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dl(classes: String? = null, crossinline block: DL<E>.() -> Unit = {}): T =
    DL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Definition term
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.dt(classes: String? = null, crossinline block: DT<E>.() -> Unit = {}): T =
    DT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Emphasis
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.em(classes: String? = null, crossinline block: EM<E>.() -> Unit = {}): T =
    EM(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Plugin
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.embed(
    classes: String? = null,
    crossinline block: EMBED<E>.() -> Unit = {}
): T = EMBED(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Form control group
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.fieldSet(
    classes: String? = null,
    crossinline block: FIELDSET<E>.() -> Unit = {}
): T = FIELDSET(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Caption for
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.figcaption(
    classes: String? = null,
    crossinline block: FIGCAPTION<E>.() -> Unit = {}
): T = FIGCAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Figure with optional caption
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.figure(
    classes: String? = null,
    crossinline block: FIGURE<E>.() -> Unit = {}
): T = FIGURE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Footer for a page or section
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.footer(
    classes: String? = null,
    crossinline block: FOOTER<E>.() -> Unit = {}
): T = FOOTER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Interactive form
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.form(
    action: String? = null,
    encType: FormEncType? = null,
    method: FormMethod? = null,
    classes: String? = null,
    crossinline block: FORM<E>.() -> Unit = {}
): T = FORM(
    attributesMapOf(
        "action",
        action,
        "enctype",
        encType?.enumEncode(),
        "method",
        method?.enumEncode(),
        "class",
        classes
    ), this
).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h1(classes: String? = null, crossinline block: H1<E>.() -> Unit = {}): T =
    H1(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h2(classes: String? = null, crossinline block: H2<E>.() -> Unit = {}): T =
    H2(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h3(classes: String? = null, crossinline block: H3<E>.() -> Unit = {}): T =
    H3(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h4(classes: String? = null, crossinline block: H4<E>.() -> Unit = {}): T =
    H4(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h5(classes: String? = null, crossinline block: H5<E>.() -> Unit = {}): T =
    H5(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Heading
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.h6(classes: String? = null, crossinline block: H6<E>.() -> Unit = {}): T =
    H6(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document head
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.head(content: String = ""): T =
    HEAD(emptyMap, this).visitAndFinalize(this, { +content })

/**
 * Document head
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.head(crossinline block: HEAD<E>.() -> Unit = {}): T =
    HEAD(emptyMap, this).visitAndFinalize(this, block)

/**
 * Introductory or navigational aids for a page or section
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.header(
    classes: String? = null,
    crossinline block: HEADER<E>.() -> Unit = {}
): T = HEADER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.hGroup(
    classes: String? = null,
    crossinline block: HGROUP<E>.() -> Unit = {}
): T = HGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Horizontal rule
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.hr(classes: String? = null, crossinline block: HR<E>.() -> Unit = {}): T =
    HR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document root element
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.html(content: String = "", namespace: String? = null): T =
    HTML(emptyMap, this, namespace).visitAndFinalize(this, { +content })

/**
 * Document root element
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.html(
    namespace: String? = null,
    crossinline block: HTML<E>.() -> Unit = {}
): T = HTML(emptyMap, this, namespace).visitAndFinalize(this, block)

/**
 * Italic text style
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.i(classes: String? = null, crossinline block: I<E>.() -> Unit = {}): T =
    I(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Inline subwindow
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.iframe(
    sandbox: IframeSandbox? = null,
    classes: String? = null,
    content: String = ""
): T = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), this).visitAndFinalize(
    this,
    { +content })

/**
 * Inline subwindow
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.iframe(
    sandbox: IframeSandbox? = null,
    classes: String? = null,
    crossinline block: IFRAME<E>.() -> Unit = {}
): T = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Embedded image
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.img(
    alt: String? = null,
    src: String? = null,
    classes: String? = null,
    crossinline block: IMG<E>.() -> Unit = {}
): T = IMG(attributesMapOf("alt", alt, "src", src, "class", classes), this).visitAndFinalize(this, block)

/**
 * Form control
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.input(
    type: InputType? = null,
    formEncType: InputFormEncType? = null,
    formMethod: InputFormMethod? = null,
    name: String? = null,
    classes: String? = null,
    crossinline block: INPUT<E>.() -> Unit = {}
): T = INPUT(
    attributesMapOf(
        "type",
        type?.enumEncode(),
        "formenctype",
        formEncType?.enumEncode(),
        "formmethod",
        formMethod?.enumEncode(),
        "name",
        name,
        "class",
        classes
    ), this
).visitAndFinalize(this, block)

/**
 * Inserted text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.ins(classes: String? = null, crossinline block: INS<E>.() -> Unit = {}): T =
    INS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Text to be entered by the user
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.kbd(classes: String? = null, crossinline block: KBD<E>.() -> Unit = {}): T =
    KBD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Cryptographic key-pair generator form control
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.keyGen(
    keyType: KeyGenKeyType? = null,
    classes: String? = null,
    crossinline block: KEYGEN<E>.() -> Unit = {}
): T = KEYGEN(attributesMapOf("keytype", keyType?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Form field label text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.label(
    classes: String? = null,
    crossinline block: LABEL<E>.() -> Unit = {}
): T = LABEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Fieldset legend
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.legend(
    classes: String? = null,
    crossinline block: LEGEND<E>.() -> Unit = {}
): T = LEGEND(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * List item
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.li(classes: String? = null, crossinline block: LI<E>.() -> Unit = {}): T =
    LI(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * A media-independent link
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.link(
    href: String? = null,
    rel: String? = null,
    type: String? = null,
    crossinline block: LINK<E>.() -> Unit = {}
): T = LINK(attributesMapOf("href", href, "rel", rel, "type", type), this).visitAndFinalize(this, block)

/**
 * Container for the dominant contents of another element
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.main(
    classes: String? = null,
    crossinline block: MAIN<E>.() -> Unit = {}
): T = MAIN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Client-side image map
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.map(
    name: String? = null,
    classes: String? = null,
    crossinline block: MAP<E>.() -> Unit = {}
): T = MAP(attributesMapOf("name", name, "class", classes), this).visitAndFinalize(this, block)

/**
 * Highlight
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.mark(
    classes: String? = null,
    crossinline block: MARK<E>.() -> Unit = {}
): T = MARK(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.math(
    classes: String? = null,
    crossinline block: MATH<E>.() -> Unit = {}
): T = MATH(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.mathml(classes: String? = null, content: String = ""): T =
    MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.mathml(
    classes: String? = null,
    crossinline block: MATHML<E>.() -> Unit = {}
): T = MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.meta(
    name: String? = null,
    content: String? = null,
    charset: String? = null,
    crossinline block: META<E>.() -> Unit = {}
): T = META(attributesMapOf("name", name, "content", content, "charset", charset), this).visitAndFinalize(this, block)

/**
 * Gauge
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.meter(
    classes: String? = null,
    crossinline block: METER<E>.() -> Unit = {}
): T = METER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Section with navigational links
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.nav(classes: String? = null, crossinline block: NAV<E>.() -> Unit = {}): T =
    NAV(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.noScript(
    classes: String? = null,
    crossinline block: NOSCRIPT<E>.() -> Unit = {}
): T = NOSCRIPT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic embedded object
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.htmlObject(
    classes: String? = null,
    crossinline block: OBJECT<E>.() -> Unit = {}
): T = OBJECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ordered list
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.ol(classes: String? = null, crossinline block: OL<E>.() -> Unit = {}): T =
    OL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option group
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.optGroup(
    label: String? = null,
    classes: String? = null,
    crossinline block: OPTGROUP<E>.() -> Unit = {}
): T = OPTGROUP(attributesMapOf("label", label, "class", classes), this).visitAndFinalize(this, block)

/**
 * Selectable choice
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.option(classes: String? = null, content: String = ""): T =
    OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

/**
 * Selectable choice
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.option(
    classes: String? = null,
    crossinline block: OPTION<E>.() -> Unit = {}
): T = OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Calculated output value
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.output(
    classes: String? = null,
    crossinline block: OUTPUT<E>.() -> Unit = {}
): T = OUTPUT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Paragraph
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.p(classes: String? = null, crossinline block: P<E>.() -> Unit = {}): T =
    P(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Named property value
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.param(
    name: String? = null,
    value: String? = null,
    crossinline block: PARAM<E>.() -> Unit = {}
): T = PARAM(attributesMapOf("name", name, "value", value), this).visitAndFinalize(this, block)

/**
 * Preformatted text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.pre(classes: String? = null, crossinline block: PRE<E>.() -> Unit = {}): T =
    PRE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Progress bar
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.progress(
    classes: String? = null,
    crossinline block: PROGRESS<E>.() -> Unit = {}
): T = PROGRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Short inline quotation
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.q(classes: String? = null, crossinline block: Q<E>.() -> Unit = {}): T =
    Q(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Parenthesis for ruby annotation text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.rp(classes: String? = null, crossinline block: RP<E>.() -> Unit = {}): T =
    RP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation text
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.rt(classes: String? = null, crossinline block: RT<E>.() -> Unit = {}): T =
    RT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation(s)
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.ruby(
    classes: String? = null,
    crossinline block: RUBY<E>.() -> Unit = {}
): T = RUBY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Strike-through text style
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.samp(
    classes: String? = null,
    crossinline block: SAMP<E>.() -> Unit = {}
): T = SAMP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Script statements
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.script(type: String? = null, src: String? = null, content: String = ""): T =
    SCRIPT(attributesMapOf("type", type, "src", src), this).visitAndFinalize(this, { +content })

/**
 * Script statements
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.script(
    type: String? = null,
    src: String? = null,
    crossinline block: SCRIPT<E>.() -> Unit = {}
): T = SCRIPT(attributesMapOf("type", type, "src", src), this).visitAndFinalize(this, block)

/**
 * Generic document or application section
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.section(
    classes: String? = null,
    crossinline block: SECTION<E>.() -> Unit = {}
): T = SECTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option selector
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.select(
    classes: String? = null,
    crossinline block: SELECT<E>.() -> Unit = {}
): T = SELECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Small text style
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.small(
    classes: String? = null,
    crossinline block: SMALL<E>.() -> Unit = {}
): T = SMALL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Media source for
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.source(
    classes: String? = null,
    crossinline block: SOURCE<E>.() -> Unit = {}
): T = SOURCE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic language/style container
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.span(
    classes: String? = null,
    crossinline block: SPAN<E>.() -> Unit = {}
): T = SPAN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Strong emphasis
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.strong(
    classes: String? = null,
    crossinline block: STRONG<E>.() -> Unit = {}
): T = STRONG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Style info
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.style(type: String? = null, content: String = ""): T =
    STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, { +content })

/**
 * Style info
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.style(type: String? = null, crossinline block: STYLE<E>.() -> Unit = {}): T =
    STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, block)

/**
 * Subscript
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.sub(classes: String? = null, crossinline block: SUB<E>.() -> Unit = {}): T =
    SUB(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Caption for
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.summary(
    classes: String? = null,
    crossinline block: SUMMARY<E>.() -> Unit = {}
): T = SUMMARY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Superscript
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.sup(classes: String? = null, crossinline block: SUP<E>.() -> Unit = {}): T =
    SUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.svg(classes: String? = null, content: String = ""): T =
    SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, { +content })

@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.svg(classes: String? = null, crossinline block: SVG<E>.() -> Unit = {}): T =
    SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 *
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.table(
    classes: String? = null,
    crossinline block: TABLE<E>.() -> Unit = {}
): T = TABLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table body
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.tbody(
    classes: String? = null,
    crossinline block: TBODY<E>.() -> Unit = {}
): T = TBODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table data cell
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.td(classes: String? = null, crossinline block: TD<E>.() -> Unit = {}): T =
    TD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Multi-line text field
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.textArea(
    rows: String? = null,
    cols: String? = null,
    wrap: TextAreaWrap? = null,
    classes: String? = null,
    content: String = ""
): T = TEXTAREA(
    attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes),
    this
).visitAndFinalize(this, { +content })

/**
 * Multi-line text field
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.textArea(
    rows: String? = null,
    cols: String? = null,
    wrap: TextAreaWrap? = null,
    classes: String? = null,
    crossinline block: TEXTAREA<E>.() -> Unit = {}
): T = TEXTAREA(
    attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes),
    this
).visitAndFinalize(this, block)

/**
 * Table footer
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.tfoot(
    classes: String? = null,
    crossinline block: TFOOT<E>.() -> Unit = {}
): T = TFOOT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table header cell
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.th(
    scope: ThScope? = null,
    classes: String? = null,
    crossinline block: TH<E>.() -> Unit = {}
): T = TH(attributesMapOf("scope", scope?.enumEncode(), "class", classes), this).visitAndFinalize(this, block)

/**
 * Table header
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.thead(
    classes: String? = null,
    crossinline block: THEAD<E>.() -> Unit = {}
): T = THEAD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Machine-readable equivalent of date- or time-related data
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.time(
    classes: String? = null,
    crossinline block: TIME<E>.() -> Unit = {}
): T = TIME(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document title
 */
@HtmlTagMarker
fun <T, E, C : TagConsumer<T, E>> C.title(content: String = ""): T =
    TITLE(emptyMap, this).visitAndFinalize(this, { +content })

/**
 * Document title
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.title(crossinline block: TITLE<E>.() -> Unit = {}): T =
    TITLE(emptyMap, this).visitAndFinalize(this, block)

/**
 * Table row
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.tr(classes: String? = null, crossinline block: TR<E>.() -> Unit = {}): T =
    TR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Unordered list
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.ul(classes: String? = null, crossinline block: UL<E>.() -> Unit = {}): T =
    UL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Unordered list
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.htmlVar(
    classes: String? = null,
    crossinline block: VAR<E>.() -> Unit = {}
): T = VAR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Video player
 */
@HtmlTagMarker
inline fun <T, E, C : TagConsumer<T, E>> C.video(
    classes: String? = null,
    crossinline block: VIDEO<E>.() -> Unit = {}
): T = VIDEO(attributesMapOf("class", classes), this).visitAndFinalize(this, block)
