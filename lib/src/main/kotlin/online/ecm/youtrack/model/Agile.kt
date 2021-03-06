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

import online.ecm.youtrack.model.AgileStatus
import online.ecm.youtrack.model.ColorCoding
import online.ecm.youtrack.model.ColumnSettings
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.Sprint
import online.ecm.youtrack.model.SprintsSettings
import online.ecm.youtrack.model.SwimlaneSettings
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an agile board configuration.
 *
 * @param name 
 * @param owner 
 * @param visibleFor 
 * @param visibleForProjectBased 
 * @param updateableBy 
 * @param updateableByProjectBased 
 * @param orphansAtTheTop 
 * @param hideOrphansSwimlane 
 * @param estimationField 
 * @param originalEstimationField 
 * @param projects 
 * @param sprints 
 * @param currentSprint 
 * @param columnSettings 
 * @param swimlaneSettings 
 * @param sprintsSettings 
 * @param colorCoding 
 * @param status 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class Agile (

    @get:JsonProperty("name")
    val name: kotlin.String? = null,
    @get:JsonProperty("owner")
    val owner: User? = null,
    @get:JsonProperty("visibleFor")
    val visibleFor: UserGroup? = null,
    @get:JsonProperty("visibleForProjectBased")
    val visibleForProjectBased: kotlin.Boolean? = null,
    @get:JsonProperty("updateableBy")
    val updateableBy: UserGroup? = null,
    @get:JsonProperty("updateableByProjectBased")
    val updateableByProjectBased: kotlin.Boolean? = null,
    @get:JsonProperty("orphansAtTheTop")
    val orphansAtTheTop: kotlin.Boolean? = null,
    @get:JsonProperty("hideOrphansSwimlane")
    val hideOrphansSwimlane: kotlin.Boolean? = null,
    @get:JsonProperty("estimationField")
    val estimationField: CustomField? = null,
    @get:JsonProperty("originalEstimationField")
    val originalEstimationField: CustomField? = null,
    @get:JsonProperty("projects")
    val projects: kotlin.collections.List<Project>? = null,
    @get:JsonProperty("sprints")
    val sprints: kotlin.collections.List<Sprint>? = null,
    @get:JsonProperty("currentSprint")
    val currentSprint: Sprint? = null,
    @get:JsonProperty("columnSettings")
    val columnSettings: ColumnSettings? = null,
    @get:JsonProperty("swimlaneSettings")
    val swimlaneSettings: SwimlaneSettings? = null,
    @get:JsonProperty("sprintsSettings")
    val sprintsSettings: SprintsSettings? = null,
    @get:JsonProperty("colorCoding")
    val colorCoding: ColorCoding? = null,
    @get:JsonProperty("status")
    val status: AgileStatus? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

