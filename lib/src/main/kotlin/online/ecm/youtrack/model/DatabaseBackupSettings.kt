/**
 * YouTrack REST API
 *
 * YouTrack issue tracking and project management system
 *
 * The version of the OpenAPI document: 2021.3
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class DatabaseBackupSettings (

    @get:JsonProperty("location")
    val location: kotlin.String? = null,
    @get:JsonProperty("filesToKeep")
    val filesToKeep: kotlin.Int? = null,
    @get:JsonProperty("cronExpression")
    val cronExpression: kotlin.String? = null,
    @get:JsonProperty("archiveFormat")
    val archiveFormat: ArchiveFormat? = null,
    @get:JsonProperty("isOn")
    val isOn: kotlin.Boolean? = null,
    @get:JsonProperty("availableDiskSpace")
    val availableDiskSpace: kotlin.Long? = null,
    @get:JsonProperty("notifiedUsers")
    val notifiedUsers: kotlin.collections.List<User>? = null,
    @get:JsonProperty("backupStatus")
    val backupStatus: BackupStatus? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null
)

