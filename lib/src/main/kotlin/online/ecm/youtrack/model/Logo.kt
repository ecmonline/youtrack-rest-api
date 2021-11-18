package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Company logo that is used in YouTrack.
 *
 * @param url 
 * @param id 
 * @param dollarType 
 */
class Logo (

    @JsonProperty("url")
    val url: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

