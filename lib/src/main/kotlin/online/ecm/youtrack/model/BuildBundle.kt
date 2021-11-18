package online.ecm.youtrack.model

import online.ecm.youtrack.model.BaseBundle
import online.ecm.youtrack.model.BuildBundleAllOf
import online.ecm.youtrack.model.BuildBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of builds in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param propertyValues 
 */

class BuildBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("values")
    val propertyValues: List<BuildBundleElement>? = null

) : BaseBundle(isUpdateable, id, dollarType)

