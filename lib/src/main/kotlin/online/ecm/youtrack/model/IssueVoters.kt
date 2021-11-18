package online.ecm.youtrack.model

import online.ecm.youtrack.model.DuplicateVote
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents users that have voted for the issue or its duplicates.
 *
 * @param hasVote 
 * @param original 
 * @param duplicate 
 * @param id 
 * @param dollarType 
 */
class IssueVoters (

    @JsonProperty("hasVote")
    val hasVote: Boolean? = null,
    @JsonProperty("original")
    val original: List<User>? = null,
    @JsonProperty("duplicate")
    val duplicate: List<DuplicateVote>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

