package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueComment
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 * @param authorGroup 
 */

class CommentActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueComment? = null,

    @JsonProperty("removed")
    val removed: List<IssueComment>? = null,

    @JsonProperty("added")
    val added: List<IssueComment>? = null,

    @JsonProperty("authorGroup")
    val authorGroup: UserGroup? = null

)

