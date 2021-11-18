package online.ecm.youtrack.model

import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 * @param author 
 */

class VcsChangeActivityItemAllOf (

    @JsonProperty("removed")
    val removed: Any? = null,

    @JsonProperty("added")
    val added: Any? = null,

    @JsonProperty("author")
    val author: User? = null

)

