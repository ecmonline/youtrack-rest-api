package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.BundleElement
import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.VersionBundleElementAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a version in YouTrack.
 *
 * @param name 
 * @param bundle 
 * @param description 
 * @param ordinal 
 * @param color 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 * @param archived 
 * @param releaseDate 
 * @param released 
 */

class VersionBundleElement (

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

    @JsonProperty("archived")
    val archived: Boolean? = null,

    @JsonProperty("releaseDate")
    val releaseDate: Long? = null,

    @JsonProperty("released")
    val released: Boolean? = null

) : BundleElement(name, bundle, description, ordinal, color, hasRunningJob, id, dollarType)

