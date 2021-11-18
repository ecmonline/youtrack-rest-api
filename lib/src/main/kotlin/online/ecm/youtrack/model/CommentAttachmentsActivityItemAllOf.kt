package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueAttachment
import online.ecm.youtrack.model.IssueComment

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class CommentAttachmentsActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueComment? = null,

    @JsonProperty("removed")
    val removed: List<IssueAttachment>? = null,

    @JsonProperty("added")
    val added: List<IssueAttachment>? = null

)

