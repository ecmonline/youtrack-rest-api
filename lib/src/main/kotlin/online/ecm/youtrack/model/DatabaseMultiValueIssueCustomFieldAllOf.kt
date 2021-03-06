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

import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param projectCustomField 
 * @param `value` 
 */

data class DatabaseMultiValueIssueCustomFieldAllOf (

    @field:JsonProperty("projectCustomField")
    val projectCustomField: ProjectCustomField? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.Any? = null

)

