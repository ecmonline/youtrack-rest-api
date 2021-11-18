package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.MultiValueActivityItem
import online.ecm.youtrack.model.Sprint
import online.ecm.youtrack.model.SprintActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the issue when it was added to or removed from an agile board sprint.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class SprintActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<Sprint>? = null,

    @JsonProperty("added")
    val added: List<Sprint>? = null

) : MultiValueActivityItem(id, dollarType)

