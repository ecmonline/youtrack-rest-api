package online.ecm.youtrack.model

import online.ecm.youtrack.model.AgileStatus
import online.ecm.youtrack.model.ColorCoding
import online.ecm.youtrack.model.ColumnSettings
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.Sprint
import online.ecm.youtrack.model.SprintsSettings
import online.ecm.youtrack.model.SwimlaneSettings
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an agile board configuration.
 *
 * @param name 
 * @param owner 
 * @param visibleFor 
 * @param visibleForProjectBased 
 * @param updateableBy 
 * @param updateableByProjectBased 
 * @param orphansAtTheTop 
 * @param hideOrphansSwimlane 
 * @param estimationField 
 * @param originalEstimationField 
 * @param projects 
 * @param sprints 
 * @param currentSprint 
 * @param columnSettings 
 * @param swimlaneSettings 
 * @param sprintsSettings 
 * @param colorCoding 
 * @param status 
 * @param id 
 * @param dollarType 
 */
class Agile (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("owner")
    val owner: User? = null,
    @JsonProperty("visibleFor")
    val visibleFor: UserGroup? = null,
    @JsonProperty("visibleForProjectBased")
    val visibleForProjectBased: Boolean? = null,
    @JsonProperty("updateableBy")
    val updateableBy: UserGroup? = null,
    @JsonProperty("updateableByProjectBased")
    val updateableByProjectBased: Boolean? = null,
    @JsonProperty("orphansAtTheTop")
    val orphansAtTheTop: Boolean? = null,
    @JsonProperty("hideOrphansSwimlane")
    val hideOrphansSwimlane: Boolean? = null,
    @JsonProperty("estimationField")
    val estimationField: CustomField? = null,
    @JsonProperty("originalEstimationField")
    val originalEstimationField: CustomField? = null,
    @JsonProperty("projects")
    val projects: List<Project>? = null,
    @JsonProperty("sprints")
    val sprints: List<Sprint>? = null,
    @JsonProperty("currentSprint")
    val currentSprint: Sprint? = null,
    @JsonProperty("columnSettings")
    val columnSettings: ColumnSettings? = null,
    @JsonProperty("swimlaneSettings")
    val swimlaneSettings: SwimlaneSettings? = null,
    @JsonProperty("sprintsSettings")
    val sprintsSettings: SprintsSettings? = null,
    @JsonProperty("colorCoding")
    val colorCoding: ColorCoding? = null,
    @JsonProperty("status")
    val status: AgileStatus? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

