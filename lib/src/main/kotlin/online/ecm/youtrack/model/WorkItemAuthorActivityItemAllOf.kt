package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemAuthorActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: User? = null,

    @JsonProperty("added")
    val added: User? = null

)

