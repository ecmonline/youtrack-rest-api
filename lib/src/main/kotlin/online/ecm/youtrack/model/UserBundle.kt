package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserBundleAllOf
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of values that contains users. You can add to the set both individual user accounts and groups of users.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param groups 
 * @param individuals 
 * @param aggregatedUsers 
 */

class UserBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("groups")
    val groups: List<UserGroup>? = null,

    @JsonProperty("individuals")
    val individuals: List<User>? = null,

    @JsonProperty("aggregatedUsers")
    val aggregatedUsers: List<User>? = null

) : Bundle(isUpdateable, id, dollarType)

