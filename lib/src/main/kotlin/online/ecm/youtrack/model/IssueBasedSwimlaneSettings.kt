package online.ecm.youtrack.model

import online.ecm.youtrack.model.FilterField
import online.ecm.youtrack.model.IssueBasedSwimlaneSettingsAllOf
import online.ecm.youtrack.model.SwimlaneSettings
import online.ecm.youtrack.model.SwimlaneValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Swimlane settings for the case, when each swimlane is represented by an issue and contains this issue's subtasks.
 *
 * @param enabled 
 * @param id 
 * @param dollarType 
 * @param field 
 * @param defaultCardType 
 * @param propertyValues 
 */

class IssueBasedSwimlaneSettings (

    @JsonProperty("enabled")
    override val enabled: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("field")
    val field: FilterField? = null,

    @JsonProperty("defaultCardType")
    val defaultCardType: SwimlaneValue? = null,

    @JsonProperty("values")
    val propertyValues: List<SwimlaneValue>? = null

) : SwimlaneSettings(enabled, id, dollarType)

