package online.ecm.youtrack.model

import online.ecm.youtrack.model.TextFieldValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class TextIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: TextFieldValue? = null

)

