package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an error that appeared during the backup.
 *
 * @param date 
 * @param errorMessage 
 * @param id 
 * @param dollarType 
 */
class BackupError (

    @JsonProperty("date")
    val date: Long? = null,
    @JsonProperty("errorMessage")
    val errorMessage: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

