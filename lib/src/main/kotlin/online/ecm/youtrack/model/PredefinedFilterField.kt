package online.ecm.youtrack.model

import online.ecm.youtrack.model.FilterField

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a predefined field of the issue. Predefined fields are always present in an issue and             |cannot be customized in a project. For example, `project`, `created`,             |`updated`, `tags`, and so on.
 *
 * @param name 
 * @param id 
 * @param dollarType 
 */

class PredefinedFilterField (

    @JsonProperty("name")
    override val name: String? = null,

    @JsonProperty("id")
    override val id: String? = null,

    @JsonProperty("\$type")
    override val dollarType: String? = null

) : FilterField(name, id, dollarType)

