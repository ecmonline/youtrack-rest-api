package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Base entity for different swimlane settings
 *
 * @param enabled 
 * @param id 
 * @param dollarType 
 */
open class SwimlaneSettings (

    @JsonProperty("enabled")
    open val enabled: Boolean? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

