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

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.CustomFieldDefaults

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents field defaults for bundle fields.
 *
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param isPublic 
 * @param parent 
 * @param id 
 * @param dollarType 
 */

open class BundleCustomFieldDefaults (

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
    override val dollarType: kotlin.String? = null

) : CustomFieldDefaults

