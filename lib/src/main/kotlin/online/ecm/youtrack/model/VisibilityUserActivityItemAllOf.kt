package online.ecm.youtrack.model

import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param targetMember 
 * @param targetSubMember 
 * @param removed 
 * @param added 
 */

class VisibilityUserActivityItemAllOf (

    @JsonProperty("targetMember")
    val targetMember: String? = null,

    @JsonProperty("targetSubMember")
    val targetSubMember: String? = null,

    @JsonProperty("removed")
    val removed: List<User>? = null,

    @JsonProperty("added")
    val added: List<User>? = null

)

