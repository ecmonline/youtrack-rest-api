package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param customField 
 */

class CustomFilterFieldAllOf (

    @JsonProperty("customField")
    val customField: CustomField? = null

)

