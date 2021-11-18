package online.ecm.youtrack.model

import online.ecm.youtrack.model.StateBundle
import online.ecm.youtrack.model.StateBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class StateBundleCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: StateBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<StateBundleElement>? = null

)

