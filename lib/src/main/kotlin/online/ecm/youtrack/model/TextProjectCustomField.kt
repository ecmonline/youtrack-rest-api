package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.SimpleProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents settings of the text-type field in the project.
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

class TextProjectCustomField (

    @JsonProperty("field")
    override val field: CustomField? = null,

    @JsonProperty("project")
    override val project: Project? = null,

    @JsonProperty("canBeEmpty")
    override val canBeEmpty: Boolean? = null,

    @JsonProperty("emptyFieldText")
    override val emptyFieldText: String? = null,

    @JsonProperty("ordinal")
    override val ordinal: Int? = null,

    @JsonProperty("isPublic")
    override val isPublic: Boolean? = null,

    @JsonProperty("hasRunningJob")
    override val hasRunningJob: Boolean? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : SimpleProjectCustomField(
    field,
    project,
    canBeEmpty,
    emptyFieldText,
    ordinal,
    isPublic,
    hasRunningJob,
    id,
    dollarType
)

