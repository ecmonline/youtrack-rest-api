package online.ecm.youtrack.model

import online.ecm.youtrack.model.EnumBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiEnumIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: EnumBundleElement? = null

)

