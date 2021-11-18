package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the settings of a link type in YouTrack.
 *
 * @param name 
 * @param localizedName 
 * @param sourceToTarget 
 * @param localizedSourceToTarget 
 * @param targetToSource 
 * @param localizedTargetToSource 
 * @param directed 
 * @param aggregation 
 * @param readOnly 
 * @param id 
 * @param dollarType 
 */
class IssueLinkType (

    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("localizedName")
    val localizedName: String? = null,
    @JsonProperty("sourceToTarget")
    val sourceToTarget: String? = null,
    @JsonProperty("localizedSourceToTarget")
    val localizedSourceToTarget: String? = null,
    @JsonProperty("targetToSource")
    val targetToSource: String? = null,
    @JsonProperty("localizedTargetToSource")
    val localizedTargetToSource: String? = null,
    @JsonProperty("directed")
    val directed: Boolean? = null,
    @JsonProperty("aggregation")
    val aggregation: Boolean? = null,
    @JsonProperty("readOnly")
    val readOnly: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

