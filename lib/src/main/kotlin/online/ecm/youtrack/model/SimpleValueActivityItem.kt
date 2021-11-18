package online.ecm.youtrack.model

import online.ecm.youtrack.model.SimpleValueActivityItemAllOf
import online.ecm.youtrack.model.SingleValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the change in attributes of a simple type in the target entity: Issue, IssueComment, WorkItem, IssueAttachment.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 */

open class SimpleValueActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("removed")
    open val removed: Any? = null,

    @JsonProperty("added")
    open val added: Any? = null

) : SingleValueActivityItem(id, dollarType)

