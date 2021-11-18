package online.ecm.youtrack.model

import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class MultiUserIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: User? = null

)

