package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 */

class CustomFieldActivityItemAllOf (

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: Any? = null,

    @JsonProperty("added")
    val added: Any? = null

)

