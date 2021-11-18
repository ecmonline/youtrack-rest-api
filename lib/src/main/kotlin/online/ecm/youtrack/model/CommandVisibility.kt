package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Visibility settings of the comment that is added along with the command.
 *
 * @param id 
 * @param dollarType 
 */
open class CommandVisibility (

    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

