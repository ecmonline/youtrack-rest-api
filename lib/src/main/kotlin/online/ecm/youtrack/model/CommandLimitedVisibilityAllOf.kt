package online.ecm.youtrack.model

import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param permittedGroups 
 * @param permittedUsers 
 */

class CommandLimitedVisibilityAllOf (

    @JsonProperty("permittedGroups")
    val permittedGroups: List<UserGroup>? = null,

    @JsonProperty("permittedUsers")
    val permittedUsers: List<User>? = null

)

