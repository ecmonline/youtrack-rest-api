package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Project

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents custom field settings for the particular project.
 *
 * @param field 
 * @param project 
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param ordinal 
 * @param isPublic 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 */
open class ProjectCustomField (

    @JsonProperty("field")
    open val field: CustomField? = null,
    @JsonProperty("project")
    open val project: Project? = null,
    @JsonProperty("canBeEmpty")
    open val canBeEmpty: Boolean? = null,
    @JsonProperty("emptyFieldText")
    open val emptyFieldText: String? = null,
    @JsonProperty("ordinal")
    open val ordinal: Int? = null,
    @JsonProperty("isPublic")
    open val isPublic: Boolean? = null,
    @JsonProperty("hasRunningJob")
    open val hasRunningJob: Boolean? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

