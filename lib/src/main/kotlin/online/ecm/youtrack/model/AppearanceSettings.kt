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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class AppearanceSettings (

    @get:JsonProperty("timeZone")
    val timeZone: TimeZoneDescriptor? = null,
    @get:JsonProperty("dateFieldFormat")
    val dateFieldFormat: DateFormatDescriptor? = null,
    @get:JsonProperty("logo")
    val logo: Logo? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

