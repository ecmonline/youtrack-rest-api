package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a value of the text field. Returns both source and rendered text.
 *
 * @param text 
 * @param markdownText 
 * @param id 
 * @param dollarType 
 */
class TextFieldValue (

    @JsonProperty("text")
    val text: String? = null,
    @JsonProperty("markdownText")
    val markdownText: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

