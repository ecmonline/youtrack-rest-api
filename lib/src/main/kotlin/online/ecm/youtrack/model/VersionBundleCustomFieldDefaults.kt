package online.ecm.youtrack.model

import online.ecm.youtrack.model.BundleCustomFieldDefaults
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.VersionBundle
import online.ecm.youtrack.model.VersionBundleCustomFieldDefaultsAllOf
import online.ecm.youtrack.model.VersionBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Default settings for the version-type field.
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

class VersionBundleCustomFieldDefaults (

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
    val bundle: VersionBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<VersionBundleElement>? = null

) : BundleCustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

