package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a vote for duplicates of the issue.
 *
 * @param issue 
 * @param user 
 * @param id 
 * @param dollarType 
 */
class DuplicateVote (

    @JsonProperty("issue")
    val issue: Issue? = null,
    @JsonProperty("user")
    val user: User? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

