package online.ecm.youtrack.model

import online.ecm.youtrack.model.BaseBundle
import online.ecm.youtrack.model.OwnedBundleAllOf
import online.ecm.youtrack.model.OwnedBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of owned values in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param propertyValues 
 */

class OwnedBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("values")
    val propertyValues: List<OwnedBundleElement>? = null

) : BaseBundle(isUpdateable, id, dollarType)
