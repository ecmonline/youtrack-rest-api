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

import online.ecm.youtrack.model.BundleCustomFieldDefaults
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.StateBundle
import online.ecm.youtrack.model.StateBundleCustomFieldDefaultsAllOf
import online.ecm.youtrack.model.StateBundleElement

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Default settings for the state-type field.
 *
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param id 
 * @param dollarType 
 * @param bundle 
 * @param defaultValues 
 */

data class StateBundleCustomFieldDefaults (

    @field:JsonProperty("canBeEmpty")
    override val canBeEmpty: kotlin.Boolean? = null,

    @field:JsonProperty("emptyFieldText")
    override val emptyFieldText: kotlin.String? = null,

    @field:JsonProperty("isPublic")
    override val isPublic: kotlin.Boolean? = null,

    @field:JsonProperty("parent")
    override val parent: CustomField? = null,

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("bundle")
    val bundle: StateBundle? = null,

    @field:JsonProperty("defaultValues")
    val defaultValues: kotlin.collections.List<StateBundleElement>? = null

) : BundleCustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

