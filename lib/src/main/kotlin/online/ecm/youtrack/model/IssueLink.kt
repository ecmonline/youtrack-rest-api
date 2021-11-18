package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueLinkType

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents issue links of a particular link type (for example, 'relates to').
 *
 * @param direction
 * @param linkType
 * @param issues
 * @param trimmedIssues
 * @param id
 * @param dollarType
 */
class IssueLink(

    @JsonProperty("direction")
    val direction: Direction? = null,
    @JsonProperty("linkType")
    val linkType: IssueLinkType? = null,
    @JsonProperty("issues")
    val issues: List<Issue>? = null,
    @JsonProperty("trimmedIssues")
    val trimmedIssues: List<Issue>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)


enum class Direction(val value: String) {
    @JsonProperty(value = "OUTWARD")
    OUTWARD("OUTWARD"),
    @JsonProperty(value = "INWARD")
    INWARD("INWARD"),
    @JsonProperty(value = "BOTH")
    BOTH("BOTH");
}

