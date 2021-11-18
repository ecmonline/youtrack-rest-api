package online.ecm.youtrack.model

import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueCreatedActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an event when a user creates a new issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class IssueCreatedActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<Issue>? = null,

    @JsonProperty("added")
    val added: List<Issue>? = null

) : CreatedDeletedActivityItem(id, dollarType)

