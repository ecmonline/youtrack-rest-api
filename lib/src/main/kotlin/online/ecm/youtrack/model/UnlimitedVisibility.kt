package online.ecm.youtrack.model

import online.ecm.youtrack.model.Visibility

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents unlimited visibility.
 *
 * @param id 
 * @param dollarType 
 */

class UnlimitedVisibility (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : Visibility(id, dollarType)

