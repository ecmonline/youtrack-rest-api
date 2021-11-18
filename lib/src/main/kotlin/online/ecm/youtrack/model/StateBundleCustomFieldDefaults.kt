package online.ecm.youtrack.model

import online.ecm.youtrack.model.BundleCustomFieldDefaults
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.StateBundle
import online.ecm.youtrack.model.StateBundleCustomFieldDefaultsAllOf
import online.ecm.youtrack.model.StateBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Default settings for the state-type field.
 *
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param id 
 * @param dollarType 
 * @param bundle 
 * @param defaultValues 
 */

class StateBundleCustomFieldDefaults (

    @JsonProperty("canBeEmpty")
    override val canBeEmpty: Boolean? = null,

    @JsonProperty("emptyFieldText")
    override val emptyFieldText: String? = null,

    @JsonProperty("isPublic")
    override val isPublic: Boolean? = null,

    @JsonProperty("parent")
    override val parent: CustomField? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("bundle")
    val bundle: StateBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<StateBundleElement>? = null

) : BundleCustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

