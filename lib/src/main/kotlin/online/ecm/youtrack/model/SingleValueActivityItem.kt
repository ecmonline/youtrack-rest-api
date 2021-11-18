package online.ecm.youtrack.model

import online.ecm.youtrack.model.ActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Describe change of properties that can have single value.
 *
 * @param id 
 * @param dollarType 
 */

open class SingleValueActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : ActivityItem(id, dollarType)

