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

import online.ecm.youtrack.model.ExternalIssue
import online.ecm.youtrack.model.IssueAttachment
import online.ecm.youtrack.model.IssueComment
import online.ecm.youtrack.model.IssueCustomField
import online.ecm.youtrack.model.IssueLink
import online.ecm.youtrack.model.IssueTag
import online.ecm.youtrack.model.IssueVoters
import online.ecm.youtrack.model.IssueWatchers
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.Visibility

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an issue in YouTrack.
 *
 * @param idReadable 
 * @param created 
 * @param updated 
 * @param resolved 
 * @param numberInProject 
 * @param project 
 * @param summary 
 * @param description 
 * @param usesMarkdown 
 * @param wikifiedDescription 
 * @param reporter 
 * @param updater 
 * @param draftOwner 
 * @param isDraft 
 * @param visibility 
 * @param votes 
 * @param comments 
 * @param commentsCount 
 * @param tags 
 * @param links 
 * @param externalIssue 
 * @param customFields 
 * @param voters 
 * @param watchers 
 * @param attachments 
 * @param subtasks 
 * @param parent 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class Issue (

    @get:JsonProperty("idReadable")
    open val idReadable: kotlin.String? = null,
    @get:JsonProperty("created")
    open val created: kotlin.Long? = null,
    @get:JsonProperty("updated")
    open val updated: kotlin.Long? = null,
    @get:JsonProperty("resolved")
    val resolved: kotlin.Long? = null,
    @get:JsonProperty("numberInProject")
    val numberInProject: kotlin.Long? = null,
    @get:JsonProperty("project")
    val project: Project? = null,
    @get:JsonProperty("summary")
    val summary: kotlin.String? = null,
    @get:JsonProperty("description")
    val description: kotlin.String? = null,
    @get:JsonProperty("usesMarkdown")
    val usesMarkdown: kotlin.Boolean? = null,
    @get:JsonProperty("wikifiedDescription")
    val wikifiedDescription: kotlin.String? = null,
    @get:JsonProperty("reporter")
    val reporter: User? = null,
    @get:JsonProperty("updater")
    val updater: User? = null,
    @get:JsonProperty("draftOwner")
    val draftOwner: User? = null,
    @get:JsonProperty("isDraft")
    val isDraft: kotlin.Boolean? = null,
    @get:JsonProperty("visibility")
    val visibility: Visibility? = null,
    @get:JsonProperty("votes")
    val votes: kotlin.Int? = null,
    @get:JsonProperty("comments")
    val comments: kotlin.collections.List<IssueComment>? = null,
    @get:JsonProperty("commentsCount")
    val commentsCount: kotlin.Int? = null,
    @get:JsonProperty("tags")
    val tags: kotlin.collections.List<IssueTag>? = null,
    @get:JsonProperty("links")
    val links: kotlin.collections.List<IssueLink>? = null,
    @get:JsonProperty("externalIssue")
    val externalIssue: ExternalIssue? = null,
    @get:JsonProperty("customFields")
    val customFields: kotlin.collections.List<IssueCustomField>? = null,
    @get:JsonProperty("voters")
    val voters: IssueVoters? = null,
    @get:JsonProperty("watchers")
    val watchers: IssueWatchers? = null,
    @get:JsonProperty("attachments")
    val attachments: kotlin.collections.List<IssueAttachment>? = null,
    @get:JsonProperty("subtasks")
    val subtasks: IssueLink? = null,
    @get:JsonProperty("parent")
    val parent: IssueLink? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

