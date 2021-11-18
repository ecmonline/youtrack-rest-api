package online.ecm.youtrack.model

import online.ecm.youtrack.model.BuildBundleElement
import online.ecm.youtrack.model.DatabaseSingleValueIssueCustomField
import online.ecm.youtrack.model.MultiBuildIssueCustomFieldAllOf
import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `build` type that can only have a single value.
 *
 * @param id 
 * @param dollarType 
 * @param projectCustomField 
 * @param value 
 */

class SingleBuildIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectCustomField")
    override val projectCustomField: ProjectCustomField? = null,

    @JsonProperty("value")
    override val value: BuildBundleElement? = null

) : DatabaseSingleValueIssueCustomField(id, dollarType, projectCustomField, value)

