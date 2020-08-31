package kotlinx.html

/*******************************************************************************
DO NOT EDIT
This file was generated by module generate
 *******************************************************************************/

@Suppress("unused")
open class OBJECT<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("object", consumer, initialAttributes, null, true, false),
    CommonAttributeGroupFacadeFlowInteractivePhrasingContent<E> {
    var data: String
        get() = attributeStringString.get(this, "data")
        set(newValue) {
            attributeStringString.set(this, "data", newValue)
        }
    
    var type: String
        get() = attributeStringString.get(this, "type")
        set(newValue) {
            attributeStringString.set(this, "type", newValue)
        }
    
    var height: String
        get() = attributeStringString.get(this, "height")
        set(newValue) {
            attributeStringString.set(this, "height", newValue)
        }
    
    var width: String
        get() = attributeStringString.get(this, "width")
        set(newValue) {
            attributeStringString.set(this, "width", newValue)
        }
    
    var usemap: String
        get() = attributeStringString.get(this, "usemap")
        set(newValue) {
            attributeStringString.set(this, "usemap", newValue)
        }
    
    var name: String
        get() = attributeStringString.get(this, "name")
        set(newValue) {
            attributeStringString.set(this, "name", newValue)
        }
    
    var form: String
        get() = attributeStringString.get(this, "form")
        set(newValue) {
            attributeStringString.set(this, "form", newValue)
        }
    
    var classId: String
        get() = attributeStringString.get(this, "classid")
        set(newValue) {
            attributeStringString.set(this, "classid", newValue)
        }
    
    
}

/**
 * Named property value
 */
@HtmlTagMarker
inline fun <E> OBJECT<E>.param(
    name: String? = null,
    value: String? = null,
    crossinline block: PARAM<E>.() -> Unit = {}
): Unit = PARAM(attributesMapOf("name", name, "value", value), consumer).visit(block)

val <E> OBJECT<E>.asFlowContent: FlowContent<E>
    get() = this

val <E> OBJECT<E>.asInteractiveContent: InteractiveContent<E>
    get() = this

val <E> OBJECT<E>.asPhrasingContent: PhrasingContent<E>
    get() = this


@Suppress("unused")
open class OL<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("ol", consumer, initialAttributes, null, false, false), HtmlBlockTag<E> {
    var start: String
        get() = attributeStringString.get(this, "start")
        set(newValue) {
            attributeStringString.set(this, "start", newValue)
        }
    
    var reversed: Boolean
        get() = attributeBooleanTicker.get(this, "reversed")
        set(newValue) {
            attributeBooleanTicker.set(this, "reversed", newValue)
        }
    
    
}

/**
 * List item
 */
@HtmlTagMarker
inline fun <E> OL<E>.li(classes: String? = null, crossinline block: LI<E>.() -> Unit = {}): Unit =
    LI(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class OPTGROUP<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("optgroup", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacade<E> {
    var disabled: Boolean
        get() = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {
            attributeBooleanTicker.set(this, "disabled", newValue)
        }
    
    var label: String
        get() = attributeStringString.get(this, "label")
        set(newValue) {
            attributeStringString.set(this, "label", newValue)
        }
    
    
}

/**
 * Selectable choice
 */
@HtmlTagMarker
inline fun <E> OPTGROUP<E>.option(classes: String? = null, crossinline block: OPTION<E>.() -> Unit = {}): Unit =
    OPTION(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Selectable choice
 */
@HtmlTagMarker
fun <E> OPTGROUP<E>.option(classes: String? = null, content: String = ""): Unit =
    OPTION(attributesMapOf("class", classes), consumer).visit({ +content })


@Suppress("unused")
open class OPTION<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("option", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacade<E> {
    var disabled: Boolean
        get() = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {
            attributeBooleanTicker.set(this, "disabled", newValue)
        }
    
    var selected: Boolean
        get() = attributeBooleanTicker.get(this, "selected")
        set(newValue) {
            attributeBooleanTicker.set(this, "selected", newValue)
        }
    
    var label: String
        get() = attributeStringString.get(this, "label")
        set(newValue) {
            attributeStringString.set(this, "label", newValue)
        }
    
    var value: String
        get() = attributeStringString.get(this, "value")
        set(newValue) {
            attributeStringString.set(this, "value", newValue)
        }
    
    
}

@Suppress("unused")
open class OUTPUT<E>(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*, E>) :
    HTMLTag<E>("output", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag<E> {
    var htmlFor: String
        get() = attributeStringString.get(this, "for")
        set(newValue) {
            attributeStringString.set(this, "for", newValue)
        }
    
    var form: String
        get() = attributeStringString.get(this, "form")
        set(newValue) {
            attributeStringString.set(this, "form", newValue)
        }
    
    var name: String
        get() = attributeStringString.get(this, "name")
        set(newValue) {
            attributeStringString.set(this, "name", newValue)
        }
    
    
}

val <E> OUTPUT<E>.asFlowContent: FlowContent<E>
    get() = this

val <E> OUTPUT<E>.asPhrasingContent: PhrasingContent<E>
    get() = this


