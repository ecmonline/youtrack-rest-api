package online.ecm.youtrack.model


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Stores number of online user.
 *
 * @param users 
 * @param id 
 * @param dollarType 
 */
class OnlineUsers (

    @JsonProperty("users")
    val users: Int? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

