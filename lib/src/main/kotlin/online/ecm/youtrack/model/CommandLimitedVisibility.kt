package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommandLimitedVisibilityAllOf
import online.ecm.youtrack.model.CommandVisibility
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Stores the restricted visibility settings for the command.
 *
 * @param id 
 * @param dollarType 
 * @param permittedGroups 
 * @param permittedUsers 
 */

class CommandLimitedVisibility (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("permittedGroups")
    val permittedGroups: List<UserGroup>? = null,

    @JsonProperty("permittedUsers")
    val permittedUsers: List<User>? = null

) : CommandVisibility(id, dollarType)

