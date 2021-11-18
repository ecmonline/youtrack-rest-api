package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a change in an issue or in its related entities. In the UI, you see these changes as the Activity stream. It shows a feed of all updates of the issue: issue history, comments, attachments, VCS changes, work items, and so on.
 *
 * @param id 
 * @param dollarType 
 */
open class ActivityItem (

    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

