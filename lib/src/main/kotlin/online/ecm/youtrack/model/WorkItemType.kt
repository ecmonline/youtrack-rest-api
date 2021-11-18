package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a work type that can be assigned to a work item.
 *
 * @param name 
 * @param autoAttached 
 * @param id 
 * @param dollarType 
 */
class WorkItemType (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("autoAttached")
    val autoAttached: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

