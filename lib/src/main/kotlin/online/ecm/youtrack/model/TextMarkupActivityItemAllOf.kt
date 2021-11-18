package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 * @param markup 
 */

class TextMarkupActivityItemAllOf (

    @JsonProperty("removed")
    val removed: String? = null,

    @JsonProperty("added")
    val added: String? = null,

    @JsonProperty("markup")
    val markup: String? = null

)

