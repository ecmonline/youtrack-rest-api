package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomFieldActivityItem
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.TextCustomFieldActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an activity that affects a custom field of the `text` type of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 * @param markup 
 */

class TextCustomFieldActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    override val target: Issue? = null,

    @JsonProperty("removed")
    override val removed: String? = null,

    @JsonProperty("added")
    override val added: String? = null,

    @JsonProperty("markup")
    val markup: String? = null

) : CustomFieldActivityItem(id, dollarType, target, removed, added)

