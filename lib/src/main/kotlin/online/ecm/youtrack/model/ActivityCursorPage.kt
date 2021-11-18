package online.ecm.youtrack.model

import online.ecm.youtrack.model.ActivityItem

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a page object that wraps a list of issue activities. The main advantage of the page in comparision to a list of activities is cursors. The page provides boundary marks that allow continuous iteration over the activities from the place the page is finished.
 *
 * @param reverse 
 * @param beforeCursor 
 * @param afterCursor 
 * @param hasBefore 
 * @param hasAfter 
 * @param activities 
 * @param id 
 * @param dollarType 
 */
class ActivityCursorPage (

    @JsonProperty("reverse")
    val reverse: Boolean? = null,
    @JsonProperty("beforeCursor")
    val beforeCursor: String? = null,
    @JsonProperty("afterCursor")
    val afterCursor: String? = null,
    @JsonProperty("hasBefore")
    val hasBefore: Boolean? = null,
    @JsonProperty("hasAfter")
    val hasAfter: Boolean? = null,
    @JsonProperty("activities")
    val activities: List<ActivityItem>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

