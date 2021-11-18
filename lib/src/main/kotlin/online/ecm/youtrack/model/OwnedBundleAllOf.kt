package online.ecm.youtrack.model

import online.ecm.youtrack.model.OwnedBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param propertyValues 
 */

class OwnedBundleAllOf (

    @JsonProperty("values")
    val propertyValues: List<OwnedBundleElement>? = null

)

