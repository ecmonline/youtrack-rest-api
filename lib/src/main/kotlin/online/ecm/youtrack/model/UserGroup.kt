package online.ecm.youtrack.model

import online.ecm.youtrack.model.Project

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a group of users.
 *
 * @param name 
 * @param ringId 
 * @param usersCount 
 * @param icon 
 * @param allUsersGroup 
 * @param teamForProject 
 * @param id 
 * @param dollarType 
 */
class UserGroup (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("ringId")
    val ringId: String? = null,
    @JsonProperty("usersCount")
    val usersCount: Long? = null,
    @JsonProperty("icon")
    val icon: String? = null,
    @JsonProperty("allUsersGroup")
    val allUsersGroup: Boolean? = null,
    @JsonProperty("teamForProject")
    val teamForProject: Project? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

