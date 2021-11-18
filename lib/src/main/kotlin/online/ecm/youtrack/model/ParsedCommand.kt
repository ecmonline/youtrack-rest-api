package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the command that was parsed from the provided query.
 *
 * @param description 
 * @param error 
 * @param delete 
 * @param id 
 * @param dollarType 
 */
class ParsedCommand (

    @JsonProperty("description")
    val description: String? = null,
    @JsonProperty("error")
    val error: Boolean? = null,
    @JsonProperty("delete")
    val delete: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

