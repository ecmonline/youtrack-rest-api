package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.SingleValueActivityItem
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.WorkItemAuthorActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the `author` attribute of a work item.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemAuthorActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: User? = null,

    @JsonProperty("added")
    val added: User? = null

) : SingleValueActivityItem(id, dollarType)

