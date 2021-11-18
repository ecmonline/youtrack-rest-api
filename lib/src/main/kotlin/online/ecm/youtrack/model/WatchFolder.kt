package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueFolder
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup
import online.ecm.youtrack.model.WatchFolderAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A `WatchFolder` is an `IssueFolder` that let you enable notifications for a set  of issues that it enfolds. It is a common abstract ancestor for saved searches and issue tags.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 * @param owner 
 * @param visibleFor 
 * @param updateableBy 
 */

open class WatchFolder (

    @JsonProperty("name")
    override val name: String? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("owner")
    open val owner: User? = null,

    @JsonProperty("visibleFor")
    open val visibleFor: UserGroup? = null,

    @JsonProperty("updateableBy")
    open val updateableBy: UserGroup? = null

) : IssueFolder(name, id, dollarType)

