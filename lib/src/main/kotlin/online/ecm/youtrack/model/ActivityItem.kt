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
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a change in an issue or in its related entities. In the UI, you see these changes as the Activity stream. It shows a feed of all updates of the issue: issue history, comments, attachments, VCS changes, work items, and so on.
 *
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
    JsonSubTypes.Type(value = AttachmentActivityItem::class, name = "AttachmentActivityItem"),
    JsonSubTypes.Type(value = CommentActivityItem::class, name = "CommentActivityItem"),
    JsonSubTypes.Type(value = CommentAttachmentsActivityItem::class, name = "CommentAttachmentsActivityItem"),
    JsonSubTypes.Type(value = CreatedDeletedActivityItem::class, name = "CreatedDeletedActivityItem"),
    JsonSubTypes.Type(value = CustomFieldActivityItem::class, name = "CustomFieldActivityItem"),
    JsonSubTypes.Type(value = IssueCreatedActivityItem::class, name = "IssueCreatedActivityItem"),
    JsonSubTypes.Type(value = IssueResolvedActivityItem::class, name = "IssueResolvedActivityItem"),
    JsonSubTypes.Type(value = LinksActivityItem::class, name = "LinksActivityItem"),
    JsonSubTypes.Type(value = MultiValueActivityItem::class, name = "MultiValueActivityItem"),
    JsonSubTypes.Type(value = ProjectActivityItem::class, name = "ProjectActivityItem"),
    JsonSubTypes.Type(value = SimpleValueActivityItem::class, name = "SimpleValueActivityItem"),
    JsonSubTypes.Type(value = SingleValueActivityItem::class, name = "SingleValueActivityItem"),
    JsonSubTypes.Type(value = SprintActivityItem::class, name = "SprintActivityItem"),
    JsonSubTypes.Type(value = TagsActivityItem::class, name = "TagsActivityItem"),
    JsonSubTypes.Type(value = TextCustomFieldActivityItem::class, name = "TextCustomFieldActivityItem"),
    JsonSubTypes.Type(value = TextMarkupActivityItem::class, name = "TextMarkupActivityItem"),
    JsonSubTypes.Type(value = UsesMarkupActivityItem::class, name = "UsesMarkupActivityItem"),
    JsonSubTypes.Type(value = VcsChangeActivityItem::class, name = "VcsChangeActivityItem"),
    JsonSubTypes.Type(value = VisibilityActivityItem::class, name = "VisibilityActivityItem"),
    JsonSubTypes.Type(value = VisibilityGroupActivityItem::class, name = "VisibilityGroupActivityItem"),
    JsonSubTypes.Type(value = VisibilityUserActivityItem::class, name = "VisibilityUserActivityItem"),
    JsonSubTypes.Type(value = VotersActivityItem::class, name = "VotersActivityItem"),
    JsonSubTypes.Type(value = WorkItemActivityItem::class, name = "WorkItemActivityItem"),
    JsonSubTypes.Type(value = WorkItemAuthorActivityItem::class, name = "WorkItemAuthorActivityItem"),
    JsonSubTypes.Type(value = WorkItemDurationActivityItem::class, name = "WorkItemDurationActivityItem"),
    JsonSubTypes.Type(value = WorkItemTypeActivityItem::class, name = "WorkItemTypeActivityItem")
)
open class ActivityItem (

    @get:JsonProperty("id")
    open val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    open val dollarType: kotlin.String? = null,
)

