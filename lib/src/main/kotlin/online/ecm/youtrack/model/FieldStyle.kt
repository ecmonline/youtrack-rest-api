package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the style settings of the field in YouTrack.
 *
 * @param background 
 * @param foreground 
 * @param id 
 * @param dollarType 
 */
class FieldStyle (

    @JsonProperty("background")
    val background: String? = null,
    @JsonProperty("foreground")
    val foreground: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

