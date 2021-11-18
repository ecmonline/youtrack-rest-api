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

import online.ecm.youtrack.model.ActivityItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a change in an entity attribute that has type of `Array of &lt;Entities&gt;`.
 *
 * @param id 
 * @param dollarType 
 */

open class MultiValueActivityItem (

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null

) : ActivityItem

