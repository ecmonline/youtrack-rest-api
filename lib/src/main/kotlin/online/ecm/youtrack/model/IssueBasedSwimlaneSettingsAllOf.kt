package online.ecm.youtrack.model

import online.ecm.youtrack.model.FilterField
import online.ecm.youtrack.model.SwimlaneValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param field 
 * @param defaultCardType 
 * @param propertyValues 
 */

class IssueBasedSwimlaneSettingsAllOf (

    @JsonProperty("field")
    val field: FilterField? = null,

    @JsonProperty("defaultCardType")
    val defaultCardType: SwimlaneValue? = null,

    @JsonProperty("values")
    val propertyValues: List<SwimlaneValue>? = null

)

