package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueCustomField
import online.ecm.youtrack.model.TextFieldValue
import online.ecm.youtrack.model.TextIssueCustomFieldAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the issue custom field of the `text` type.
 *
 * @param id 
 * @param dollarType 
 * @param value 
 */

class TextIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("value")
    val value: TextFieldValue? = null

) : IssueCustomField(id, dollarType)

