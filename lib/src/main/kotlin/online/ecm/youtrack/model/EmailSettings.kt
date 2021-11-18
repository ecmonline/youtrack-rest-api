package online.ecm.youtrack.model

import online.ecm.youtrack.model.StorageEntry

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents email settings for this YouTrack installation.
 *
 * @param isEnabled
 * @param host
 * @param port
 * @param mailProtocol
 * @param anonymous
 * @param login
 * @param sslKey
 * @param from
 * @param replyTo
 * @param id
 * @param dollarType
 */
class EmailSettings(

    @JsonProperty("isEnabled")
    val isEnabled: Boolean? = null,
    @JsonProperty("host")
    val host: String? = null,
    @JsonProperty("port")
    val port: Int? = null,
    @JsonProperty("mailProtocol")
    val mailProtocol: MailProtocol? = null,
    @JsonProperty("anonymous")
    val anonymous: Boolean? = null,
    @JsonProperty("login")
    val login: String? = null,
    @JsonProperty("sslKey")
    val sslKey: StorageEntry? = null,
    @JsonProperty("from")
    val from: String? = null,
    @JsonProperty("replyTo")
    val replyTo: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

enum class MailProtocol(val value: String) {
    @JsonProperty(value = "SMTP")
    SMTP("SMTP"),
    @JsonProperty(value = "SMTPS")
    SMTPS("SMTPS"),
    @JsonProperty(value = "SMTP_TLS")
    SMTPTLS("SMTP_TLS");
}
