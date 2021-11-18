package online.ecm.youtrack.model

import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.WorkItemActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in a list of work items in an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: List<IssueWorkItem>? = null,

    @JsonProperty("added")
    val added: List<IssueWorkItem>? = null

) : CreatedDeletedActivityItem(id, dollarType)

