package online.ecm.youtrack.model

import online.ecm.youtrack.model.BaseBundle
import online.ecm.youtrack.model.VersionBundleAllOf
import online.ecm.youtrack.model.VersionBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of versions in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param propertyValues 
 */

class VersionBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("values")
    val propertyValues: List<VersionBundleElement>? = null

) : BaseBundle(isUpdateable, id, dollarType)

