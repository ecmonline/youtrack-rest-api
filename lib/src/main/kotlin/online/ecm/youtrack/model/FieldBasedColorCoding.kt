package online.ecm.youtrack.model

import online.ecm.youtrack.model.ColorCoding
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.FieldBasedColorCodingAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Sets a card color based on a value of some custom field.
 *
 * @param id 
 * @param dollarType 
 * @param prototype 
 */

class FieldBasedColorCoding (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("prototype")
    val prototype: CustomField? = null

) : ColorCoding(id, dollarType)

