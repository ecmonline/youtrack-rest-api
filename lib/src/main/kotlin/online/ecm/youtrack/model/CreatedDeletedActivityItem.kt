package online.ecm.youtrack.model

import online.ecm.youtrack.model.ActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an action when an entity is created or deleted in an issue. For example, a new comment is created in the issue.
 *
 * @param id 
 * @param dollarType 
 */

open class CreatedDeletedActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : ActivityItem(id, dollarType)

