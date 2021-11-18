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
import online.ecm.youtrack.model.FieldStyle
import online.ecm.youtrack.model.LocalizableBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents an enumeration value in YouTrack.
 *
 * @param name 
 * @param bundle 
 * @param description 
 * @param ordinal 
 * @param color 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 * @param localizedName 
 */

data class EnumBundleElement (

    @field:JsonProperty("name")
    override val name: kotlin.String? = null,

    @field:JsonProperty("bundle")
    override val bundle: Bundle? = null,

    @field:JsonProperty("description")
    override val description: kotlin.String? = null,

    @field:JsonProperty("ordinal")
    override val ordinal: kotlin.Int? = null,

    @field:JsonProperty("color")
    override val color: FieldStyle? = null,

    @field:JsonProperty("hasRunningJob")
    override val hasRunningJob: kotlin.Boolean? = null,

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("localizedName")
    override val localizedName: kotlin.String? = null

) : LocalizableBundleElement(name, bundle, description, ordinal, color, hasRunningJob, id, dollarType, localizedName)

