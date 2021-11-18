package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents jabber settings for this YouTrack installation.
 *
 * @param isEnabled 
 * @param host 
 * @param port 
 * @param login 
 * @param serviceName 
 * @param id 
 * @param dollarType 
 */
class JabberSettings (

    @JsonProperty("isEnabled")
    val isEnabled: Boolean? = null,
    @JsonProperty("host")
    val host: String? = null,
    @JsonProperty("port")
    val port: Int? = null,
    @JsonProperty("login")
    val login: String? = null,
    @JsonProperty("serviceName")
    val serviceName: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

