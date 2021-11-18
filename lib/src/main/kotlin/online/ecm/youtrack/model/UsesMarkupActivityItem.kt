package online.ecm.youtrack.model

import online.ecm.youtrack.model.SimpleValueActivityItem
import online.ecm.youtrack.model.UsesMarkupActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the change of the boolean flag that indicates whether YouTrack Wiki or Markdown is used in the target entity as a markup language. If \"true\", then the markdown is used. Otherwise, YouTrack Wiki markup.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 * @param markup 
 */

class UsesMarkupActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("removed")
    override val removed: Boolean? = null,

    @JsonProperty("added")
    override val added: Boolean? = null,

    @JsonProperty("markup")
    val markup: String? = null

) : SimpleValueActivityItem(id, dollarType, removed, added)

