package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the period field value.
 *
 * @param minutes 
 * @param presentation 
 * @param id 
 * @param dollarType 
 */
class PeriodValue (

    @JsonProperty("minutes")
    val minutes: Int? = null,
    @JsonProperty("presentation")
    val presentation: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

