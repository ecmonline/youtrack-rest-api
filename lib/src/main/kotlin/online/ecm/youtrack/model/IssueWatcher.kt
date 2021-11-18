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

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a user who subscribed for notifications about an issue.
 *
 * @param user 
 * @param issue 
 * @param isStarred 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
interface IssueWatcher {

    @get:JsonProperty("user")
    val user: User?
    @get:JsonProperty("issue")
    val issue: Issue?
    @get:JsonProperty("isStarred")
    val isStarred: kotlin.Boolean?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

