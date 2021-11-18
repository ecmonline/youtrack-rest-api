package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the backup file.
 *
 * @param name 
 * @param propertySize 
 * @param creationDate 
 * @param link 
 * @param id 
 * @param dollarType 
 */
class BackupFile (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("size")
    val propertySize: Long? = null,
    @JsonProperty("creationDate")
    val creationDate: Long? = null,
    @JsonProperty("link")
    val link: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

