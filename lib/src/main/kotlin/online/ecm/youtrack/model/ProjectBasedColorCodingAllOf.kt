package online.ecm.youtrack.model

import online.ecm.youtrack.model.ProjectColor

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param projectColors 
 */

class ProjectBasedColorCodingAllOf (

    @JsonProperty("projectColors")
    val projectColors: List<ProjectColor>? = null

)

