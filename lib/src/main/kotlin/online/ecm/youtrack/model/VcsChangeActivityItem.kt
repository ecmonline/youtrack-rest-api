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

import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.VcsChangeActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an update in the list of VCSChanges of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 * @param author 
 */

data class VcsChangeActivityItem (

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("removed")
    val removed: kotlin.Any? = null,

    @field:JsonProperty("added")
    val added: kotlin.Any? = null,

    @field:JsonProperty("author")
    val author: User? = null

) : CreatedDeletedActivityItem(id, dollarType)

