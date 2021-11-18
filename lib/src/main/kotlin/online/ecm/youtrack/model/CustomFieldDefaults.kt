package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents default project-related settings of the custom field. These settings are applied at the moment when the custom field is attached to a project. After that, any changes in default settings do not affect the field settings for this project.
 *
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param id 
 * @param dollarType 
 */
open class CustomFieldDefaults (

    @JsonProperty("canBeEmpty")
    open val canBeEmpty: Boolean? = null,
    @JsonProperty("emptyFieldText")
    open val emptyFieldText: String? = null,
    @JsonProperty("isPublic")
    open val isPublic: Boolean? = null,
    @JsonProperty("parent")
    open val parent: CustomField? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

