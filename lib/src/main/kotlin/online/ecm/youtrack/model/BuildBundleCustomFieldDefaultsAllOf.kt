package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundle
import online.ecm.youtrack.model.BuildBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class BuildBundleCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: BuildBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<BuildBundleElement>? = null

)

