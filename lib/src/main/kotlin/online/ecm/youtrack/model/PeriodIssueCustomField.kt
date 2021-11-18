package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueCustomField
import online.ecm.youtrack.model.PeriodIssueCustomFieldAllOf
import online.ecm.youtrack.model.PeriodValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents the period field in the issue.
 *
 * @param id 
 * @param dollarType 
 * @param value 
 */

class PeriodIssueCustomField (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("value")
    val value: PeriodValue? = null

) : IssueCustomField(id, dollarType)

