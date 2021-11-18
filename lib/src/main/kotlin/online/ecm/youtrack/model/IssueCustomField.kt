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
open class IssueCustomField (

    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

