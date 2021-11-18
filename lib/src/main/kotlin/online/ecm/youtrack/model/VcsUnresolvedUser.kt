package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueTag
import online.ecm.youtrack.model.SavedQuery
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserProfiles
import online.ecm.youtrack.model.VcsUnresolvedUserAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an author of a VCS change that could not be found in the list of YouTrack users.
 *
 * @param login 
 * @param fullName 
 * @param email 
 * @param jabberAccountName 
 * @param ringId 
 * @param guest 
 * @param online 
 * @param banned 
 * @param tags 
 * @param savedQueries 
 * @param avatarUrl 
 * @param profiles 
 * @param id 
 * @param dollarType 
 * @param name 
 */

class VcsUnresolvedUser (

    @JsonProperty("login")
    override val login: String? = null,

    @JsonProperty("fullName")
    override val fullName: String? = null,

    @JsonProperty("email")
    override val email: String? = null,

    @JsonProperty("jabberAccountName")
    override val jabberAccountName: String? = null,

    @JsonProperty("ringId")
    override val ringId: String? = null,

    @JsonProperty("guest")
    override val guest: Boolean? = null,

    @JsonProperty("online")
    override val online: Boolean? = null,

    @JsonProperty("banned")
    override val banned: Boolean? = null,

    @JsonProperty("tags")
    override val tags: List<IssueTag>? = null,

    @JsonProperty("savedQueries")
    override val savedQueries: List<SavedQuery>? = null,

    @JsonProperty("avatarUrl")
    override val avatarUrl: String? = null,

    @JsonProperty("profiles")
    override val profiles: UserProfiles? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("name")
    val name: String? = null

) : User(
    login,
    fullName,
    email,
    jabberAccountName,
    ringId,
    guest,
    online,
    banned,
    tags,
    savedQueries,
    avatarUrl,
    profiles,
    id,
    dollarType
)

