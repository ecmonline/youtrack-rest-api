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
 * Shows if the board has any configuration problems.
 *
 * @param valid 
 * @param hasJobs 
 * @param errors 
 * @param warnings 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
interface AgileStatus {

    @get:JsonProperty("valid")
    val valid: kotlin.Boolean?
    @get:JsonProperty("hasJobs")
    val hasJobs: kotlin.Boolean?
    @get:JsonProperty("errors")
    val errors: kotlin.String?
    @get:JsonProperty("warnings")
    val warnings: kotlin.String?
    @get:JsonProperty("id")
    val id: kotlin.String?
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String?
}

