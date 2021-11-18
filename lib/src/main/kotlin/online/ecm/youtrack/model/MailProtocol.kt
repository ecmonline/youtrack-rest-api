package online.ecm.youtrack.model

import com.fasterxml.jackson.annotation.JsonProperty

enum class MailProtocol(val value: kotlin.String) {
    @JsonProperty(value = "SMTP") SMTP("SMTP"),
    @JsonProperty(value = "SMTPS") SMTPS("SMTPS"),
    @JsonProperty(value = "SMTP_TLS") SMTPTLS("SMTP_TLS")
}
