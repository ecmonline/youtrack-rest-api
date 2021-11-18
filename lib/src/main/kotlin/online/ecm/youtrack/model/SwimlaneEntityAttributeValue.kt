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

import online.ecm.youtrack.model.AgileColumnFieldValueAllOf
import online.ecm.youtrack.model.DatabaseAttributeValue

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a single swimlane in case of AttributeBasedSwimlaneSettings.
 *
 * @param id 
 * @param dollarType 
 * @param name 
 * @param isResolved 
 */

data class SwimlaneEntityAttributeValue (

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("isResolved")
    val isResolved: kotlin.Boolean? = null

) : DatabaseAttributeValue

