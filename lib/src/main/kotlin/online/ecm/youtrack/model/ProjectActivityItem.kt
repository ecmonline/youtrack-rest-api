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

import online.ecm.youtrack.model.CustomFieldActivityItemAllOf
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.SingleValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the change in the project attribute on an Issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

data class ProjectActivityItem (

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("target")
    val target: Issue? = null,

    @field:JsonProperty("removed")
    val removed: kotlin.Any? = null,

    @field:JsonProperty("added")
    val added: kotlin.Any? = null

) : SingleValueActivityItem(id, dollarType)

