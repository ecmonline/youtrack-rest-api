package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param propertyValues 
 */

class BuildBundleAllOf (

    @JsonProperty("values")
    val propertyValues: List<BuildBundleElement>? = null

)

