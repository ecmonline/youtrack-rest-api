package online.ecm.youtrack.model

import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param targetMember 
 * @param targetSubMember 
 * @param removed 
 * @param added 
 */

class VisibilityGroupActivityItemAllOf (

    @JsonProperty("targetMember")
    val targetMember: String? = null,

    @JsonProperty("targetSubMember")
    val targetSubMember: String? = null,

    @JsonProperty("removed")
    val removed: List<UserGroup>? = null,

    @JsonProperty("added")
    val added: List<UserGroup>? = null

)

