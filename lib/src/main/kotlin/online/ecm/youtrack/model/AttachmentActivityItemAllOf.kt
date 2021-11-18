package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueAttachment

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class AttachmentActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueAttachment? = null,

    @JsonProperty("removed")
    val removed: List<IssueAttachment>? = null,

    @JsonProperty("added")
    val added: List<IssueAttachment>? = null

)

