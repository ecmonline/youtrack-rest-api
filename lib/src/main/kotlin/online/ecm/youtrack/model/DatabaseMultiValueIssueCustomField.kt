package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseMultiValueIssueCustomFieldAllOf
import online.ecm.youtrack.model.IssueCustomField
import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the all custom fields that may have multiple values in the issue.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

open class DatabaseMultiValueIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    open val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    open val value: Any? = null

) : IssueCustomField(id, dollarType)

