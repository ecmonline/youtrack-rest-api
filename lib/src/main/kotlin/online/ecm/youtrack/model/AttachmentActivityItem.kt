package online.ecm.youtrack.model

import online.ecm.youtrack.model.AttachmentActivityItemAllOf
import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.IssueAttachment

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the list of attachments of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class AttachmentActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueAttachment? = null,

    @JsonProperty("removed")
    val removed: List<IssueAttachment>? = null,

    @JsonProperty("added")
    val added: List<IssueAttachment>? = null

) : CreatedDeletedActivityItem(id, dollarType)

