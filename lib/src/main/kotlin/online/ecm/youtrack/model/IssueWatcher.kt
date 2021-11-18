package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a user who subscribed for notifications about an issue.
 *
 * @param user 
 * @param issue 
 * @param isStarred 
 * @param id 
 * @param dollarType 
 */
class IssueWatcher (

    @JsonProperty("user")
    val user: User? = null,
    @JsonProperty("issue")
    val issue: Issue? = null,
    @JsonProperty("isStarred")
    val isStarred: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

