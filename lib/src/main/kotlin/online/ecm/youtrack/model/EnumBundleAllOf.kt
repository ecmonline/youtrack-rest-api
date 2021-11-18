package online.ecm.youtrack.model

import online.ecm.youtrack.model.EnumBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param propertyValues 
 */

class EnumBundleAllOf (

    @JsonProperty("values")
    val propertyValues: List<EnumBundleElement>? = null

)

