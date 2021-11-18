package online.ecm.youtrack.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 *
 *
 * @param id
 * @param dollarType
 */
class ActivityCategory (

    @JsonProperty("id")
    val id: String? = null,

    @JsonProperty("\$type")
    val dollarType: String? = null
)

