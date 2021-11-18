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
    JsonSubTypes.Type(value = IssueImpl::class, name = "Issue")
)
interface Issue {

    @get:JsonProperty("idReadable")
    val idReadable: kotlin.String?
    @get:JsonProperty("created")
    val created: kotlin.Long?
    @get:JsonProperty("updated")
    val updated: kotlin.Long?
    @get:JsonProperty("resolved")
    val resolved: kotlin.Long?
    @get:JsonProperty("numberInProject")
    val numberInProject: kotlin.Long?
    @get:JsonProperty("project")
    val project: Project?
    @get:JsonProperty("summary")
    val summary: kotlin.String?
    @get:JsonProperty("description")
    val description: kotlin.String?
    @get:JsonProperty("usesMarkdown")
    val usesMarkdown: kotlin.Boolean?
    @get:JsonProperty("wikifiedDescription")
    val wikifiedDescription: kotlin.String?
    @get:JsonProperty("reporter")
    val reporter: User?
    @get:JsonProperty("updater")
    val updater: User?
    @get:JsonProperty("draftOwner")
    val draftOwner: User?
    @get:JsonProperty("isDraft")
    val isDraft: kotlin.Boolean?
    @get:JsonProperty("visibility")
    val visibility: Visibility?
    @get:JsonProperty("votes")
    val votes: kotlin.Int?
    @get:JsonProperty("comments")
    val comments: kotlin.collections.List<IssueComment>?
    @get:JsonProperty("commentsCount")
    val commentsCount: kotlin.Int?
    @get:JsonProperty("tags")
    val tags: kotlin.collections.List<IssueTag>?
    @get:JsonProperty("links")
    val links: kotlin.collections.List<IssueLink>?
    @get:JsonProperty("externalIssue")
    val externalIssue: ExternalIssue?
    @get:JsonProperty("customFields")
    val customFields: kotlin.collections.List<IssueCustomField>?
    @get:JsonProperty("voters")
    val voters: IssueVoters?
    @get:JsonProperty("watchers")
    val watchers: IssueWatchers?
    @get:JsonProperty("attachments")
    val attachments: kotlin.collections.List<IssueAttachment>?
    @get:JsonProperty("subtasks")
    val subtasks: IssueLink?
    @get:JsonProperty("parent")
    val parent: IssueLink?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

