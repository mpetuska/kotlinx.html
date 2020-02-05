package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class FIELDSET(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("fieldset", consumer, initialAttributes, null, false, false), HtmlBlockTag {
    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}
/**
 * Fieldset legend
 */
@HtmlTagMarker
inline fun FIELDSET.legend(classes : String? = null, crossinline block : LEGEND.() -> Unit = {}) : Unit = LEGEND(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class FIGCAPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("figcaption", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class FIGURE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("figure", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}
/**
 * Fieldset legend
 */
@HtmlTagMarker
inline fun FIGURE.legend(classes : String? = null, crossinline block : LEGEND.() -> Unit = {}) : Unit = LEGEND(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Caption for 
 */
@HtmlTagMarker
inline fun FIGURE.figcaption(classes : String? = null, crossinline block : FIGCAPTION.() -> Unit = {}) : Unit = FIGCAPTION(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class FOOTER(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("footer", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class FORM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("form", consumer, initialAttributes, null, false, false), HtmlBlockTag {
    var acceptCharset : String
        get()  = attributeStringString.get(this, "accept-charset")
        set(newValue) {attributeStringString.set(this, "accept-charset", newValue)}

    var action : String
        get()  = attributeStringString.get(this, "action")
        set(newValue) {attributeStringString.set(this, "action", newValue)}

    var autoComplete : Boolean
        get()  = attributeBooleanBooleanOnOff.get(this, "autocomplete")
        set(newValue) {attributeBooleanBooleanOnOff.set(this, "autocomplete", newValue)}

    var encType : FormEncType
        get()  = attributeFormEncTypeEnumFormEncTypeValues.get(this, "enctype")
        set(newValue) {attributeFormEncTypeEnumFormEncTypeValues.set(this, "enctype", newValue)}

    var method : FormMethod
        get()  = attributeFormMethodEnumFormMethodValues.get(this, "method")
        set(newValue) {attributeFormMethodEnumFormMethodValues.set(this, "method", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var novalidate : Boolean
        get()  = attributeBooleanTicker.get(this, "novalidate")
        set(newValue) {attributeBooleanTicker.set(this, "novalidate", newValue)}

    var target : String
        get()  = attributeStringString.get(this, "target")
        set(newValue) {attributeStringString.set(this, "target", newValue)}


}

