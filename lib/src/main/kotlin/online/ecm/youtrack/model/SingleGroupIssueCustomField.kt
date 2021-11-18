package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseSingleValueIssueCustomField
import online.ecm.youtrack.model.MultiGroupIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `group` type that can only have a single value.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class SingleGroupIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: UserGroup? = null

) : DatabaseSingleValueIssueCustomField(id, dollarType, projectCustomField, value)

