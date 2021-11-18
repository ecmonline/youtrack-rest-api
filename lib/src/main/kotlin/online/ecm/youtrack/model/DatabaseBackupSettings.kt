package online.ecm.youtrack.model

import online.ecm.youtrack.model.BackupStatus
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents database backup settings of the YouTrack instance.
 *
 * @param location 
 * @param filesToKeep 
 * @param cronExpression 
 * @param archiveFormat 
 * @param isOn 
 * @param availableDiskSpace 
 * @param notifiedUsers 
 * @param backupStatus 
 * @param id 
 * @param dollarType 
 */
class DatabaseBackupSettings (

    @JsonProperty("location")
    val location: String? = null,
    @JsonProperty("filesToKeep")
    val filesToKeep: Int? = null,
    @JsonProperty("cronExpression")
    val cronExpression: String? = null,
    @JsonProperty("archiveFormat")
    val archiveFormat: ArchiveFormat? = null,
    @JsonProperty("isOn")
    val isOn: Boolean? = null,
    @JsonProperty("availableDiskSpace")
    val availableDiskSpace: Long? = null,
    @JsonProperty("notifiedUsers")
    val notifiedUsers: List<User>? = null,
    @JsonProperty("backupStatus")
    val backupStatus: BackupStatus? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

enum class ArchiveFormat(val value: String) {
    @JsonProperty(value = "TAR_GZ")
    TARGZ("TAR_GZ"),
    @JsonProperty(value = "ZIP")
    ZIP("ZIP");
}
