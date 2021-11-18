package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseSingleValueIssueCustomField
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.StateBundleElement
import online.ecm.youtrack.model.StateIssueCustomFieldAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue field of the `state` type.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class StateIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: StateBundleElement? = null

) : DatabaseSingleValueIssueCustomField(id, dollarType, projectCustomField, value)

