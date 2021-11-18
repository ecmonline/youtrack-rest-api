package online.ecm.youtrack.model

import online.ecm.youtrack.model.Agile
import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a sprint that is associated with an agile board. Each sprint can include issues from one or more projects.
 *
 * @param agile 
 * @param name 
 * @param goal 
 * @param start 
 * @param finish 
 * @param archived 
 * @param isDefault 
 * @param issues 
 * @param unresolvedIssuesCount 
 * @param previousSprint 
 * @param id 
 * @param dollarType 
 */
class Sprint (

    @JsonProperty("agile")
    val agile: Agile? = null,
    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("goal")
    val goal: String? = null,
    @JsonProperty("start")
    val start: Long? = null,
    @JsonProperty("finish")
    val finish: Long? = null,
    @JsonProperty("archived")
    val archived: Boolean? = null,
    @JsonProperty("isDefault")
    val isDefault: Boolean? = null,
    @JsonProperty("issues")
    val issues: List<Issue>? = null,
    @JsonProperty("unresolvedIssuesCount")
    val unresolvedIssuesCount: Int? = null,
    @JsonProperty("previousSprint")
    val previousSprint: Sprint? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

