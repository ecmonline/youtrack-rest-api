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
 * Represents the settings of a link type in YouTrack.
 *
 * @param name 
 * @param localizedName 
 * @param sourceToTarget 
 * @param localizedSourceToTarget 
 * @param targetToSource 
 * @param localizedTargetToSource 
 * @param directed 
 * @param aggregation 
 * @param readOnly 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class IssueLinkType (

    @get:JsonProperty("name")
    val name: kotlin.String? = null,
    @get:JsonProperty("localizedName")
    val localizedName: kotlin.String? = null,
    @get:JsonProperty("sourceToTarget")
    val sourceToTarget: kotlin.String? = null,
    @get:JsonProperty("localizedSourceToTarget")
    val localizedSourceToTarget: kotlin.String? = null,
    @get:JsonProperty("targetToSource")
    val targetToSource: kotlin.String? = null,
    @get:JsonProperty("localizedTargetToSource")
    val localizedTargetToSource: kotlin.String? = null,
    @get:JsonProperty("directed")
    val directed: kotlin.Boolean? = null,
    @get:JsonProperty("aggregation")
    val aggregation: kotlin.Boolean? = null,
    @get:JsonProperty("readOnly")
    val readOnly: kotlin.Boolean? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

