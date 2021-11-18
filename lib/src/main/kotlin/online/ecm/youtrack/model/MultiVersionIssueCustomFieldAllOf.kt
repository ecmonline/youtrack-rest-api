package online.ecm.youtrack.model

import online.ecm.youtrack.model.VersionBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiVersionIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: VersionBundleElement? = null

)

