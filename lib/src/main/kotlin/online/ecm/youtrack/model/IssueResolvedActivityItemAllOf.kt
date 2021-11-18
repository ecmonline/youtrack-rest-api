package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 */

class IssueResolvedActivityItemAllOf (

    @JsonProperty("removed")
    val removed: Long? = null,

    @JsonProperty("added")
    val added: Long? = null

)

