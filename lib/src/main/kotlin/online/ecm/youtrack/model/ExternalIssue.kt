package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * For an issue that was imported from another service, represents the reference to the issue in the external system.
 *
 * @param name 
 * @param url 
 * @param key 
 * @param id 
 * @param dollarType 
 */
class ExternalIssue (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("url")
    val url: String? = null,
    @JsonProperty("key")
    val key: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

