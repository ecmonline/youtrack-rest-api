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

import online.ecm.youtrack.model.IssueWatcher

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents users that are subscribed to notifications about the issue.
 *
 * @param hasStar 
 * @param issueWatchers 
 * @param duplicateWatchers 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class IssueWatchers (

    @get:JsonProperty("hasStar")
    val hasStar: kotlin.Boolean? = null,
    @get:JsonProperty("issueWatchers")
    val issueWatchers: kotlin.collections.List<IssueWatcher>? = null,
    @get:JsonProperty("duplicateWatchers")
    val duplicateWatchers: kotlin.collections.List<IssueWatcher>? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

