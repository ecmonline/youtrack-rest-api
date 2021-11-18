package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundleElementAllOf
import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.BundleElement
import online.ecm.youtrack.model.FieldStyle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a build - a single element of a builds bundle.
 *
 * @param name 
 * @param bundle 
 * @param description 
 * @param ordinal 
 * @param color 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 * @param assembleDate 
 */

class BuildBundleElement (

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

    @JsonProperty("assembleDate")
    val assembleDate: Long? = null

) : BundleElement(name, bundle, description, ordinal, color, hasRunningJob, id, dollarType)

