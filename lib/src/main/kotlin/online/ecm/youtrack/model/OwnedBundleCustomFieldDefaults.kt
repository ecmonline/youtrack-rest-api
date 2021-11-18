package online.ecm.youtrack.model

import online.ecm.youtrack.model.BundleCustomFieldDefaults
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.OwnedBundle
import online.ecm.youtrack.model.OwnedBundleCustomFieldDefaultsAllOf
import online.ecm.youtrack.model.OwnedBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Default settings for the owned-type field.
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

class OwnedBundleCustomFieldDefaults (

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
    val bundle: OwnedBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<OwnedBundleElement>? = null

) : BundleCustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

