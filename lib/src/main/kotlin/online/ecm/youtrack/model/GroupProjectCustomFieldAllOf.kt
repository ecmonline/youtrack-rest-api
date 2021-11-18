package online.ecm.youtrack.model

import online.ecm.youtrack.model.UserGroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param defaultValues 
 */

class GroupProjectCustomFieldAllOf (

    @JsonProperty("defaultValues")
    val defaultValues: List<UserGroup>? = null

)

