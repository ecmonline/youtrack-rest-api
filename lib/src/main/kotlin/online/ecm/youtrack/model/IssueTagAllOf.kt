package online.ecm.youtrack.model

import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param issues 
 * @param color 
 * @param untagOnResolve 
 */

class IssueTagAllOf (

    @JsonProperty("issues")
    val issues: List<Issue>? = null,

    @JsonProperty("color")
    val color: FieldStyle? = null,

    @JsonProperty("untagOnResolve")
    val untagOnResolve: Boolean? = null

)

