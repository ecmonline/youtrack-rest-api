package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueTag
import online.ecm.youtrack.model.SavedQuery
import online.ecm.youtrack.model.UserProfiles

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a user in YouTrack. Please note that the read-only properties of a user account, like              credentials, or email and so on, you can only change in               <a href=\"https://www.jetbrains.com/help/youtrack/devportal/? = null,Hub-REST-API\">Hub REST API</a>.
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
 */
open class User (

    @JsonProperty("login")
    open val login: String? = null,
    @JsonProperty("fullName")
    open val fullName: String? = null,
    @JsonProperty("email")
    open val email: String? = null,
    @JsonProperty("jabberAccountName")
    open val jabberAccountName: String? = null,
    @JsonProperty("ringId")
    open val ringId: String? = null,
    @JsonProperty("guest")
    open val guest: Boolean? = null,
    @JsonProperty("online")
    open val online: Boolean? = null,
    @JsonProperty("banned")
    open val banned: Boolean? = null,
    @JsonProperty("tags")
    open val tags: List<IssueTag>? = null,
    @JsonProperty("savedQueries")
    open val savedQueries: List<SavedQuery>? = null,
    @JsonProperty("avatarUrl")
    open val avatarUrl: String? = null,
    @JsonProperty("profiles")
    open val profiles: UserProfiles? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

