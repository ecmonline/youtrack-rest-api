package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the System settings that affect core functionality of YouTrack.
 *
 * @param baseUrl 
 * @param maxUploadFileSize 
 * @param maxExportItems 
 * @param administratorEmail 
 * @param allowStatisticsCollection 
 * @param isApplicationReadOnly 
 * @param id 
 * @param dollarType 
 */
class SystemSettings (

    @JsonProperty("baseUrl")
    val baseUrl: String? = null,
    @JsonProperty("maxUploadFileSize")
    val maxUploadFileSize: Long? = null,
    @JsonProperty("maxExportItems")
    val maxExportItems: Int? = null,
    @JsonProperty("administratorEmail")
    val administratorEmail: String? = null,
    @JsonProperty("allowStatisticsCollection")
    val allowStatisticsCollection: Boolean? = null,
    @JsonProperty("isApplicationReadOnly")
    val isApplicationReadOnly: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

