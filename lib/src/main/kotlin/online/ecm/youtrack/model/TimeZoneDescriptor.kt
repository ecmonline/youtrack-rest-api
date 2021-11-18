package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a time zone.
 *
 * @param presentation 
 * @param offset 
 * @param id 
 * @param dollarType 
 */
class TimeZoneDescriptor (

    @JsonProperty("presentation")
    val presentation: String? = null,
    @JsonProperty("offset")
    val offset: Int? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

