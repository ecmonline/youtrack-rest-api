package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param startingNumber 
 * @param shortName 
 * @param description 
 * @param leader 
 * @param createdBy 
 * @param issues 
 * @param customFields 
 * @param archived 
 * @param fromEmail 
 * @param replyToEmail 
 * @param template 
 * @param iconUrl 
 * @param team 
 */

class ProjectAllOf (

    @JsonProperty("startingNumber")
    val startingNumber: Long? = null,

    @JsonProperty("shortName")
    val shortName: String? = null,

    @JsonProperty("description")
    val description: String? = null,

    @JsonProperty("leader")
    val leader: User? = null,

    @JsonProperty("createdBy")
    val createdBy: User? = null,

    @JsonProperty("issues")
    val issues: List<Issue>? = null,

    @JsonProperty("customFields")
    val customFields: Any? = null,

    @JsonProperty("archived")
    val archived: Boolean? = null,

    @JsonProperty("fromEmail")
    val fromEmail: String? = null,

    @JsonProperty("replyToEmail")
    val replyToEmail: String? = null,

    @JsonProperty("template")
    val template: Boolean? = null,

    @JsonProperty("iconUrl")
    val iconUrl: String? = null,

    @JsonProperty("team")
    val team: UserGroup? = null

)

