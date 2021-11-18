package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the duration value and its visual presentation.
 *
 * @param minutes 
 * @param presentation 
 * @param id 
 * @param dollarType 
 */
class DurationValue (

    @JsonProperty("minutes")
    val minutes: Int? = null,
    @JsonProperty("presentation")
    val presentation: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

