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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 */

data class IssueResolvedActivityItemAllOf (

    @field:JsonProperty("removed")
    val removed: kotlin.Long? = null,

    @field:JsonProperty("added")
    val added: kotlin.Long? = null

)

