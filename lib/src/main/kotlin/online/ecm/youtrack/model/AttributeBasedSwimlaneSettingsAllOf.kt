package online.ecm.youtrack.model

import online.ecm.youtrack.model.FilterField
import online.ecm.youtrack.model.SwimlaneEntityAttributeValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param field 
 * @param propertyValues 
 */

class AttributeBasedSwimlaneSettingsAllOf (

    @JsonProperty("field")
    val field: FilterField? = null,

    @JsonProperty("values")
    val propertyValues: List<SwimlaneEntityAttributeValue>? = null

)

