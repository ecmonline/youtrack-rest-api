package online.ecm.youtrack.model

import online.ecm.youtrack.model.VersionBundle
import online.ecm.youtrack.model.VersionBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class VersionBundleCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: VersionBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<VersionBundleElement>? = null

)

