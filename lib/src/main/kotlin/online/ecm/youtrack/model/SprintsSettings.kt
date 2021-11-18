package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Sprint

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Describes sprints configuration.
 *
 * @param isExplicit 
 * @param cardOnSeveralSprints 
 * @param defaultSprint 
 * @param disableSprints 
 * @param explicitQuery 
 * @param sprintSyncField 
 * @param hideSubtasksOfCards 
 * @param id 
 * @param dollarType 
 */
class SprintsSettings (

    @JsonProperty("isExplicit")
    val isExplicit: Boolean? = null,
    @JsonProperty("cardOnSeveralSprints")
    val cardOnSeveralSprints: Boolean? = null,
    @JsonProperty("defaultSprint")
    val defaultSprint: Sprint? = null,
    @JsonProperty("disableSprints")
    val disableSprints: Boolean? = null,
    @JsonProperty("explicitQuery")
    val explicitQuery: String? = null,
    @JsonProperty("sprintSyncField")
    val sprintSyncField: CustomField? = null,
    @JsonProperty("hideSubtasksOfCards")
    val hideSubtasksOfCards: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

