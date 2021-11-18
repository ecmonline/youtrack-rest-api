package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param name 
 * @param isResolved 
 */

class AgileColumnFieldValueAllOf (

    @JsonProperty("name")
    val name: String? = null,

    @JsonProperty("isResolved")
    val isResolved: Boolean? = null

)

