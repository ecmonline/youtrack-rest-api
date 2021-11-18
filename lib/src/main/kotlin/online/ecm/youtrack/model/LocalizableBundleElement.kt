package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.BundleElement
import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.LocalizableBundleElementAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents field value that can be localized.
 *
 * @param name 
 * @param bundle 
 * @param description 
 * @param ordinal 
 * @param color 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 * @param localizedName 
 */

open class LocalizableBundleElement (

    @JsonProperty("name")
    override val name: String? = null,

    @JsonProperty("bundle")
    override val bundle: Bundle? = null,

    @JsonProperty("description")
    override val description: String? = null,

    @JsonProperty("ordinal")
    override val ordinal: Int? = null,

    @JsonProperty("color")
    override val color: FieldStyle? = null,

    @JsonProperty("hasRunningJob")
    override val hasRunningJob: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("localizedName")
    open val localizedName: String? = null

) : BundleElement(name, bundle, description, ordinal, color, hasRunningJob, id, dollarType)

