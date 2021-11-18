package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.GroupProjectCustomFieldAllOf
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.ProjectCustomField
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents project settings for group custom field.
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
 * @param defaultValues 
 */

class GroupProjectCustomField (

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
    override val dollarType: String? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<UserGroup>? = null

) : ProjectCustomField(field, project, canBeEmpty, emptyFieldText, ordinal, isPublic, hasRunningJob, id, dollarType)

