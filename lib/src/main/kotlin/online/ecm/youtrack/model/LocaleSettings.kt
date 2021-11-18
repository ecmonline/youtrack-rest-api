package online.ecm.youtrack.model

import online.ecm.youtrack.model.LocaleDescriptor

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the System Language settings.
 *
 * @param locale 
 * @param isRTL 
 * @param id 
 * @param dollarType 
 */
class LocaleSettings (

    @JsonProperty("locale")
    val locale: LocaleDescriptor? = null,
    @JsonProperty("isRTL")
    val isRTL: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

