package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueComment
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.Visibility

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a file that is attached to an issue or a comment.
 *
 * @param name 
 * @param author 
 * @param created 
 * @param updated 
 * @param propertySize 
 * @param extension 
 * @param charset 
 * @param mimeType 
 * @param metaData 
 * @param draft 
 * @param removed 
 * @param base64Content 
 * @param url 
 * @param visibility 
 * @param issue 
 * @param comment 
 * @param thumbnailURL 
 * @param id 
 * @param dollarType 
 */
class IssueAttachment (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("author")
    val author: User? = null,
    @JsonProperty("created")
    val created: Long? = null,
    @JsonProperty("updated")
    val updated: Long? = null,
    @JsonProperty("size")
    val propertySize: Long? = null,
    @JsonProperty("extension")
    val extension: String? = null,
    @JsonProperty("charset")
    val charset: String? = null,
    @JsonProperty("mimeType")
    val mimeType: String? = null,
    @JsonProperty("metaData")
    val metaData: String? = null,
    @JsonProperty("draft")
    val draft: Boolean? = null,
    @JsonProperty("removed")
    val removed: Boolean? = null,
    @JsonProperty("base64Content")
    val base64Content: String? = null,
    @JsonProperty("url")
    val url: String? = null,
    @JsonProperty("visibility")
    val visibility: Visibility? = null,
    @JsonProperty("issue")
    val issue: Issue? = null,
    @JsonProperty("comment")
    val comment: IssueComment? = null,
    @JsonProperty("thumbnailURL")
    val thumbnailURL: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

