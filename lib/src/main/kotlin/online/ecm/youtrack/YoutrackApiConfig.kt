package online.ecm.youtrack

class YoutrackApiConfig(
    val baseUrl: String,
    val authToken: String,
    val apiPath: String = "/youtrack/api"
)