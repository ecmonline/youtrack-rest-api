package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the Resource Sharing (CORS) configuration of the service.
 *
 * @param allowedOrigins 
 * @param allowAllOrigins 
 * @param id 
 * @param dollarType 
 */
class RestCorsSettings (

    @JsonProperty("allowedOrigins")
    val allowedOrigins: String? = null,
    @JsonProperty("allowAllOrigins")
    val allowAllOrigins: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

