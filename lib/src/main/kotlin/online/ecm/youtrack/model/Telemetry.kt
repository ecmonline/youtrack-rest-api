package online.ecm.youtrack.model

import online.ecm.youtrack.model.OnlineUsers

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Telemetry data of the YouTrack installation.
 *
 * @param installationFolder 
 * @param databaseLocation 
 * @param logsLocation 
 * @param availableProcessors 
 * @param availableMemory 
 * @param allocatedMemory 
 * @param usedMemory 
 * @param uptime 
 * @param startedTime 
 * @param databaseBackgroundThreads 
 * @param pendingAsyncJobs 
 * @param cachedResultsCountInDBQueriesCache 
 * @param databaseQueriesCacheHitRate 
 * @param blobStringsCacheHitRate 
 * @param totalTransactions 
 * @param transactionsPerSecond 
 * @param requestsPerSecond 
 * @param databaseSize 
 * @param fullDatabaseSize 
 * @param textIndexSize 
 * @param onlineUsers 
 * @param reportCalculatorThreads 
 * @param notificationAnalyzerThreads 
 * @param id 
 * @param dollarType 
 */
class Telemetry (

    @JsonProperty("installationFolder")
    val installationFolder: String? = null,
    @JsonProperty("databaseLocation")
    val databaseLocation: String? = null,
    @JsonProperty("logsLocation")
    val logsLocation: String? = null,
    @JsonProperty("availableProcessors")
    val availableProcessors: Int? = null,
    @JsonProperty("availableMemory")
    val availableMemory: String? = null,
    @JsonProperty("allocatedMemory")
    val allocatedMemory: String? = null,
    @JsonProperty("usedMemory")
    val usedMemory: String? = null,
    @JsonProperty("uptime")
    val uptime: String? = null,
    @JsonProperty("startedTime")
    val startedTime: Long? = null,
    @JsonProperty("databaseBackgroundThreads")
    val databaseBackgroundThreads: Int? = null,
    @JsonProperty("pendingAsyncJobs")
    val pendingAsyncJobs: Int? = null,
    @JsonProperty("cachedResultsCountInDBQueriesCache")
    val cachedResultsCountInDBQueriesCache: Int? = null,
    @JsonProperty("databaseQueriesCacheHitRate")
    val databaseQueriesCacheHitRate: String? = null,
    @JsonProperty("blobStringsCacheHitRate")
    val blobStringsCacheHitRate: String? = null,
    @JsonProperty("totalTransactions")
    val totalTransactions: Long? = null,
    @JsonProperty("transactionsPerSecond")
    val transactionsPerSecond: String? = null,
    @JsonProperty("requestsPerSecond")
    val requestsPerSecond: String? = null,
    @JsonProperty("databaseSize")
    val databaseSize: String? = null,
    @JsonProperty("fullDatabaseSize")
    val fullDatabaseSize: String? = null,
    @JsonProperty("textIndexSize")
    val textIndexSize: String? = null,
    @JsonProperty("onlineUsers")
    val onlineUsers: OnlineUsers? = null,
    @JsonProperty("reportCalculatorThreads")
    val reportCalculatorThreads: Int? = null,
    @JsonProperty("notificationAnalyzerThreads")
    val notificationAnalyzerThreads: Int? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

