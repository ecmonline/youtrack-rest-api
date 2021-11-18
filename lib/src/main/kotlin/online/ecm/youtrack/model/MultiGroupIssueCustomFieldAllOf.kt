package online.ecm.youtrack.model

import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiGroupIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: UserGroup? = null

)

