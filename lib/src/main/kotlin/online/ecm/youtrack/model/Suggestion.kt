package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents query suggestion.
 *
 * @param completionStart 
 * @param completionEnd 
 * @param matchingStart 
 * @param matchingEnd 
 * @param caret 
 * @param description 
 * @param option 
 * @param prefix 
 * @param suffix 
 * @param group 
 * @param icon 
 * @param auxiliaryIcon 
 * @param className 
 * @param id 
 * @param dollarType 
 */
class Suggestion (

    @JsonProperty("completionStart")
    val completionStart: Int? = null,
    @JsonProperty("completionEnd")
    val completionEnd: Int? = null,
    @JsonProperty("matchingStart")
    val matchingStart: Int? = null,
    @JsonProperty("matchingEnd")
    val matchingEnd: Int? = null,
    @JsonProperty("caret")
    val caret: Int? = null,
    @JsonProperty("description")
    val description: String? = null,
    @JsonProperty("option")
    val option: String? = null,
    @JsonProperty("prefix")
    val prefix: String? = null,
    @JsonProperty("suffix")
    val suffix: String? = null,
    @JsonProperty("group")
    val group: String? = null,
    @JsonProperty("icon")
    val icon: String? = null,
    @JsonProperty("auxiliaryIcon")
    val auxiliaryIcon: String? = null,
    @JsonProperty("className")
    val className: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

