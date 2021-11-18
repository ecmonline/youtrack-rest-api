package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWatcher

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents users that are subscribed to notifications about the issue.
 *
 * @param hasStar 
 * @param issueWatchers 
 * @param duplicateWatchers 
 * @param id 
 * @param dollarType 
 */
class IssueWatchers (

    @JsonProperty("hasStar")
    val hasStar: Boolean? = null,
    @JsonProperty("issueWatchers")
    val issueWatchers: List<IssueWatcher>? = null,
    @JsonProperty("duplicateWatchers")
    val duplicateWatchers: List<IssueWatcher>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

