package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents an issue folder, such as a project, a saved search, or a tag.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 */
open class IssueFolder (

    @JsonProperty("name")
    open val name: String? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

