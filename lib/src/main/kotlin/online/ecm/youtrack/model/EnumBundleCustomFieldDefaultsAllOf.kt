package online.ecm.youtrack.model

import online.ecm.youtrack.model.EnumBundle
import online.ecm.youtrack.model.EnumBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class EnumBundleCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: EnumBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<EnumBundleElement>? = null

)

