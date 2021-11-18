package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: List<IssueWorkItem>? = null,

    @JsonProperty("added")
    val added: List<IssueWorkItem>? = null

)

