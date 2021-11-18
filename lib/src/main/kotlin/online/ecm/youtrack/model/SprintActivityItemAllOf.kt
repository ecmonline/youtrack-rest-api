package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.Sprint

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class SprintActivityItemAllOf (

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<Sprint>? = null,

    @JsonProperty("added")
    val added: List<Sprint>? = null

)

