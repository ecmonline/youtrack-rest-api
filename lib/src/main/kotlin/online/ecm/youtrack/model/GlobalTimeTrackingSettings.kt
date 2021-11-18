package online.ecm.youtrack.model

import online.ecm.youtrack.model.WorkItemType
import online.ecm.youtrack.model.WorkTimeSettings

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents time tracking settings of your server.
 *
 * @param workItemTypes 
 * @param workTimeSettings 
 * @param id 
 * @param dollarType 
 */
class GlobalTimeTrackingSettings (

    @JsonProperty("workItemTypes")
    val workItemTypes: List<WorkItemType>? = null,
    @JsonProperty("workTimeSettings")
    val workTimeSettings: WorkTimeSettings? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

