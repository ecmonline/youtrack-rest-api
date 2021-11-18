package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueAttachment
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.Visibility

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an existing issue comment.
 *
 * @param text 
 * @param usesMarkdown 
 * @param textPreview 
 * @param created 
 * @param updated 
 * @param author 
 * @param issue 
 * @param attachments 
 * @param visibility 
 * @param deleted 
 * @param id 
 * @param dollarType 
 */
class IssueComment (

    @JsonProperty("text")
    val text: String? = null,
    @JsonProperty("usesMarkdown")
    val usesMarkdown: Boolean? = null,
    @JsonProperty("textPreview")
    val textPreview: String? = null,
    @JsonProperty("created")
    val created: Long? = null,
    @JsonProperty("updated")
    val updated: Long? = null,
    @JsonProperty("author")
    val author: User? = null,
    @JsonProperty("issue")
    val issue: Issue? = null,
    @JsonProperty("attachments")
    val attachments: List<IssueAttachment>? = null,
    @JsonProperty("visibility")
    val visibility: Visibility? = null,
    @JsonProperty("deleted")
    val deleted: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

