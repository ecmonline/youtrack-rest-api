package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param target 
 * @param removed 
 * @param added 
 * @param markup 
 */

class TextCustomFieldActivityItemAllOf (

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: String? = null,

    @JsonProperty("added")
    val added: String? = null,

    @JsonProperty("markup")
    val markup: String? = null

)

