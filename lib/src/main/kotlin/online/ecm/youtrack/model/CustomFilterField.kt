package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.CustomFilterFieldAllOf
import online.ecm.youtrack.model.FilterField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a custom field of the issue.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 * @param customField 
 */

class CustomFilterField (

    @JsonProperty("name")
    override val name: String? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("customField")
    val customField: CustomField? = null

) : FilterField(name, id, dollarType)

