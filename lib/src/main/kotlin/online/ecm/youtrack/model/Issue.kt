package online.ecm.youtrack.model

import com.fasterxml.jackson.annotation.JsonProperty

class Issue (
    @JsonProperty("idReadable")
    val idReadable: String? = null,
    @JsonProperty("created")
    val created: Long? = null,
    @JsonProperty("updated")
    val updated: Long? = null,
    @JsonProperty("resolved")
    val resolved: Long? = null,
    @JsonProperty("numberInProject")
    val numberInProject: Long? = null,
    @JsonProperty("project")
    val project: Project? = null,
    @JsonProperty("summary")
    val summary: String? = null,
    @JsonProperty("description")
    val description: String? = null,
    @JsonProperty("usesMarkdown")
    val usesMarkdown: Boolean? = null,
    @JsonProperty("wikifiedDescription")
    val wikifiedDescription: String? = null,
    @JsonProperty("reporter")
    val reporter: User? = null,
    @JsonProperty("updater")
    val updater: User? = null,
    @JsonProperty("draftOwner")
    val draftOwner: User? = null,
    @JsonProperty("isDraft")
    val isDraft: Boolean? = null,
    @JsonProperty("visibility")
    val visibility: Visibility? = null,
    @JsonProperty("votes")
    val votes: Int? = null,
    @JsonProperty("comments")
    val comments: List<IssueComment>? = null,
    @JsonProperty("commentsCount")
    val commentsCount: Int? = null,
    @JsonProperty("tags")
    val tags: List<IssueTag>? = null,
    @JsonProperty("links")
    val links: List<IssueLink>? = null,
    @JsonProperty("externalIssue")
    val externalIssue: ExternalIssue? = null,
    @JsonProperty("customFields")
    val customFields: List<IssueCustomField>? = null,
    @JsonProperty("voters")
    val voters: IssueVoters? = null,
    @JsonProperty("watchers")
    val watchers: IssueWatchers? = null,
    @JsonProperty("attachments")
    val attachments: List<IssueAttachment>? = null,
    @JsonProperty("subtasks")
    val subtasks: IssueLink? = null,
    @JsonProperty("parent")
    val parent: IssueLink? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("\$type")
    val dollarType: String? = null
)

