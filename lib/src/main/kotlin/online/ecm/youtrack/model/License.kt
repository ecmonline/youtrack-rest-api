package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the current license of the YouTrack service.
 *
 * @param username 
 * @param license 
 * @param error 
 * @param id 
 * @param dollarType 
 */
class License (

    @JsonProperty("username")
    val username: String? = null,
    @JsonProperty("license")
    val license: String? = null,
    @JsonProperty("error")
    val error: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

