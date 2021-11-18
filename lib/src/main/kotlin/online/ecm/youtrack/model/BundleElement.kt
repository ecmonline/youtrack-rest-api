package online.ecm.youtrack.model

import online.ecm.youtrack.model.Bundle
import online.ecm.youtrack.model.FieldStyle

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents a field value in YouTrack.
 *
 * @param name 
 * @param bundle 
 * @param description 
 * @param ordinal 
 * @param color 
 * @param hasRunningJob 
 * @param id 
 * @param dollarType 
 */
open class BundleElement (

    @JsonProperty("name")
    open val name: String? = null,
    @JsonProperty("bundle")
    open val bundle: Bundle? = null,
    @JsonProperty("description")
    open val description: String? = null,
    @JsonProperty("ordinal")
    open val ordinal: Int? = null,
    @JsonProperty("color")
    open val color: FieldStyle? = null,
    @JsonProperty("hasRunningJob")
    open val hasRunningJob: Boolean? = null,
    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

