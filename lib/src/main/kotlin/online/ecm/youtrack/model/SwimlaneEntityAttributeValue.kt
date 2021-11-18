package online.ecm.youtrack.model

import online.ecm.youtrack.model.AgileColumnFieldValueAllOf
import online.ecm.youtrack.model.DatabaseAttributeValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a single swimlane in case of AttributeBasedSwimlaneSettings.
 *
 * @param id 
 * @param dollarType 
 * @param name 
 * @param isResolved 
 */

class SwimlaneEntityAttributeValue (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("name")
    val name: String? = null,

    @JsonProperty("isResolved")
    val isResolved: Boolean? = null

) : DatabaseAttributeValue(id, dollarType)

