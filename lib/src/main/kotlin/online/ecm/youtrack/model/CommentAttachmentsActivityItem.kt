package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommentAttachmentsActivityItemAllOf
import online.ecm.youtrack.model.IssueAttachment
import online.ecm.youtrack.model.IssueComment
import online.ecm.youtrack.model.MultiValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the `attachments` attribute of an IssueComment.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class CommentAttachmentsActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueComment? = null,

    @JsonProperty("removed")
    val removed: List<IssueAttachment>? = null,

    @JsonProperty("added")
    val added: List<IssueAttachment>? = null

) : MultiValueActivityItem(id, dollarType)

