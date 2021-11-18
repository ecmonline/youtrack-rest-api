package online.ecm.youtrack.model

import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param owner 
 * @param visibleFor 
 * @param updateableBy 
 */

class WatchFolderAllOf (

    @JsonProperty("owner")
    val owner: User? = null,

    @JsonProperty("visibleFor")
    val visibleFor: UserGroup? = null,

    @JsonProperty("updateableBy")
    val updateableBy: UserGroup? = null

)

