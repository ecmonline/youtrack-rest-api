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
 * Represents date format.
 *
 * @param presentation 
 * @param pattern 
 * @param datePattern 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
interface DateFormatDescriptor {

    @get:JsonProperty("presentation")
    val presentation: kotlin.String?
    @get:JsonProperty("pattern")
    val pattern: kotlin.String?
    @get:JsonProperty("datePattern")
    val datePattern: kotlin.String?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

