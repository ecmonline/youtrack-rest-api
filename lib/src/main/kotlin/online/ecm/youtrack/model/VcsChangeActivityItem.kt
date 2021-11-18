package online.ecm.youtrack.model

import online.ecm.youtrack.model.CreatedDeletedActivityItem
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.VcsChangeActivityItemAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an update in the list of VCSChanges of an issue.
 *
 * @param id 
 * @param dollarType 
 * @param removed 
 * @param added 
 * @param author 
 */

class VcsChangeActivityItem (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("removed")
    val removed: Any? = null,

    @JsonProperty("added")
    val added: Any? = null,

    @JsonProperty("author")
    val author: User? = null

) : CreatedDeletedActivityItem(id, dollarType)

