package online.ecm.youtrack.model

import online.ecm.youtrack.model.AppearanceSettings
import online.ecm.youtrack.model.License
import online.ecm.youtrack.model.LocaleSettings
import online.ecm.youtrack.model.NotificationSettings
import online.ecm.youtrack.model.RestCorsSettings
import online.ecm.youtrack.model.SystemSettings

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents application-wide settings.
 *
 * @param systemSettings 
 * @param notificationSettings 
 * @param restSettings 
 * @param appearanceSettings 
 * @param localeSettings 
 * @param license 
 * @param id 
 * @param dollarType 
 */
class GlobalSettings (

    @JsonProperty("systemSettings")
    val systemSettings: SystemSettings? = null,
    @JsonProperty("notificationSettings")
    val notificationSettings: NotificationSettings? = null,
    @JsonProperty("restSettings")
    val restSettings: RestCorsSettings? = null,
    @JsonProperty("appearanceSettings")
    val appearanceSettings: AppearanceSettings? = null,
    @JsonProperty("localeSettings")
    val localeSettings: LocaleSettings? = null,
    @JsonProperty("license")
    val license: License? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

