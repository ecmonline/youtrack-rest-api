package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseMultiValueIssueCustomField
import online.ecm.youtrack.model.MultiUserIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `user` type that can have multiple values.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class MultiUserIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: User? = null

) : DatabaseMultiValueIssueCustomField(id, dollarType, projectCustomField, value)

