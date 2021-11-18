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
 * Represents an issue property, which can be a predefined field, a custom field, a link, and so on.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
    JsonSubTypes.Type(value = CustomFilterField::class, name = "CustomFilterField"),
    JsonSubTypes.Type(value = PredefinedFilterField::class, name = "PredefinedFilterField")
)
interface FilterField {

    @get:JsonProperty("name")
    val name: kotlin.String?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

