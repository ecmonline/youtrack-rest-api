package online.ecm.youtrack.model

import online.ecm.youtrack.model.DurationValue
import online.ecm.youtrack.model.IssueWorkItem
import online.ecm.youtrack.model.SingleValueActivityItem
import online.ecm.youtrack.model.WorkItemDurationActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the `duration` attribute of a work item.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class WorkItemDurationActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: IssueWorkItem? = null,

    @JsonProperty("removed")
    val removed: DurationValue? = null,

    @JsonProperty("added")
    val added: DurationValue? = null

) : SingleValueActivityItem(id, dollarType)

