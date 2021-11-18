package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param prototype 
 */

class FieldBasedColorCodingAllOf (

    @JsonProperty("prototype")
    val prototype: CustomField? = null

)

