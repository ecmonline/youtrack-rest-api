package online.ecm.youtrack.model

import online.ecm.youtrack.model.BackupError

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the current status of the backup process.
 *
 * @param backupInProgress 
 * @param backupCancelled 
 * @param backupError 
 * @param id 
 * @param dollarType 
 */
class BackupStatus (

    @JsonProperty("backupInProgress")
    val backupInProgress: Boolean? = null,
    @JsonProperty("backupCancelled")
    val backupCancelled: Boolean? = null,
    @JsonProperty("backupError")
    val backupError: BackupError? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

