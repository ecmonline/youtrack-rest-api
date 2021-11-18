package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents date format.
 *
 * @param presentation 
 * @param pattern 
 * @param datePattern 
 * @param id 
 * @param dollarType 
 */
class DateFormatDescriptor (

    @JsonProperty("presentation")
    val presentation: String? = null,
    @JsonProperty("pattern")
    val pattern: String? = null,
    @JsonProperty("datePattern")
    val datePattern: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

