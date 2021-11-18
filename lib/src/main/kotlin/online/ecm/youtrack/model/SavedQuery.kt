package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.SavedQueryAllOf
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup
import online.ecm.youtrack.model.WatchFolder

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a saved search.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 * @param owner 
 * @param visibleFor 
 * @param updateableBy 
 * @param query 
 * @param issues 
 */

class SavedQuery (

    @JsonProperty("name")
    override val name: String? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("owner")
    override val owner: User? = null,

    @JsonProperty("visibleFor")
    override val visibleFor: UserGroup? = null,

    @JsonProperty("updateableBy")
    override val updateableBy: UserGroup? = null,

    @JsonProperty("query")
    val query: String? = null,

    @JsonProperty("issues")
    val issues: List<Issue>? = null

) : WatchFolder(name, id, dollarType, owner, visibleFor, updateableBy)

