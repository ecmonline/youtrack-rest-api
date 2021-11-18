package online.ecm.youtrack.model

import online.ecm.youtrack.model.StateBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param propertyValues 
 */

class StateBundleAllOf (

    @JsonProperty("values")
    val propertyValues: List<StateBundleElement>? = null

)

