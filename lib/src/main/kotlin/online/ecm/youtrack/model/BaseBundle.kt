package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of field values in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 */

open class BaseBundle (

    @JsonProperty("isUpdateable")
    override val isUpdateable: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : Bundle(isUpdateable, id, dollarType)

