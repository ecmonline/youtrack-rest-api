package online.ecm.youtrack.model

import online.ecm.youtrack.model.ColorCoding
import online.ecm.youtrack.model.ProjectBasedColorCodingAllOf
import online.ecm.youtrack.model.ProjectColor

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Lets you set a color for a card based on its project.
 *
 * @param id 
 * @param dollarType 
 * @param projectColors 
 */

class ProjectBasedColorCoding (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("projectColors")
    val projectColors: List<ProjectColor>? = null

) : ColorCoding(id, dollarType)

