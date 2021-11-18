package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.WorkItemType

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemTypeActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: List<WorkItemType>? = null,

    @JsonProperty("added")
    val added: List<WorkItemType>? = null

)

