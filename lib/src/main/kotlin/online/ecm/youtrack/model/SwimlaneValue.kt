package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents single swimlane in case of IssueBasedSwimlaneSettings.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 */
class SwimlaneValue (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

