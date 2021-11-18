package online.ecm.youtrack.model

import online.ecm.youtrack.model.PeriodValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param value 
 */

class PeriodIssueCustomFieldAllOf (

    @JsonProperty("value")
    val value: PeriodValue? = null

)

