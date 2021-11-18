package online.ecm.youtrack.model

import online.ecm.youtrack.model.PeriodFieldFormat

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents time tracking settings in the user's profile.
 *
 * @param periodFormat 
 * @param id 
 * @param dollarType 
 */
class TimeTrackingUserProfile (

    @JsonProperty("periodFormat")
    val periodFormat: PeriodFieldFormat? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

