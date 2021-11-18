package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiBuildIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: BuildBundleElement? = null

)

