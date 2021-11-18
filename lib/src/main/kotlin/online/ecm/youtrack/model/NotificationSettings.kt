package online.ecm.youtrack.model

import online.ecm.youtrack.model.EmailSettings
import online.ecm.youtrack.model.JabberSettings

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the Notifications settings of the YouTrack service.
 *
 * @param emailSettings 
 * @param jabberSettings 
 * @param id 
 * @param dollarType 
 */
class NotificationSettings (

    @JsonProperty("emailSettings")
    val emailSettings: EmailSettings? = null,
    @JsonProperty("jabberSettings")
    val jabberSettings: JabberSettings? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

