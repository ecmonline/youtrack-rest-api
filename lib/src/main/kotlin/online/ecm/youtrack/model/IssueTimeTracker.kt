package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueWorkItem

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents time tracking settings in the issue.
 *
 * @param workItems 
 * @param enabled 
 * @param id 
 * @param dollarType 
 */
class IssueTimeTracker (

    @JsonProperty("workItems")
    val workItems: List<IssueWorkItem>? = null,
    @JsonProperty("enabled")
    val enabled: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

