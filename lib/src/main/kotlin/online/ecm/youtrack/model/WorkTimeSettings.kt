package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Work schedule settings.
 *
 * @param minutesADay 
 * @param workDays 
 * @param firstDayOfWeek 
 * @param daysAWeek 
 * @param id 
 * @param dollarType 
 */
class WorkTimeSettings (

    @JsonProperty("minutesADay")
    val minutesADay: Int? = null,
    @JsonProperty("workDays")
    val workDays: Int? = null,
    @JsonProperty("firstDayOfWeek")
    val firstDayOfWeek: Int? = null,
    @JsonProperty("daysAWeek")
    val daysAWeek: Int? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

