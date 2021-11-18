package online.ecm.youtrack.model

import online.ecm.youtrack.model.OwnedBundle
import online.ecm.youtrack.model.OwnedBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class OwnedBundleCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: OwnedBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<OwnedBundleElement>? = null

)

