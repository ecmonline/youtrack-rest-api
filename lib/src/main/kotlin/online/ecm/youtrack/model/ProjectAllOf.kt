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

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param startingNumber 
 * @param shortName 
 * @param description 
 * @param leader 
 * @param createdBy 
 * @param issues 
 * @param customFields 
 * @param archived 
 * @param fromEmail 
 * @param replyToEmail 
 * @param template 
 * @param iconUrl 
 * @param team 
 */

data class ProjectAllOf (

    @field:JsonProperty("startingNumber")
    val startingNumber: kotlin.Long? = null,

    @field:JsonProperty("shortName")
    val shortName: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("leader")
    val leader: User? = null,

    @field:JsonProperty("createdBy")
    val createdBy: User? = null,

    @field:JsonProperty("issues")
    val issues: kotlin.collections.List<Issue>? = null,

    @field:JsonProperty("customFields")
    val customFields: kotlin.Any? = null,

    @field:JsonProperty("archived")
    val archived: kotlin.Boolean? = null,

    @field:JsonProperty("fromEmail")
    val fromEmail: kotlin.String? = null,

    @field:JsonProperty("replyToEmail")
    val replyToEmail: kotlin.String? = null,

    @field:JsonProperty("template")
    val template: kotlin.Boolean? = null,

    @field:JsonProperty("iconUrl")
    val iconUrl: kotlin.String? = null,

    @field:JsonProperty("team")
    val team: UserGroup? = null

)

