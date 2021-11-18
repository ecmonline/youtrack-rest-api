package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the notification settings in the profile of the specific user.
 *
 * @param notifyOnOwnChanges 
 * @param jabberNotificationsEnabled 
 * @param emailNotificationsEnabled 
 * @param mentionNotificationsEnabled 
 * @param duplicateClusterNotificationsEnabled 
 * @param mailboxIntegrationNotificationsEnabled 
 * @param usePlainTextEmails 
 * @param autoWatchOnComment 
 * @param autoWatchOnCreate 
 * @param autoWatchOnVote 
 * @param autoWatchOnUpdate 
 * @param id 
 * @param dollarType 
 */
class NotificationsUserProfile (

    @JsonProperty("notifyOnOwnChanges")
    val notifyOnOwnChanges: Boolean? = null,
    @JsonProperty("jabberNotificationsEnabled")
    val jabberNotificationsEnabled: Boolean? = null,
    @JsonProperty("emailNotificationsEnabled")
    val emailNotificationsEnabled: Boolean? = null,
    @JsonProperty("mentionNotificationsEnabled")
    val mentionNotificationsEnabled: Boolean? = null,
    @JsonProperty("duplicateClusterNotificationsEnabled")
    val duplicateClusterNotificationsEnabled: Boolean? = null,
    @JsonProperty("mailboxIntegrationNotificationsEnabled")
    val mailboxIntegrationNotificationsEnabled: Boolean? = null,
    @JsonProperty("usePlainTextEmails")
    val usePlainTextEmails: Boolean? = null,
    @JsonProperty("autoWatchOnComment")
    val autoWatchOnComment: Boolean? = null,
    @JsonProperty("autoWatchOnCreate")
    val autoWatchOnCreate: Boolean? = null,
    @JsonProperty("autoWatchOnVote")
    val autoWatchOnVote: Boolean? = null,
    @JsonProperty("autoWatchOnUpdate")
    val autoWatchOnUpdate: Boolean? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

