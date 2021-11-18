package online.ecm.youtrack.model

import online.ecm.youtrack.model.AgileColumn
import online.ecm.youtrack.model.CustomField

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Agile board columns settings.
 *
 * @param field 
 * @param columns 
 * @param id 
 * @param dollarType 
 */
class ColumnSettings (

    @JsonProperty("field")
    val field: CustomField? = null,
    @JsonProperty("columns")
    val columns: List<AgileColumn>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

