package online.ecm.youtrack.model

import com.fasterxml.jackson.annotation.JsonProperty

enum class ArchiveFormat(val value: kotlin.String) {
    @JsonProperty(value = "TAR_GZ")
    TARGZ("TAR_GZ"),

    @JsonProperty(value = "ZIP")
    ZIP("ZIP")
}