package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommandLimitedVisibilityAllOf
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup
import online.ecm.youtrack.model.Visibility

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents visibility limited to several users and/or groups.
 *
 * @param id 
 * @param dollarType 
 * @param permittedGroups 
 * @param permittedUsers 
 */

class LimitedVisibility (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("permittedGroups")
    val permittedGroups: List<UserGroup>? = null,

    @JsonProperty("permittedUsers")
    val permittedUsers: List<User>? = null

) : Visibility(id, dollarType)

