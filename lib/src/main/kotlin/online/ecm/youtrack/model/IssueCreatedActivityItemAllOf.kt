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

class IssueCreatedActivityItemAllOf (

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<Issue>? = null,

    @JsonProperty("added")
    val added: List<Issue>? = null

)

