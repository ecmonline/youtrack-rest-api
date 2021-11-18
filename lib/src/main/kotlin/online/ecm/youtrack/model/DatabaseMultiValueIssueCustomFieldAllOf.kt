package online.ecm.youtrack.model

import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param projectCustomField 
 * @param value 
 */

class DatabaseMultiValueIssueCustomFieldAllOf (

    @JsonProperty("projectCustomField")
    val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    val value: Any? = null

)

