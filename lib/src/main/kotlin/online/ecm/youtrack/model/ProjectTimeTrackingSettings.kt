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

import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.WorkItemType

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents time tracking settings of the project.
 *
 * @param enabled 
 * @param estimate 
 * @param timeSpent 
 * @param workItemTypes 
 * @param project 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
interface ProjectTimeTrackingSettings {

    @get:JsonProperty("enabled")
    val enabled: kotlin.Boolean?
    @get:JsonProperty("estimate")
    val estimate: ProjectCustomField?
    @get:JsonProperty("timeSpent")
    val timeSpent: ProjectCustomField?
    @get:JsonProperty("workItemTypes")
    val workItemTypes: kotlin.collections.List<WorkItemType>?
    @get:JsonProperty("project")
    val project: Project?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

