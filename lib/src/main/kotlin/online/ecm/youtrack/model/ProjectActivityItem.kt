package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomFieldActivityItemAllOf
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.SingleValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the change in the project attribute on an Issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class ProjectActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: Any? = null,

    @JsonProperty("added")
    val added: Any? = null

) : SingleValueActivityItem(id, dollarType)

