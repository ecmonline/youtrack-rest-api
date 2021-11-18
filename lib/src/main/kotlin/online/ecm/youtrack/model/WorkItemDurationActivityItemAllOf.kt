package online.ecm.youtrack.model

import online.ecm.youtrack.model.DurationValue
import online.ecm.youtrack.model.IssueWorkItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemDurationActivityItemAllOf (

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: DurationValue? = null,

    @JsonProperty("added")
    val added: DurationValue? = null

)

