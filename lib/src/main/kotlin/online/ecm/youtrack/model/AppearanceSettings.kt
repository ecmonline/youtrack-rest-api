package online.ecm.youtrack.model

import online.ecm.youtrack.model.DateFormatDescriptor
import online.ecm.youtrack.model.Logo
import online.ecm.youtrack.model.TimeZoneDescriptor

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the Visual settings of the YouTrack service.
 *
 * @param timeZone 
 * @param dateFieldFormat 
 * @param logo 
 * @param id 
 * @param dollarType 
 */
class AppearanceSettings (

    @JsonProperty("timeZone")
    val timeZone: TimeZoneDescriptor? = null,
    @JsonProperty("dateFieldFormat")
    val dateFieldFormat: DateFormatDescriptor? = null,
    @JsonProperty("logo")
    val logo: Logo? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

