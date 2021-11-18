package online.ecm.youtrack.model

import online.ecm.youtrack.model.AgileColumnFieldValue
import online.ecm.youtrack.model.ColumnSettings
import online.ecm.youtrack.model.WIPLimit

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents settings for a single board column
 *
 * @param presentation 
 * @param isResolved 
 * @param ordinal 
 * @param parent 
 * @param wipLimit 
 * @param fieldValues 
 * @param id 
 * @param dollarType 
 */
class AgileColumn (

    @JsonProperty("presentation")
    val presentation: String? = null,
    @JsonProperty("isResolved")
    val isResolved: Boolean? = null,
    @JsonProperty("ordinal")
    val ordinal: Int? = null,
    @JsonProperty("parent")
    val parent: ColumnSettings? = null,
    @JsonProperty("wipLimit")
    val wipLimit: WIPLimit? = null,
    @JsonProperty("fieldValues")
    val fieldValues: List<AgileColumnFieldValue>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

