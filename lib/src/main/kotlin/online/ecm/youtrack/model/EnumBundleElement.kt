package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.LocalizableBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an enumeration value in YouTrack.
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

class EnumBundleElement (

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
    override val localizedName: String? = null

) : LocalizableBundleElement(name, bundle, description, ordinal, color, hasRunningJob, id, dollarType, localizedName)

