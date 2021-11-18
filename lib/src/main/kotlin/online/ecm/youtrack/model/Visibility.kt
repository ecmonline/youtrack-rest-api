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


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Describes visibility settings for an entity (issue, comment, etc.)
 *
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
    JsonSubTypes.Type(value = LimitedVisibility::class, name = "LimitedVisibility"),
    JsonSubTypes.Type(value = UnlimitedVisibility::class, name = "UnlimitedVisibility")
)
open class Visibility (

    @get:JsonProperty("id")
    open val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    open val dollarType: kotlin.String? = null,
)

