package online.ecm.youtrack.model

import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param groups 
 * @param individuals 
 * @param aggregatedUsers 
 */

class UserBundleAllOf (

    @JsonProperty("groups")
    val groups: List<UserGroup>? = null,

    @JsonProperty("individuals")
    val individuals: List<User>? = null,

    @JsonProperty("aggregatedUsers")
    val aggregatedUsers: List<User>? = null

)

