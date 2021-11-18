package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a language locale that is used in UI.
 *
 * @param locale 
 * @param language 
 * @param community 
 * @param name 
 * @param id 
 * @param dollarType 
 */
class LocaleDescriptor (

    @JsonProperty("locale")
    val locale: String? = null,
    @JsonProperty("language")
    val language: String? = null,
    @JsonProperty("community")
    val community: Boolean? = null,
    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

