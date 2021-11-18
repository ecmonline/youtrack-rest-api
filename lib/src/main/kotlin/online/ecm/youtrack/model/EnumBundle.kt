package online.ecm.youtrack.model

import online.ecm.youtrack.model.BaseBundle
import online.ecm.youtrack.model.EnumBundleAllOf
import online.ecm.youtrack.model.EnumBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of values of the enumeration type in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 * @param propertyValues 
 */

class EnumBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("values")
    val propertyValues: List<EnumBundleElement>? = null

) : BaseBundle(isUpdateable, id, dollarType)

