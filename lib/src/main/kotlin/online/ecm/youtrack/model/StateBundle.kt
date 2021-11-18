package online.ecm.youtrack.model

import online.ecm.youtrack.model.BaseBundle
import online.ecm.youtrack.model.StateBundleAllOf
import online.ecm.youtrack.model.StateBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of states in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param propertyValues 
 */

class StateBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("values")
    val propertyValues: List<StateBundleElement>? = null

) : BaseBundle(isUpdateable, id, dollarType)

