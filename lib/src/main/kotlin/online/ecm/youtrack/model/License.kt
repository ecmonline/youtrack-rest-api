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
 * Represents the current license of the YouTrack service.
 *
 * @param username 
 * @param license 
 * @param error 
 * @param id 
 * @param dollarType 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "\$type", visible = true)
@JsonSubTypes(
)
open class License (

    @get:JsonProperty("username")
    val username: kotlin.String? = null,
    @get:JsonProperty("license")
    val license: kotlin.String? = null,
    @get:JsonProperty("error")
    val error: kotlin.String? = null,
    @get:JsonProperty("id")
    val id: kotlin.String? = null,
    @get:JsonProperty("\$type")
    val dollarType: kotlin.String? = null,
)

