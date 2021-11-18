package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueResolvedActivityItemAllOf
import online.ecm.youtrack.model.SimpleValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an event when a user resolves an issue.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 */

class IssueResolvedActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("removed")
    override val removed: Long? = null,

    @JsonProperty("added")
    override val added: Long? = null

) : SimpleValueActivityItem(id, dollarType, removed, added)

