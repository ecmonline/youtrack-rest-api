package online.ecm.youtrack.model

import online.ecm.youtrack.model.MultiValueActivityItem
import online.ecm.youtrack.model.VisibilityActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the changes of properties responsible for visibility restriction. Can be <a href=\"api-entity-VisibilityGroupActivityItem.xml\">VisibilityGroupActivityItem</a> or <a href=\"api-entity-VisibilityUserActivityItem.xml\">VisibilityUserActivityItem</a>
 *
 * @param id 
 * @param dollarType 
 * @param targetMember 
 */

open class VisibilityActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("targetMember")
    open val targetMember: String? = null

) : MultiValueActivityItem(id, dollarType)

