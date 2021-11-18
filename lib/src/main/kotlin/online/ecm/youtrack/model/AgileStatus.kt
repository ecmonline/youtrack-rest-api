package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Shows if the board has any configuration problems.
 *
 * @param valid 
 * @param hasJobs 
 * @param errors 
 * @param warnings 
 * @param id 
 * @param dollarType 
 */
class AgileStatus (

    @JsonProperty("valid")
    val valid: Boolean? = null,
    @JsonProperty("hasJobs")
    val hasJobs: Boolean? = null,
    @JsonProperty("errors")
    val errors: String? = null,
    @JsonProperty("warnings")
    val warnings: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

