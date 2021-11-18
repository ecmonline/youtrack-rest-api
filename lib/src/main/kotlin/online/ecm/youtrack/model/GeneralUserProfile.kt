package online.ecm.youtrack.model

import online.ecm.youtrack.model.DateFormatDescriptor
import online.ecm.youtrack.model.LocaleDescriptor
import online.ecm.youtrack.model.TimeZoneDescriptor

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the user profile in YouTrack.
 *
 * @param dateFieldFormat 
 * @param timezone 
 * @param locale 
 * @param id 
 * @param dollarType 
 */
class GeneralUserProfile (

    @JsonProperty("dateFieldFormat")
    val dateFieldFormat: DateFormatDescriptor? = null,
    @JsonProperty("timezone")
    val timezone: TimeZoneDescriptor? = null,
    @JsonProperty("locale")
    val locale: LocaleDescriptor? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

