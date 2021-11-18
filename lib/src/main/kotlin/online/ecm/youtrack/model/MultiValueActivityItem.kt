package online.ecm.youtrack.model

import online.ecm.youtrack.model.ActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in an entity attribute that has type of `Array of &lt;Entities&gt;`.
 *
 * @param id 
 * @param dollarType 
 */

open class MultiValueActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : ActivityItem(id, dollarType)

