package online.ecm.youtrack.model

import online.ecm.youtrack.model.AttributeBasedSwimlaneSettingsAllOf
import online.ecm.youtrack.model.FilterField
import online.ecm.youtrack.model.SwimlaneEntityAttributeValue
import online.ecm.youtrack.model.SwimlaneSettings

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param enabled 
 * @param id 
 * @param dollarType 
 * @param field 
 * @param propertyValues 
 */

class AttributeBasedSwimlaneSettings (

    @JsonProperty("enabled")
    override val enabled: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("field")
    val field: FilterField? = null,

    @JsonProperty("values")
    val propertyValues: List<SwimlaneEntityAttributeValue>? = null

) : SwimlaneSettings(enabled, id, dollarType)

