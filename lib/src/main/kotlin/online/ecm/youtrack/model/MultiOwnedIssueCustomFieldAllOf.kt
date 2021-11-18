package online.ecm.youtrack.model

import online.ecm.youtrack.model.OwnedBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiOwnedIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: OwnedBundleElement? = null

)

