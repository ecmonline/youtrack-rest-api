package online.ecm.youtrack.model

import online.ecm.youtrack.model.User
import online.ecm.youtrack.model.UserBundle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param bundle 
 * @param defaultValues 
 */

class UserCustomFieldDefaultsAllOf (

    @JsonProperty("bundle")
    val bundle: UserBundle? = null,

    @JsonProperty("defaultValues")
    val defaultValues: List<User>? = null

)

