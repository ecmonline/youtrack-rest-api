package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomFieldDefaults
import online.ecm.youtrack.model.FieldType
import online.ecm.youtrack.model.ProjectCustomField

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a custom field in YouTrack.
 *
 * @param name 
 * @param localizedName 
 * @param fieldType 
 * @param isAutoAttached 
 * @param isDisplayedInIssueList 
 * @param ordinal 
 * @param aliases 
 * @param fieldDefaults 
 * @param hasRunningJob 
 * @param isUpdateable 
 * @param instances 
 * @param id 
 * @param dollarType 
 */
class CustomField (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("localizedName")
    val localizedName: String? = null,
    @JsonProperty("fieldType")
    val fieldType: FieldType? = null,
    @JsonProperty("isAutoAttached")
    val isAutoAttached: Boolean? = null,
    @JsonProperty("isDisplayedInIssueList")
    val isDisplayedInIssueList: Boolean? = null,
    @JsonProperty("ordinal")
    val ordinal: Int? = null,
    @JsonProperty("aliases")
    val aliases: String? = null,
    @JsonProperty("fieldDefaults")
    val fieldDefaults: CustomFieldDefaults? = null,
    @JsonProperty("hasRunningJob")
    val hasRunningJob: Boolean? = null,
    @JsonProperty("isUpdateable")
    val isUpdateable: Boolean? = null,
    @JsonProperty("instances")
    val instances: List<ProjectCustomField>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

