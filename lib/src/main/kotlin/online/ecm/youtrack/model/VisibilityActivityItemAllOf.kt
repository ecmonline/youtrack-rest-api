package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param targetMember 
 */

class VisibilityActivityItemAllOf (

    @JsonProperty("targetMember")
    val targetMember: String? = null

)

