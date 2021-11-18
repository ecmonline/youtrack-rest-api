package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueTag
import online.ecm.youtrack.model.MultiValueActivityItem
import online.ecm.youtrack.model.TagsActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the list of tags of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class TagsActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<IssueTag>? = null,

    @JsonProperty("added")
    val added: List<IssueTag>? = null

) : MultiValueActivityItem(id, dollarType)

