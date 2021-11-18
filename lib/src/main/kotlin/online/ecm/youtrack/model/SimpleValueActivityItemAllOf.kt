package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param removed 
 * @param added 
 */

class SimpleValueActivityItemAllOf (

    @JsonProperty("removed")
    val removed: Any? = null,

    @JsonProperty("added")
    val added: Any? = null

)

