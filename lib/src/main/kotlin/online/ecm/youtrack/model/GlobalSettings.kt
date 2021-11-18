/**
 * YouTrack REST API
 *
 * YouTrack issue tracking and project management system
 *
 * The version of the OpenAPI document: 2021.3
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
interface GlobalSettings {

    @get:JsonProperty("systemSettings")
    val systemSettings: SystemSettings?
    @get:JsonProperty("notificationSettings")
    val notificationSettings: NotificationSettings?
    @get:JsonProperty("restSettings")
    val restSettings: RestCorsSettings?
    @get:JsonProperty("appearanceSettings")
    val appearanceSettings: AppearanceSettings?
    @get:JsonProperty("localeSettings")
    val localeSettings: LocaleSettings?
    @get:JsonProperty("license")
    val license: License?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

