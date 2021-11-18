package online.ecm.youtrack.model

class IssueImpl(
    override val idReadable: String? = null,
    override val created: Long? = null,
    override val updated: Long? = null,
    override val resolved: Long? = null,
    override val numberInProject: Long? = null,
    override val project: Project? = null,
    override val summary: String? = null,
    override val description: String? = null,
    override val usesMarkdown: Boolean? = null,
    override val wikifiedDescription: String? = null,
    override val reporter: User? = null,
    override val updater: User? = null,
    override val draftOwner: User? = null,
    override val isDraft: Boolean? = null,
    override val visibility: Visibility? = null,
    override val votes: Int? = null,
    override val comments: List<IssueComment>? = null,
    override val commentsCount: Int? = null,
    override val tags: List<IssueTag>? = null,
    override val links: List<IssueLink>? = null,
    override val externalIssue: ExternalIssue? = null,
    override val customFields: List<IssueCustomField>? = null,
    override val voters: IssueVoters? = null,
    override val watchers: IssueWatchers? = null,
    override val attachments: List<IssueAttachment>? = null,
    override val subtasks: IssueLink? = null,
    override val parent: IssueLink? = null,
    override val id: String? = null,
    override val dollarType: String? = null
) : Issue {
}