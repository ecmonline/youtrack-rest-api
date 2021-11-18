package online.ecm.youtrack.model

import online.ecm.youtrack.model.UserGroup
import online.ecm.youtrack.model.VisibilityActivityItem
import online.ecm.youtrack.model.VisibilityGroupActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the event when a user adds or removes a group to/from the Visibility settings of the target entity.
 *
 * @param id 
 * @param dollarType 
 * @param targetMember 
 * @param targetSubMember 
 * @param removed 
 * @param added 
 */

class VisibilityGroupActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("targetMember")
    override val targetMember: String? = null,

    @JsonProperty("targetSubMember")
    val targetSubMember: String? = null,

    @JsonProperty("removed")
    val removed: List<UserGroup>? = null,

    @JsonProperty("added")
    val added: List<UserGroup>? = null

) : VisibilityActivityItem(id, dollarType, targetMember)

