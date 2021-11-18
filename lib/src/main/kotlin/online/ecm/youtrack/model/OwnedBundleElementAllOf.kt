package online.ecm.youtrack.model

import online.ecm.youtrack.model.User

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param owner 
 */

class OwnedBundleElementAllOf (

    @JsonProperty("owner")
    val owner: User? = null

)

