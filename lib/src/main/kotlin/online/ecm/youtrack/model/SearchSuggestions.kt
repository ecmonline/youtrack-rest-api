package online.ecm.youtrack.model

import online.ecm.youtrack.model.IssueFolder
import online.ecm.youtrack.model.Suggestion

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Represents the list of search suggestions for the currently entered search query.
 *
 * @param caret 
 * @param ignoreUnresolvedSetting 
 * @param query 
 * @param suggestions 
 * @param folders 
 * @param id 
 * @param dollarType 
 */
class SearchSuggestions (

    @JsonProperty("caret")
    val caret: Int? = null,
    @JsonProperty("ignoreUnresolvedSetting")
    val ignoreUnresolvedSetting: Boolean? = null,
    @JsonProperty("query")
    val query: String? = null,
    @JsonProperty("suggestions")
    val suggestions: List<Suggestion>? = null,
    @JsonProperty("folders")
    val folders: List<IssueFolder>? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

