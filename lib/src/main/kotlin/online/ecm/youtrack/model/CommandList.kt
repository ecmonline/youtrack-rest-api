package online.ecm.youtrack.model

import online.ecm.youtrack.model.CommandVisibility
import online.ecm.youtrack.model.Issue
import online.ecm.youtrack.model.ParsedCommand
import online.ecm.youtrack.model.Suggestion

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents list of command and related comment in YouTrack. Can be used to either apply a command or get command suggestions.
 *
 * @param comment 
 * @param visibility 
 * @param query 
 * @param caret 
 * @param silent 
 * @param usesMarkdown 
 * @param runAs 
 * @param commands 
 * @param issues 
 * @param suggestions 
 * @param id 
 * @param dollarType 
 */
class CommandList (

    @JsonProperty("comment")
    val comment: String? = null,
    @JsonProperty("visibility")
    val visibility: CommandVisibility? = null,
    @JsonProperty("query")
    val query: String? = null,
    @JsonProperty("caret")
    val caret: Int? = null,
    @JsonProperty("silent")
    val silent: Boolean? = null,
    @JsonProperty("usesMarkdown")
    val usesMarkdown: Boolean? = null,
    @JsonProperty("runAs")
    val runAs: String? = null,
    @JsonProperty("commands")
    val commands: List<ParsedCommand>? = null,
    @JsonProperty("issues")
    val issues: List<Issue>? = null,
    @JsonProperty("suggestions")
    val suggestions: List<Suggestion>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

