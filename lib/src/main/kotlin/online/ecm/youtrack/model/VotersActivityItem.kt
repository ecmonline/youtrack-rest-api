package online.ecm.youtrack.model

import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.MultiValueActivityItem
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.VotersActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in the list of voters of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param target 
 * @param removed 
 * @param added 
 */

class VotersActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("target")
    val target: Issue? = null,

    @JsonProperty("removed")
    val removed: List<User>? = null,

    @JsonProperty("added")
    val added: List<User>? = null

) : MultiValueActivityItem(id, dollarType)

