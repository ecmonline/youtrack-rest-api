package online.ecm.youtrack.model

import online.ecm.youtrack.model.CustomField
import online.ecm.youtrack.model.CustomFieldDefaults
import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserBundle
import online.ecm.youtrack.model.UserCustomFieldDefaultsAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents default settings for the user-type field.
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

class UserCustomFieldDefaults (

    @JsonProperty("canBeEmpty")
    override val canBeEmpty: Boolean? = null,

    @JsonProperty("emptyFieldText")
    override val emptyFieldText: String? = null,

    @JsonProperty("isPublic")
    override val isPublic: Boolean? = null,

    @JsonProperty("parent")
    override val parent: CustomField? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null,

    @JsonProperty("bundle")
    val bundle: UserBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<User>? = null

) : CustomFieldDefaults(canBeEmpty, emptyFieldText, isPublic, parent, id, dollarType)

