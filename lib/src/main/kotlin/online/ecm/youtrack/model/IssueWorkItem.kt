package online.ecm.youtrack.model

import online.ecm.youtrack.model.DurationValue
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.WorkItemType

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a work item in an issue.
 *
 * @param author 
 * @param creator 
 * @param text 
 * @param textPreview 
 * @param type 
 * @param created 
 * @param updated 
 * @param duration 
 * @param date 
 * @param issue 
 * @param usesMarkdown 
 * @param id 
 * @param dollarType 
 */
class IssueWorkItem (

    @JsonProperty("author")
    val author: User? = null,
    @JsonProperty("creator")
    val creator: User? = null,
    @JsonProperty("text")
    val text: String? = null,
    @JsonProperty("textPreview")
    val textPreview: String? = null,
    @JsonProperty("type")
    val type: WorkItemType? = null,
    @JsonProperty("created")
    val created: Long? = null,
    @JsonProperty("updated")
    val updated: Long? = null,
    @JsonProperty("duration")
    val duration: DurationValue? = null,
    @JsonProperty("date")
    val date: Long? = null,
    @JsonProperty("issue")
    val issue: Issue? = null,
    @JsonProperty("usesMarkdown")
    val usesMarkdown: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

