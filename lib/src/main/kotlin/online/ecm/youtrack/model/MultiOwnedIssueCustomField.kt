package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseMultiValueIssueCustomField
import online.ecm.youtrack.model.MultiOwnedIssueCustomFieldAllOf
import online.ecm.youtrack.model.OwnedBundleElement
import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `ownedField` type that can have multiple values. The predefined Subsystem field is the example of the owned fields.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class MultiOwnedIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: OwnedBundleElement? = null

) : DatabaseMultiValueIssueCustomField(id, dollarType, projectCustomField, value)

