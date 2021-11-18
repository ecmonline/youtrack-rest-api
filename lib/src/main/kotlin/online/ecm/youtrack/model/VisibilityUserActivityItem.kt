package online.ecm.youtrack.model

import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.VisibilityActivityItem
import online.ecm.youtrack.model.VisibilityUserActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the event when a user adds or removes a user to/from the Visibility settings of the target entity.
 *
 * @param id 
 * @param dollarType 
 * @param targetMember 
 * @param targetSubMember 
 * @param removed 
 * @param added 
 */

class VisibilityUserActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("targetMember")
    override val targetMember: String? = null,

    @JsonProperty("targetSubMember")
    val targetSubMember: String? = null,

    @JsonProperty("removed")
    val removed: List<User>? = null,

    @JsonProperty("added")
    val added: List<User>? = null

) : VisibilityActivityItem(id, dollarType, targetMember)

