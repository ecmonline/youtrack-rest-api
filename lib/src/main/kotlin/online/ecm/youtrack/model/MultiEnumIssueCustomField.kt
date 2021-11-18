package online.ecm.youtrack.model

import online.ecm.youtrack.model.DatabaseMultiValueIssueCustomField
import online.ecm.youtrack.model.EnumBundleElement
import online.ecm.youtrack.model.MultiEnumIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `enum` type that can have multiple values.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class MultiEnumIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: EnumBundleElement? = null

) : DatabaseMultiValueIssueCustomField(id, dollarType, projectCustomField, value)

