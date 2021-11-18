package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommandVisibility

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Comment is visible for all the users who can read the issue.
 *
 * @param id 
 * @param dollarType 
 */

class CommandUnlimitedVisibility (

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : CommandVisibility(id, dollarType)

