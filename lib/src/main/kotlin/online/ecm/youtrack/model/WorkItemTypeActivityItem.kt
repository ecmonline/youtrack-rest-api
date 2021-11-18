package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.MultiValueActivityItem
import online.ecm.youtrack.model.WorkItemType
import online.ecm.youtrack.model.WorkItemTypeActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the `type` attribute of the work item.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemTypeActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: List<WorkItemType>? = null,

    @JsonProperty("added")
    val added: List<WorkItemType>? = null

) : MultiValueActivityItem(id, dollarType)

