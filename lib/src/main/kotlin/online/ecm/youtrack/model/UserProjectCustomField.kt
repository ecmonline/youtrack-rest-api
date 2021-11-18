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

import online.ecm.youtrack.model.BundleProjectCustomField
import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.Project
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserBundle
import online.ecm.youtrack.model.UserCustomFieldDefaultsAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents project settings for the user field.
 *
 * @param `field` 
 * @param project 
 * @param canBeEmpty 
 * @param emptyFieldText 
 * @param ordinal 
 * @param isPublic 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 * @param bundle 
 * @param defaultValues 
 */

data class UserProjectCustomField (

    @field:JsonProperty("field")
    override val `field`: CustomField? = null,

    @field:JsonProperty("project")
    override val project: Project? = null,

    @field:JsonProperty("canBeEmpty")
    override val canBeEmpty: kotlin.Boolean? = null,

    @field:JsonProperty("emptyFieldText")
    override val emptyFieldText: kotlin.String? = null,

    @field:JsonProperty("ordinal")
    override val ordinal: kotlin.Int? = null,

    @field:JsonProperty("isPublic")
    override val isPublic: kotlin.Boolean? = null,

    @field:JsonProperty("hasRunningJob")
    override val hasRunningJob: kotlin.Boolean? = null,

    @field:JsonProperty("id")
    override val id: kotlin.String? = null,

    @field:JsonProperty("\$type")
    override val dollarType: kotlin.String? = null,

    @field:JsonProperty("bundle")
    val bundle: UserBundle? = null,

    @field:JsonProperty("defaultValues")
    val defaultValues: kotlin.collections.List<User>? = null

) : BundleProjectCustomField(
    field,
    project,
    canBeEmpty,
    emptyFieldText,
    ordinal,
    isPublic,
    hasRunningJob,
    id,
    dollarType
)

