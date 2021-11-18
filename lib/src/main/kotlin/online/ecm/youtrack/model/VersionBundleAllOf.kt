package online.ecm.youtrack.model

import online.ecm.youtrack.model.VersionBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param propertyValues 
 */

class VersionBundleAllOf (

    @JsonProperty("values")
    val propertyValues: List<VersionBundleElement>? = null

)

