package online.ecm.youtrack.model

import online.ecm.youtrack.model.DateIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.SimpleIssueCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `date` type.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class DateIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: Any? = null

) : SimpleIssueCustomField(id, dollarType, projectCustomField, value)

