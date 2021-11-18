package online.ecm.youtrack.model

import online.ecm.youtrack.model.AgileColumn

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents WIP limits for particular column. If they are not satisfied, the column will be highlighted in UI.
 *
 * @param max 
 * @param min 
 * @param column 
 * @param id 
 * @param dollarType 
 */
class WIPLimit (

    @JsonProperty("max")
    val max: Int? = null,
    @JsonProperty("min")
    val min: Int? = null,
    @JsonProperty("column")
    val column: AgileColumn? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

