package online.ecm.youtrack.model

import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.WorkItemType

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents time tracking settings of the project.
 *
 * @param enabled 
 * @param estimate 
 * @param timeSpent 
 * @param workItemTypes 
 * @param project 
 * @param id 
 * @param dollarType 
 */
class ProjectTimeTrackingSettings (

    @JsonProperty("enabled")
    val enabled: Boolean? = null,
    @JsonProperty("estimate")
    val estimate: ProjectCustomField? = null,
    @JsonProperty("timeSpent")
    val timeSpent: ProjectCustomField? = null,
    @JsonProperty("workItemTypes")
    val workItemTypes: List<WorkItemType>? = null,
    @JsonProperty("project")
    val project: Project? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

