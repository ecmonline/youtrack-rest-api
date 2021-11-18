package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.IssueCreatedActivityItemAllOf
import online.ecm.youtrack.model.MultiValueActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the `issues` attribute of an IssueLink entity. That is, each issue has the `links` attribute that contains an array of IssueLink entities. Each of them represents a link between the target issue and a collection of issues. For example, a set of issues to which the target one is linked as \"Duplicated by\". The change in the list of these issues is represented by `LinksActivityItem` entity.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class LinksActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<Issue>? = null,

    @JsonProperty("added")
    val added: List<Issue>? = null

) : MultiValueActivityItem(id, dollarType)

