package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Describes rules that define which colors are used for cards on the agile board.
 *
 * @param id 
 * @param dollarType 
 */
open class ColorCoding (

    @JsonProperty("id")
    open val id: String? = null,
    @JsonProperty("\$type")
    open val dollarType: String? = null
)

