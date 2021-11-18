package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 * @param markup 
 */

class UsesMarkupActivityItemAllOf (

    @JsonProperty("removed")
    val removed: Boolean? = null,

    @JsonProperty("added")
    val added: Boolean? = null,

    @JsonProperty("markup")
    val markup: String? = null

)

