package online.ecm.youtrack.model

import online.ecm.youtrack.model.GeneralUserProfile
import online.ecm.youtrack.model.NotificationsUserProfile
import online.ecm.youtrack.model.TimeTrackingUserProfile

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * 
 *
 * @param general 
 * @param notifications 
 * @param timetracking 
 * @param id 
 * @param dollarType 
 */
class UserProfiles (

    @JsonProperty("general")
    val general: GeneralUserProfile? = null,
    @JsonProperty("notifications")
    val notifications: NotificationsUserProfile? = null,
    @JsonProperty("timetracking")
    val timetracking: TimeTrackingUserProfile? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

