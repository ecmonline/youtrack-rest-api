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

import online.ecm.youtrack.model.DatabaseMultiValueIssueCustomField
import online.ecm.youtrack.model.MultiGroupIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `group` type that can have multiple values.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param `value` 
 */

data class MultiGroupIssueCustomField (

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @field:JsonProperty("value")
    override val `value`: UserGroup? = null

) : DatabaseMultiValueIssueCustomField(id, dollarType, projectCustomField, value)

