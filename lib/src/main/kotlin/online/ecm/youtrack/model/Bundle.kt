package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a set of custom field values in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 */
open class Bundle (

    @JsonProperty("isUpdateable")
    open val isUpdateable: Boolean? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

