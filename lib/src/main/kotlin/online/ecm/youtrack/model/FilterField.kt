package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an issue property, which can be a predefined field, a custom field, a link, and so on.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 */
open class FilterField (

    @JsonProperty("name")
    open val name: String? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

