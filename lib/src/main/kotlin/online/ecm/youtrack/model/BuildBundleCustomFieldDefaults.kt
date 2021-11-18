package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundle
import online.ecm.youtrack.model.BuildBundleCustomFieldDefaultsAllOf
import online.ecm.youtrack.model.BuildBundleElement
import online.ecm.youtrack.model.BundleCustomFieldDefaults
import online.ecm.youtrack.model.CustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Default settings for the build-type field.
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

class BuildBundleCustomFieldDefaults (

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
    val bundle: BuildBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<BuildBundleElement>? = null

) : BundleCustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

