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

import online.ecm.youtrack.model.Bundle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a set of field values in YouTrack.
 *
 * @param isUpdateable 
 * @param id 
 * @param dollarType 
 */

open class BaseBundle (

    @field:JsonProperty("isUpdateable")
    override val isUpdateable: kotlin.Boolean? = null,

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null

) : Bundle

