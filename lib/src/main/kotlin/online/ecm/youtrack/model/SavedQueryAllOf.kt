package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param query 
 * @param issues 
 */

class SavedQueryAllOf (

    @JsonProperty("query")
    val query: String? = null,

    @JsonProperty("issues")
    val issues: List<Issue>? = null

)

