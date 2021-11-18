package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommentActivityItemAllOf
import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.IssueComment
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the comments of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 * @param authorGroup 
 */

class CommentActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueComment? = null,

    @JsonProperty("removed")
    val removed: List<IssueComment>? = null,

    @JsonProperty("added")
    val added: List<IssueComment>? = null,

    @JsonProperty("authorGroup")
    val authorGroup: UserGroup? = null

) : CreatedDeletedActivityItem(id, dollarType)

