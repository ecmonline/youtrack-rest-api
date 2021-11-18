package online.ecm.youtrack.model

import online.ecm.youtrack.model.SimpleValueActivityItem
import online.ecm.youtrack.model.TextMarkupActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in a `String`-type attribute with the support of markup: `description` in an Issue or IssueWorkItem, and the `text` of the IssueComment. This entity lets you get the rendered text after the change.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 * @param markup 
 */

class TextMarkupActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("removed")
    override val removed: String? = null,

    @JsonProperty("added")
    override val added: String? = null,

    @JsonProperty("markup")
    val markup: String? = null

) : SimpleValueActivityItem(id, dollarType, removed, added)

