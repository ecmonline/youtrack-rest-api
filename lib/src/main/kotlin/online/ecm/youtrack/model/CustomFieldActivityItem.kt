package online.ecm.youtrack.model

import online.ecm.youtrack.model.ActivityItem
import online.ecm.youtrack.model.CustomFieldActivityItemAllOf
import online.ecm.youtrack.model.Issue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an activity that affects a custom field of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

open class CustomFieldActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    open val target: Issue? = null,

    @JsonProperty("removed")
    open val removed: Any? = null,

    @JsonProperty("added")
    open val added: Any? = null

) : ActivityItem(id, dollarType)

