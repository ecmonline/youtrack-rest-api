package online.ecm.youtrack.model

import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.Project

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents color setting for one project on the board.
 *
 * @param project 
 * @param color 
 * @param id 
 * @param dollarType 
 */
class ProjectColor (

    @JsonProperty("project")
    val project: Project? = null,
    @JsonProperty("color")
    val color: FieldStyle? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

