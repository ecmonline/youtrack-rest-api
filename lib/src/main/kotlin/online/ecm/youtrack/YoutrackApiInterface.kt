package online.ecm.youtrack

import online.ecm.youtrack.model.*
import java.time.LocalDate

interface YoutrackApiInterface {

    fun activitiesGet(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ActivityItem>? {throw NotImplementedError()}
    fun activitiesIdGet(id: String, fields: String?) : ActivityItem? {throw NotImplementedError()}
    fun activitiesPageGet(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, cursor: String?, activityId: String?, fields: String?) : ActivityCursorPage? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesBuildGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<BuildBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesBuildIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesBuildIdGet(id: String, fields: String?) : BuildBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesBuildIdPost(id: String, fields: String?, buildBundle: BuildBundle?) : BuildBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesBuildPost(fields: String?, buildBundle: BuildBundle?) : BuildBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesEnumGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<EnumBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesEnumIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesEnumIdGet(id: String, fields: String?) : EnumBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesEnumIdPost(id: String, fields: String?, enumBundle: EnumBundle?) : EnumBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesEnumPost(fields: String?, enumBundle: EnumBundle?) : EnumBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesOwnedFieldGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<OwnedBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesOwnedFieldIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesOwnedFieldIdGet(id: String, fields: String?) : OwnedBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesOwnedFieldIdPost(id: String, fields: String?, ownedBundle: OwnedBundle?) : OwnedBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesOwnedFieldPost(fields: String?, ownedBundle: OwnedBundle?) : OwnedBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesStateGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<StateBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesStateIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesStateIdGet(id: String, fields: String?) : StateBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesStateIdPost(id: String, fields: String?, stateBundle: StateBundle?) : StateBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesStatePost(fields: String?, stateBundle: StateBundle?) : StateBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdAggregatedUsersGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdGet(id: String, fields: String?) : UserBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdGroupsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserGroup>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdGroupsPost(id: String, fields: String?, userGroup: UserGroup?) : UserGroup? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdDelete(id: String, userGroupId: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdGet(id: String, userGroupId: String, fields: String?) : UserGroup? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdIndividualsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdIndividualsPost(id: String, fields: String?, user: User?) : User? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdDelete(id: String, userId: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdGet(id: String, userId: String, fields: String?) : User? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserIdPost(id: String, fields: String?, userBundle: UserBundle?) : UserBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesUserPost(fields: String?, userBundle: UserBundle?) : UserBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesVersionGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<VersionBundle>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesVersionIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesVersionIdGet(id: String, fields: String?) : VersionBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesVersionIdPost(id: String, fields: String?, versionBundle: VersionBundle?) : VersionBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsBundlesVersionPost(fields: String?, versionBundle: VersionBundle?) : VersionBundle? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<CustomField>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdDelete(id: String) {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsGet(id: String, fields: String?) : CustomFieldDefaults? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsPost(id: String, fields: String?, customFieldDefaults: CustomFieldDefaults?) : CustomFieldDefaults? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdGet(id: String, fields: String?) : CustomField? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdInstancesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ProjectCustomField>? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsIdPost(id: String, fields: String?, customField: CustomField?) : CustomField? {throw NotImplementedError()}
    fun adminCustomFieldSettingsCustomFieldsPost(fields: String?, customField: CustomField?) : CustomField? {throw NotImplementedError()}
    fun adminCustomFieldSettingsTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<FieldType>? {throw NotImplementedError()}
    fun adminDatabaseBackupBackupsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<BackupFile>? {throw NotImplementedError()}
    fun adminDatabaseBackupBackupsIdGet(id: String, fields: String?) : BackupFile? {throw NotImplementedError()}
    fun adminDatabaseBackupSettingsBackupStatusGet(fields: String?) : BackupStatus? {throw NotImplementedError()}
    fun adminDatabaseBackupSettingsGet(fields: String?) : DatabaseBackupSettings? {throw NotImplementedError()}
    fun adminDatabaseBackupSettingsPost(fields: String?, databaseBackupSettings: DatabaseBackupSettings?) : DatabaseBackupSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsAppearanceSettingsGet(fields: String?) : AppearanceSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsAppearanceSettingsPost(fields: String?, appearanceSettings: AppearanceSettings?) : AppearanceSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsGet(fields: String?) : GlobalSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsLicenseGet(fields: String?) : License? {throw NotImplementedError()}
    fun adminGlobalSettingsLicensePost(fields: String?, license: License?) : License? {throw NotImplementedError()}
    fun adminGlobalSettingsLocaleSettingsGet(fields: String?) : LocaleSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsLocaleSettingsPost(fields: String?, localeSettings: LocaleSettings?) : LocaleSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsNotificationSettingsGet(fields: String?) : NotificationSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsNotificationSettingsPost(fields: String?, notificationSettings: NotificationSettings?) : NotificationSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsPost(fields: String?, globalSettings: GlobalSettings?) : GlobalSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsRestSettingsGet(fields: String?) : RestCorsSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsRestSettingsPost(fields: String?, restCorsSettings: RestCorsSettings?) : RestCorsSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsSystemSettingsGet(fields: String?) : SystemSettings? {throw NotImplementedError()}
    fun adminGlobalSettingsSystemSettingsPost(fields: String?, systemSettings: SystemSettings?) : SystemSettings? {throw NotImplementedError()}
    fun adminProjectsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Project>? {throw NotImplementedError()}
    fun adminProjectsIdCustomFieldsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ProjectCustomField>? {throw NotImplementedError()}
    fun adminProjectsIdCustomFieldsPost(id: String, fields: String?, projectCustomField: ProjectCustomField?) : ProjectCustomField? {throw NotImplementedError()}
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdDelete(id: String, projectCustomFieldId: String) {throw NotImplementedError()}
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdGet(id: String, projectCustomFieldId: String, fields: String?) : ProjectCustomField? {throw NotImplementedError()}
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdPost(id: String, projectCustomFieldId: String, fields: String?, projectCustomField: ProjectCustomField?) : ProjectCustomField? {throw NotImplementedError()}
    fun adminProjectsIdDelete(id: String) {throw NotImplementedError()}
    fun adminProjectsIdGet(id: String, fields: String?) : Project? {throw NotImplementedError()}
    fun adminProjectsIdIssuesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {throw NotImplementedError()}
    fun adminProjectsIdIssuesIssueIdDelete(id: String, issueId: String) {throw NotImplementedError()}
    fun adminProjectsIdIssuesIssueIdGet(id: String, issueId: String, fields: String?) : Issue? {throw NotImplementedError()}
    fun adminProjectsIdIssuesIssueIdPost(id: String, issueId: String, fields: String?, issue: Issue?) : Issue? {throw NotImplementedError()}
    fun adminProjectsIdIssuesPost(id: String, fields: String?, issue: Issue?) : Issue? {throw NotImplementedError()}
    fun adminProjectsIdPost(id: String, fields: String?, project: Project?) : Project? {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsGet(id: String, fields: String?) : ProjectTimeTrackingSettings? {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsPost(id: String, fields: String?, projectTimeTrackingSettings: ProjectTimeTrackingSettings?) : ProjectTimeTrackingSettings? {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<WorkItemType>? {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesPost(id: String, fields: String?, workItemType: WorkItemType?) : WorkItemType? {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDelete(id: String, workItemTypeId: String) {throw NotImplementedError()}
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGet(id: String, workItemTypeId: String, fields: String?) : WorkItemType? {throw NotImplementedError()}
    fun adminProjectsPost(template: String?, fields: String?, project: Project?) : Project? {throw NotImplementedError()}
    fun adminTelemetryGet(fields: String?) : Telemetry? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsGet(fields: String?) : GlobalTimeTrackingSettings? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkItemTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<WorkItemType>? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkItemTypesPost(fields: String?, workItemType: WorkItemType?) : WorkItemType? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDelete(workItemTypeId: String) {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGet(workItemTypeId: String, fields: String?) : WorkItemType? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdPost(workItemTypeId: String, fields: String?, workItemType: WorkItemType?) : WorkItemType? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkTimeSettingsGet(fields: String?) : WorkTimeSettings? {throw NotImplementedError()}
    fun adminTimeTrackingSettingsWorkTimeSettingsPost(fields: String?, workTimeSettings: WorkTimeSettings?) : WorkTimeSettings? {throw NotImplementedError()}
    fun agilesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Agile>? {throw NotImplementedError()}
    fun agilesIdDelete(id: String) {throw NotImplementedError()}
    fun agilesIdGet(id: String, fields: String?) : Agile? {throw NotImplementedError()}
    fun agilesIdPost(id: String, fields: String?, agile: Agile?) : Agile? {throw NotImplementedError()}
    fun agilesIdSprintsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Sprint>? {throw NotImplementedError()}
    fun agilesIdSprintsPost(id: String, fields: String?, sprint: Sprint?) : Sprint? {throw NotImplementedError()}
    fun agilesIdSprintsSprintIdDelete(id: String, sprintId: String) {throw NotImplementedError()}
    fun agilesIdSprintsSprintIdGet(id: String, sprintId: String, fields: String?) : Sprint? {throw NotImplementedError()}
    fun agilesIdSprintsSprintIdPost(id: String, sprintId: String, fields: String?, sprint: Sprint?) : Sprint? {throw NotImplementedError()}
    fun agilesPost(template: String?, fields: String?, agile: Agile?) : Agile? {throw NotImplementedError()}
    fun commandsAssistGet(fields: String?) : CommandList? {throw NotImplementedError()}
    fun commandsGet(fields: String?) : CommandList? {throw NotImplementedError()}
    fun groupsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserGroup>? {throw NotImplementedError()}
    fun groupsIdGet(id: String, fields: String?) : UserGroup? {throw NotImplementedError()}
    fun issueLinkTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueLinkType>? {throw NotImplementedError()}
    fun issueLinkTypesIdDelete(id: String) {throw NotImplementedError()}
    fun issueLinkTypesIdGet(id: String, fields: String?) : IssueLinkType? {throw NotImplementedError()}
    fun issueLinkTypesIdPost(id: String, fields: String?, issueLinkType: IssueLinkType?) : IssueLinkType? {throw NotImplementedError()}
    fun issueLinkTypesPost(fields: String?, issueLinkType: IssueLinkType?) : IssueLinkType? {throw NotImplementedError()}
    fun issueTagsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueTag>? {throw NotImplementedError()}
    fun issueTagsIdDelete(id: String) {throw NotImplementedError()}
    fun issueTagsIdGet(id: String, fields: String?) : IssueTag? {throw NotImplementedError()}
    fun issueTagsIdIssuesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {throw NotImplementedError()}
    fun issueTagsIdPost(id: String, fields: String?, issueTag: IssueTag?) : IssueTag? {throw NotImplementedError()}
    fun issueTagsPost(fields: String?, issueTag: IssueTag?) : IssueTag? {throw NotImplementedError()}
    fun issuesGet(query: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {throw NotImplementedError()}
    fun issuesIdActivitiesActivityItemIdGet(id: String, activityItemId: String, fields: String?) : ActivityItem? {throw NotImplementedError()}
    fun issuesIdActivitiesGet(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ActivityItem>? {throw NotImplementedError()}
    fun issuesIdActivitiesPageGet(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, cursor: String?, activityId: String?, fields: String?) : ActivityCursorPage? {throw NotImplementedError()}
    fun issuesIdAttachmentsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueAttachment>? {throw NotImplementedError()}
    fun issuesIdAttachmentsIssueAttachmentIdDelete(id: String, issueAttachmentId: String) {throw NotImplementedError()}
    fun issuesIdAttachmentsIssueAttachmentIdGet(id: String, issueAttachmentId: String, fields: String?) : IssueAttachment? {throw NotImplementedError()}
    fun issuesIdAttachmentsIssueAttachmentIdPost(id: String, issueAttachmentId: String, fields: String?, issueAttachment: IssueAttachment?) : IssueAttachment? {throw NotImplementedError()}
    fun issuesIdAttachmentsPost(id: String, fields: String?, issueAttachment: IssueAttachment?) : IssueAttachment? {throw NotImplementedError()}
    fun issuesIdCommentsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueComment>? {throw NotImplementedError()}
    fun issuesIdCommentsIssueCommentIdDelete(id: String, issueCommentId: String) {throw NotImplementedError()}
    fun issuesIdCommentsIssueCommentIdGet(id: String, issueCommentId: String, fields: String?) : IssueComment? {throw NotImplementedError()}
    fun issuesIdCommentsIssueCommentIdPost(id: String, issueCommentId: String, fields: String?, issueComment: IssueComment?) : IssueComment? {throw NotImplementedError()}
    fun issuesIdCommentsPost(id: String, draftId: String?, fields: String?, issueComment: IssueComment?) : IssueComment? {throw NotImplementedError()}
    fun issuesIdCustomFieldsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueCustomField>? {throw NotImplementedError()}
    fun issuesIdCustomFieldsIssueCustomFieldIdGet(id: String, issueCustomFieldId: String, fields: String?) : IssueCustomField? {throw NotImplementedError()}
    fun issuesIdCustomFieldsIssueCustomFieldIdPost(id: String, issueCustomFieldId: String, fields: String?, issueCustomField: IssueCustomField?) : IssueCustomField? {throw NotImplementedError()}
    fun issuesIdDelete(id: String) {throw NotImplementedError()}
    fun issuesIdGet(id: String, fields: String?) : Issue? {throw NotImplementedError()}
    fun issuesIdLinksGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueLink>? {throw NotImplementedError()}
    fun issuesIdLinksIssueLinkIdGet(id: String, issueLinkId: String, fields: String?) : IssueLink? {throw NotImplementedError()}
    fun issuesIdLinksIssueLinkIdIssuesGet(id: String, issueLinkId: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {throw NotImplementedError()}
    fun issuesIdLinksIssueLinkIdIssuesIssueIdDelete(id: String, issueLinkId: String, issueId: String) {throw NotImplementedError()}
    fun issuesIdLinksIssueLinkIdIssuesPost(id: String, issueLinkId: String, fields: String?, issue: Issue?) : Issue? {throw NotImplementedError()}
    fun issuesIdPost(id: String, fields: String?, issue: Issue?) : Issue? {throw NotImplementedError()}
    fun issuesIdProjectGet(id: String, fields: String?) : Project? {throw NotImplementedError()}
    fun issuesIdProjectPost(id: String, fields: String?, project: Project?) : Project? {throw NotImplementedError()}
    fun issuesIdTimeTrackingGet(id: String, fields: String?) : IssueTimeTracker? {throw NotImplementedError()}
    fun issuesIdTimeTrackingWorkItemsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueWorkItem>? {throw NotImplementedError()}
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdDelete(id: String, issueWorkItemId: String) {throw NotImplementedError()}
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdGet(id: String, issueWorkItemId: String, fields: String?) : IssueWorkItem? {throw NotImplementedError()}
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdPost(id: String, issueWorkItemId: String, fields: String?, issueWorkItem: IssueWorkItem?) : IssueWorkItem? {throw NotImplementedError()}
    fun issuesIdTimeTrackingWorkItemsPost(id: String, fields: String?, issueWorkItem: IssueWorkItem?) : IssueWorkItem? {throw NotImplementedError()}
    fun issuesPost(draftId: String?, fields: String?, issue: Issue?) : Issue? {throw NotImplementedError()}
    fun savedQueriesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<SavedQuery>? {throw NotImplementedError()}
    fun savedQueriesIdDelete(id: String) {throw NotImplementedError()}
    fun savedQueriesIdGet(id: String, fields: String?) : SavedQuery? {throw NotImplementedError()}
    fun savedQueriesIdPost(id: String, fields: String?, savedQuery: SavedQuery?) : SavedQuery? {throw NotImplementedError()}
    fun savedQueriesPost(fields: String?, savedQuery: SavedQuery?) : SavedQuery? {throw NotImplementedError()}
    fun searchAssistGet(fields: String?) : SearchSuggestions? {throw NotImplementedError()}
    fun usersGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {throw NotImplementedError()}
    fun usersIdGet(id: String, fields: String?) : User? {throw NotImplementedError()}
    fun usersIdProfilesGeneralGet(id: String, fields: String?) : GeneralUserProfile? {throw NotImplementedError()}
    fun usersIdProfilesGeneralPost(id: String, fields: String?, generalUserProfile: GeneralUserProfile?) : GeneralUserProfile? {throw NotImplementedError()}
    fun usersIdProfilesNotificationsGet(id: String, fields: String?) : NotificationsUserProfile? {throw NotImplementedError()}
    fun usersIdProfilesNotificationsPost(id: String, fields: String?, notificationsUserProfile: NotificationsUserProfile?) : NotificationsUserProfile? {throw NotImplementedError()}
    fun usersIdProfilesTimetrackingGet(id: String, fields: String?) : TimeTrackingUserProfile? {throw NotImplementedError()}
    fun usersIdProfilesTimetrackingPost(id: String, fields: String?, timeTrackingUserProfile: TimeTrackingUserProfile?) : TimeTrackingUserProfile? {throw NotImplementedError()}
    fun usersIdSavedQueriesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<SavedQuery>? {throw NotImplementedError()}
    fun usersIdTagsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueTag>? {throw NotImplementedError()}
    fun usersMeGet(fields: String?) : Me? {throw NotImplementedError()}
    fun workItemsGet(query: String?, startDate: LocalDate?, endDate: LocalDate?, start: Int?, end: Int?, createdStart: Int?, createdEnd: Int?, updatedStart: Int?, updatedEnd: Int?, author: String?, creator: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueWorkItem>? {throw NotImplementedError()}
    fun workItemsIdGet(id: String, fields: String?) : IssueWorkItem? {throw NotImplementedError()}

    fun activitiesGetRequestConfig(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (categories != null) {
                    put("categories", listOf(categories.toString()))
                }
                if (reverse != null) {
                    put("reverse", listOf(reverse.toString()))
                }
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (end != null) {
                    put("end", listOf(end.toString()))
                }
                if (author != null) {
                    put("author", listOf(author.toString()))
                }
                if (issueQuery != null) {
                    put("issueQuery", listOf(issueQuery.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/activities",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun activitiesIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/activities/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun activitiesPageGetRequestConfig(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, cursor: String?, activityId: String?, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (categories != null) {
                    put("categories", listOf(categories.toString()))
                }
                if (reverse != null) {
                    put("reverse", listOf(reverse.toString()))
                }
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (end != null) {
                    put("end", listOf(end.toString()))
                }
                if (author != null) {
                    put("author", listOf(author.toString()))
                }
                if (issueQuery != null) {
                    put("issueQuery", listOf(issueQuery.toString()))
                }
                if (cursor != null) {
                    put("cursor", listOf(cursor.toString()))
                }
                if (activityId != null) {
                    put("activityId", listOf(activityId.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/activitiesPage",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesBuildGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/build",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesBuildIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/build/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesBuildIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/build/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesBuildIdPostRequestConfig(id: String, fields: String?, buildBundle: BuildBundle?) : RequestConfig<BuildBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/build/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = buildBundle
        )
    }
    fun adminCustomFieldSettingsBundlesBuildPostRequestConfig(fields: String?, buildBundle: BuildBundle?) : RequestConfig<BuildBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/build",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = buildBundle
        )
    }
    fun adminCustomFieldSettingsBundlesEnumGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/enum",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesEnumIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/enum/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesEnumIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/enum/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesEnumIdPostRequestConfig(id: String, fields: String?, enumBundle: EnumBundle?) : RequestConfig<EnumBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/enum/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = enumBundle
        )
    }
    fun adminCustomFieldSettingsBundlesEnumPostRequestConfig(fields: String?, enumBundle: EnumBundle?) : RequestConfig<EnumBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/enum",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = enumBundle
        )
    }
    fun adminCustomFieldSettingsBundlesOwnedFieldGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/ownedField",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesOwnedFieldIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/ownedField/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesOwnedFieldIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/ownedField/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesOwnedFieldIdPostRequestConfig(id: String, fields: String?, ownedBundle: OwnedBundle?) : RequestConfig<OwnedBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/ownedField/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = ownedBundle
        )
    }
    fun adminCustomFieldSettingsBundlesOwnedFieldPostRequestConfig(fields: String?, ownedBundle: OwnedBundle?) : RequestConfig<OwnedBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/ownedField",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = ownedBundle
        )
    }
    fun adminCustomFieldSettingsBundlesStateGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/state",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesStateIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/state/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesStateIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/state/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesStateIdPostRequestConfig(id: String, fields: String?, stateBundle: StateBundle?) : RequestConfig<StateBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/state/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = stateBundle
        )
    }
    fun adminCustomFieldSettingsBundlesStatePostRequestConfig(fields: String?, stateBundle: StateBundle?) : RequestConfig<StateBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/state",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = stateBundle
        )
    }
    fun adminCustomFieldSettingsBundlesUserGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdAggregatedUsersGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}/aggregatedUsers".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/user/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdGroupsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}/groups".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdGroupsPostRequestConfig(id: String, fields: String?, userGroup: UserGroup?) : RequestConfig<UserGroup> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/user/{id}/groups".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = userGroup
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdDeleteRequestConfig(id: String, userGroupId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/user/{id}/groups/{userGroupId}".replace("{"+"id"+"}", id).replace("{"+"userGroupId"+"}",
                userGroupId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdGetRequestConfig(id: String, userGroupId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}/groups/{userGroupId}".replace("{"+"id"+"}", id).replace("{"+"userGroupId"+"}",
                userGroupId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdIndividualsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}/individuals".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdIndividualsPostRequestConfig(id: String, fields: String?, user: User?) : RequestConfig<User> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/user/{id}/individuals".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = user
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdDeleteRequestConfig(id: String, userId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/user/{id}/individuals/{userId}".replace("{"+"id"+"}", id).replace("{"+"userId"+"}",
                userId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdGetRequestConfig(id: String, userId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/user/{id}/individuals/{userId}".replace("{"+"id"+"}", id).replace("{"+"userId"+"}",
                userId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesUserIdPostRequestConfig(id: String, fields: String?, userBundle: UserBundle?) : RequestConfig<UserBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/user/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = userBundle
        )
    }
    fun adminCustomFieldSettingsBundlesUserPostRequestConfig(fields: String?, userBundle: UserBundle?) : RequestConfig<UserBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/user",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = userBundle
        )
    }
    fun adminCustomFieldSettingsBundlesVersionGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/version",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesVersionIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/bundles/version/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesVersionIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/bundles/version/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsBundlesVersionIdPostRequestConfig(id: String, fields: String?, versionBundle: VersionBundle?) : RequestConfig<VersionBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/version/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = versionBundle
        )
    }
    fun adminCustomFieldSettingsBundlesVersionPostRequestConfig(fields: String?, versionBundle: VersionBundle?) : RequestConfig<VersionBundle> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/bundles/version",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = versionBundle
        )
    }
    fun adminCustomFieldSettingsCustomFieldsGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/customFields",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/customFieldSettings/customFields/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/customFields/{id}/fieldDefaults".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsPostRequestConfig(id: String, fields: String?, customFieldDefaults: CustomFieldDefaults?) : RequestConfig<CustomFieldDefaults> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/customFields/{id}/fieldDefaults".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = customFieldDefaults
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/customFields/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdInstancesGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/customFields/{id}/instances".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminCustomFieldSettingsCustomFieldsIdPostRequestConfig(id: String, fields: String?, customField: CustomField?) : RequestConfig<CustomField> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/customFields/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = customField
        )
    }
    fun adminCustomFieldSettingsCustomFieldsPostRequestConfig(fields: String?, customField: CustomField?) : RequestConfig<CustomField> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/customFieldSettings/customFields",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = customField
        )
    }
    fun adminCustomFieldSettingsTypesGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/customFieldSettings/types",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminDatabaseBackupBackupsGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/databaseBackup/backups",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminDatabaseBackupBackupsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/databaseBackup/backups/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminDatabaseBackupSettingsBackupStatusGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/databaseBackup/settings/backupStatus",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminDatabaseBackupSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/databaseBackup/settings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminDatabaseBackupSettingsPostRequestConfig(fields: String?, databaseBackupSettings: DatabaseBackupSettings?) : RequestConfig<DatabaseBackupSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/databaseBackup/settings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = databaseBackupSettings
        )
    }
    fun adminGlobalSettingsAppearanceSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/appearanceSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsAppearanceSettingsPostRequestConfig(fields: String?, appearanceSettings: AppearanceSettings?) : RequestConfig<AppearanceSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/appearanceSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = appearanceSettings
        )
    }
    fun adminGlobalSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsLicenseGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/license",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsLicensePostRequestConfig(fields: String?, license: License?) : RequestConfig<License> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/license",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = license
        )
    }
    fun adminGlobalSettingsLocaleSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/localeSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsLocaleSettingsPostRequestConfig(fields: String?, localeSettings: LocaleSettings?) : RequestConfig<LocaleSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/localeSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localeSettings
        )
    }
    fun adminGlobalSettingsNotificationSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/notificationSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsNotificationSettingsPostRequestConfig(fields: String?, notificationSettings: NotificationSettings?) : RequestConfig<NotificationSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/notificationSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = notificationSettings
        )
    }
    fun adminGlobalSettingsPostRequestConfig(fields: String?, globalSettings: GlobalSettings?) : RequestConfig<GlobalSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = globalSettings
        )
    }
    fun adminGlobalSettingsRestSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/restSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsRestSettingsPostRequestConfig(fields: String?, restCorsSettings: RestCorsSettings?) : RequestConfig<RestCorsSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/restSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = restCorsSettings
        )
    }
    fun adminGlobalSettingsSystemSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/globalSettings/systemSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminGlobalSettingsSystemSettingsPostRequestConfig(fields: String?, systemSettings: SystemSettings?) : RequestConfig<SystemSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/globalSettings/systemSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = systemSettings
        )
    }
    fun adminProjectsGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdCustomFieldsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/customFields".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdCustomFieldsPostRequestConfig(id: String, fields: String?, projectCustomField: ProjectCustomField?) : RequestConfig<ProjectCustomField> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/customFields".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = projectCustomField
        )
    }
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdDeleteRequestConfig(id: String, projectCustomFieldId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/projects/{id}/customFields/{projectCustomFieldId}".replace("{"+"id"+"}", id).replace("{"+"projectCustomFieldId"+"}",
                projectCustomFieldId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdGetRequestConfig(id: String, projectCustomFieldId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/customFields/{projectCustomFieldId}".replace("{"+"id"+"}", id).replace("{"+"projectCustomFieldId"+"}",
                projectCustomFieldId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdCustomFieldsProjectCustomFieldIdPostRequestConfig(id: String, projectCustomFieldId: String, fields: String?, projectCustomField: ProjectCustomField?) : RequestConfig<ProjectCustomField> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/customFields/{projectCustomFieldId}".replace("{" + "id" + "}", id).replace(
                "{" + "projectCustomFieldId" + "}",
                projectCustomFieldId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = projectCustomField
        )
    }
    fun adminProjectsIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/projects/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdIssuesGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/issues".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdIssuesIssueIdDeleteRequestConfig(id: String, issueId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/projects/{id}/issues/{issueId}".replace("{"+"id"+"}", id).replace("{"+"issueId"+"}", issueId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdIssuesIssueIdGetRequestConfig(id: String, issueId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/issues/{issueId}".replace("{"+"id"+"}", id).replace("{"+"issueId"+"}", issueId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdIssuesIssueIdPostRequestConfig(id: String, issueId: String, fields: String?, issue: Issue?) : RequestConfig<Issue> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/issues/{issueId}".replace("{" + "id" + "}", id)
                .replace("{" + "issueId" + "}", issueId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issue
        )
    }
    fun adminProjectsIdIssuesPostRequestConfig(id: String, fields: String?, issue: Issue?) : RequestConfig<Issue> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/issues".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issue
        )
    }
    fun adminProjectsIdPostRequestConfig(id: String, fields: String?, project: Project?) : RequestConfig<Project> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = project
        )
    }
    fun adminProjectsIdTimeTrackingSettingsGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/timeTrackingSettings".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdTimeTrackingSettingsPostRequestConfig(id: String, fields: String?, projectTimeTrackingSettings: ProjectTimeTrackingSettings?) : RequestConfig<ProjectTimeTrackingSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/timeTrackingSettings".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = projectTimeTrackingSettings
        )
    }
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/timeTrackingSettings/workItemTypes".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesPostRequestConfig(id: String, fields: String?, workItemType: WorkItemType?) : RequestConfig<WorkItemType> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects/{id}/timeTrackingSettings/workItemTypes".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = workItemType
        )
    }
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDeleteRequestConfig(id: String, workItemTypeId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/projects/{id}/timeTrackingSettings/workItemTypes/{workItemTypeId}".replace("{"+"id"+"}", id).replace("{"+"workItemTypeId"+"}",
                workItemTypeId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGetRequestConfig(id: String, workItemTypeId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/projects/{id}/timeTrackingSettings/workItemTypes/{workItemTypeId}".replace("{"+"id"+"}", id).replace("{"+"workItemTypeId"+"}",
                workItemTypeId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminProjectsPostRequestConfig(template: String?, fields: String?, project: Project?) : RequestConfig<Project> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (template != null) {
                    put("template", listOf(template.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/projects",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = project
        )
    }
    fun adminTelemetryGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/telemetry",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/timeTrackingSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsWorkItemTypesGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/timeTrackingSettings/workItemTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsWorkItemTypesPostRequestConfig(fields: String?, workItemType: WorkItemType?) : RequestConfig<WorkItemType> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/timeTrackingSettings/workItemTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = workItemType
        )
    }
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDeleteRequestConfig(workItemTypeId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/admin/timeTrackingSettings/workItemTypes/{workItemTypeId}".replace("{"+"workItemTypeId"+"}",
                workItemTypeId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGetRequestConfig(workItemTypeId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/timeTrackingSettings/workItemTypes/{workItemTypeId}".replace("{"+"workItemTypeId"+"}",
                workItemTypeId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdPostRequestConfig(workItemTypeId: String, fields: String?, workItemType: WorkItemType?) : RequestConfig<WorkItemType> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/timeTrackingSettings/workItemTypes/{workItemTypeId}".replace(
                "{" + "workItemTypeId" + "}",
                workItemTypeId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = workItemType
        )
    }
    fun adminTimeTrackingSettingsWorkTimeSettingsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/timeTrackingSettings/workTimeSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun adminTimeTrackingSettingsWorkTimeSettingsPostRequestConfig(fields: String?, workTimeSettings: WorkTimeSettings?) : RequestConfig<WorkTimeSettings> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/timeTrackingSettings/workTimeSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = workTimeSettings
        )
    }
    fun agilesGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/agiles",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/agiles/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/agiles/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdPostRequestConfig(id: String, fields: String?, agile: Agile?) : RequestConfig<Agile> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/agiles/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = agile
        )
    }
    fun agilesIdSprintsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/agiles/{id}/sprints".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdSprintsPostRequestConfig(id: String, fields: String?, sprint: Sprint?) : RequestConfig<Sprint> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/agiles/{id}/sprints".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = sprint
        )
    }
    fun agilesIdSprintsSprintIdDeleteRequestConfig(id: String, sprintId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/agiles/{id}/sprints/{sprintId}".replace("{"+"id"+"}", id).replace("{"+"sprintId"+"}", sprintId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdSprintsSprintIdGetRequestConfig(id: String, sprintId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/agiles/{id}/sprints/{sprintId}".replace("{"+"id"+"}", id).replace("{"+"sprintId"+"}", sprintId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun agilesIdSprintsSprintIdPostRequestConfig(id: String, sprintId: String, fields: String?, sprint: Sprint?) : RequestConfig<Sprint> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/agiles/{id}/sprints/{sprintId}".replace("{" + "id" + "}", id)
                .replace("{" + "sprintId" + "}", sprintId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = sprint
        )
    }
    fun agilesPostRequestConfig(template: String?, fields: String?, agile: Agile?) : RequestConfig<Agile> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (template != null) {
                    put("template", listOf(template.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/agiles",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = agile
        )
    }
    fun commandsAssistGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/commands/assist",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun commandsGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/commands",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun groupsGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/groups",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun groupsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/groups/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueLinkTypesGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issueLinkTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueLinkTypesIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issueLinkTypes/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueLinkTypesIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issueLinkTypes/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueLinkTypesIdPostRequestConfig(id: String, fields: String?, issueLinkType: IssueLinkType?) : RequestConfig<IssueLinkType> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issueLinkTypes/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueLinkType
        )
    }
    fun issueLinkTypesPostRequestConfig(fields: String?, issueLinkType: IssueLinkType?) : RequestConfig<IssueLinkType> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issueLinkTypes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueLinkType
        )
    }
    fun issueTagsGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issueTags",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueTagsIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issueTags/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueTagsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issueTags/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueTagsIdIssuesGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issueTags/{id}/issues".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issueTagsIdPostRequestConfig(id: String, fields: String?, issueTag: IssueTag?) : RequestConfig<IssueTag> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issueTags/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueTag
        )
    }
    fun issueTagsPostRequestConfig(fields: String?, issueTag: IssueTag?) : RequestConfig<IssueTag> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issueTags",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueTag
        )
    }
    fun issuesGetRequestConfig(query: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (query != null) {
                    put("query", listOf(query.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdActivitiesActivityItemIdGetRequestConfig(id: String, activityItemId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/activities/{activityItemId}".replace("{"+"id"+"}", id).replace("{"+"activityItemId"+"}",
                activityItemId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdActivitiesGetRequestConfig(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (categories != null) {
                    put("categories", listOf(categories.toString()))
                }
                if (reverse != null) {
                    put("reverse", listOf(reverse.toString()))
                }
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (end != null) {
                    put("end", listOf(end.toString()))
                }
                if (author != null) {
                    put("author", listOf(author.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/activities".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdActivitiesPageGetRequestConfig(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, cursor: String?, activityId: String?, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (categories != null) {
                    put("categories", listOf(categories.toString()))
                }
                if (reverse != null) {
                    put("reverse", listOf(reverse.toString()))
                }
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (end != null) {
                    put("end", listOf(end.toString()))
                }
                if (author != null) {
                    put("author", listOf(author.toString()))
                }
                if (cursor != null) {
                    put("cursor", listOf(cursor.toString()))
                }
                if (activityId != null) {
                    put("activityId", listOf(activityId.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/activitiesPage".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdAttachmentsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/attachments".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdAttachmentsIssueAttachmentIdDeleteRequestConfig(id: String, issueAttachmentId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issues/{id}/attachments/{issueAttachmentId}".replace("{"+"id"+"}", id).replace("{"+"issueAttachmentId"+"}",
                issueAttachmentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdAttachmentsIssueAttachmentIdGetRequestConfig(id: String, issueAttachmentId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/attachments/{issueAttachmentId}".replace("{"+"id"+"}", id).replace("{"+"issueAttachmentId"+"}",
                issueAttachmentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdAttachmentsIssueAttachmentIdPostRequestConfig(id: String, issueAttachmentId: String, fields: String?, issueAttachment: IssueAttachment?) : RequestConfig<IssueAttachment> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/attachments/{issueAttachmentId}".replace("{" + "id" + "}", id).replace(
                "{" + "issueAttachmentId" + "}",
                issueAttachmentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueAttachment
        )
    }
    fun issuesIdAttachmentsPostRequestConfig(id: String, fields: String?, issueAttachment: IssueAttachment?) : RequestConfig<IssueAttachment> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/attachments".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueAttachment
        )
    }
    fun issuesIdCommentsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/comments".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdCommentsIssueCommentIdDeleteRequestConfig(id: String, issueCommentId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issues/{id}/comments/{issueCommentId}".replace("{"+"id"+"}", id).replace("{"+"issueCommentId"+"}",
                issueCommentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdCommentsIssueCommentIdGetRequestConfig(id: String, issueCommentId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/comments/{issueCommentId}".replace("{"+"id"+"}", id).replace("{"+"issueCommentId"+"}",
                issueCommentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdCommentsIssueCommentIdPostRequestConfig(id: String, issueCommentId: String, fields: String?, issueComment: IssueComment?) : RequestConfig<IssueComment> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/comments/{issueCommentId}".replace("{" + "id" + "}", id).replace(
                "{" + "issueCommentId" + "}",
                issueCommentId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueComment
        )
    }
    fun issuesIdCommentsPostRequestConfig(id: String, draftId: String?, fields: String?, issueComment: IssueComment?) : RequestConfig<IssueComment> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (draftId != null) {
                    put("draftId", listOf(draftId.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/comments".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueComment
        )
    }
    fun issuesIdCustomFieldsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/customFields".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdCustomFieldsIssueCustomFieldIdGetRequestConfig(id: String, issueCustomFieldId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/customFields/{issueCustomFieldId}".replace("{"+"id"+"}", id).replace("{"+"issueCustomFieldId"+"}",
                issueCustomFieldId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdCustomFieldsIssueCustomFieldIdPostRequestConfig(id: String, issueCustomFieldId: String, fields: String?, issueCustomField: IssueCustomField?) : RequestConfig<IssueCustomField> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/customFields/{issueCustomFieldId}".replace("{" + "id" + "}", id).replace(
                "{" + "issueCustomFieldId" + "}",
                issueCustomFieldId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueCustomField
        )
    }
    fun issuesIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issues/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdLinksGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/links".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdLinksIssueLinkIdGetRequestConfig(id: String, issueLinkId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/links/{issueLinkId}".replace("{"+"id"+"}", id).replace("{"+"issueLinkId"+"}",
                issueLinkId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdLinksIssueLinkIdIssuesGetRequestConfig(id: String, issueLinkId: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/links/{issueLinkId}/issues".replace("{"+"id"+"}", id).replace("{"+"issueLinkId"+"}",
                issueLinkId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdLinksIssueLinkIdIssuesIssueIdDeleteRequestConfig(id: String, issueLinkId: String, issueId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issues/{id}/links/{issueLinkId}/issues/{issueId}".replace("{"+"id"+"}", id).replace("{"+"issueLinkId"+"}",
                issueLinkId
            ).replace("{"+"issueId"+"}", issueId),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdLinksIssueLinkIdIssuesPostRequestConfig(id: String, issueLinkId: String, fields: String?, issue: Issue?) : RequestConfig<Issue> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/links/{issueLinkId}/issues".replace("{" + "id" + "}", id).replace(
                "{" + "issueLinkId" + "}",
                issueLinkId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issue
        )
    }
    fun issuesIdPostRequestConfig(id: String, fields: String?, issue: Issue?) : RequestConfig<Issue> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issue
        )
    }
    fun issuesIdProjectGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/project".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdProjectPostRequestConfig(id: String, fields: String?, project: Project?) : RequestConfig<Project> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/project".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = project
        )
    }
    fun issuesIdTimeTrackingGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/timeTracking".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdTimeTrackingWorkItemsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/timeTracking/workItems".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdDeleteRequestConfig(id: String, issueWorkItemId: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/issues/{id}/timeTracking/workItems/{issueWorkItemId}".replace("{"+"id"+"}", id).replace("{"+"issueWorkItemId"+"}",
                issueWorkItemId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdGetRequestConfig(id: String, issueWorkItemId: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/issues/{id}/timeTracking/workItems/{issueWorkItemId}".replace("{"+"id"+"}", id).replace("{"+"issueWorkItemId"+"}",
                issueWorkItemId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdPostRequestConfig(id: String, issueWorkItemId: String, fields: String?, issueWorkItem: IssueWorkItem?) : RequestConfig<IssueWorkItem> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/timeTracking/workItems/{issueWorkItemId}".replace("{" + "id" + "}", id).replace(
                "{" + "issueWorkItemId" + "}",
                issueWorkItemId
            ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueWorkItem
        )
    }
    fun issuesIdTimeTrackingWorkItemsPostRequestConfig(id: String, fields: String?, issueWorkItem: IssueWorkItem?) : RequestConfig<IssueWorkItem> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues/{id}/timeTracking/workItems".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issueWorkItem
        )
    }
    fun issuesPostRequestConfig(draftId: String?, fields: String?, issue: Issue?) : RequestConfig<Issue> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (draftId != null) {
                    put("draftId", listOf(draftId.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/issues",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = issue
        )
    }
    fun savedQueriesGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/savedQueries",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun savedQueriesIdDeleteRequestConfig(id: String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/savedQueries/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun savedQueriesIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/savedQueries/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun savedQueriesIdPostRequestConfig(id: String, fields: String?, savedQuery: SavedQuery?) : RequestConfig<SavedQuery> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/savedQueries/{id}".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = savedQuery
        )
    }
    fun savedQueriesPostRequestConfig(fields: String?, savedQuery: SavedQuery?) : RequestConfig<SavedQuery> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/savedQueries",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = savedQuery
        )
    }
    fun searchAssistGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/search/assist",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersGetRequestConfig(fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdProfilesGeneralGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}/profiles/general".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdProfilesGeneralPostRequestConfig(id: String, fields: String?, generalUserProfile: GeneralUserProfile?) : RequestConfig<GeneralUserProfile> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/users/{id}/profiles/general".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = generalUserProfile
        )
    }
    fun usersIdProfilesNotificationsGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}/profiles/notifications".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdProfilesNotificationsPostRequestConfig(id: String, fields: String?, notificationsUserProfile: NotificationsUserProfile?) : RequestConfig<NotificationsUserProfile> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/users/{id}/profiles/notifications".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = notificationsUserProfile
        )
    }
    fun usersIdProfilesTimetrackingGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}/profiles/timetracking".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdProfilesTimetrackingPostRequestConfig(id: String, fields: String?, timeTrackingUserProfile: TimeTrackingUserProfile?) : RequestConfig<TimeTrackingUserProfile> {
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/users/{id}/profiles/timetracking".replace("{" + "id" + "}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = timeTrackingUserProfile
        )
    }
    fun usersIdSavedQueriesGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}/savedQueries".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersIdTagsGetRequestConfig(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/{id}/tags".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun usersMeGetRequestConfig(fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/users/me",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun workItemsGetRequestConfig(query: String?, startDate: LocalDate?, endDate: LocalDate?, start: Int?, end: Int?, createdStart: Int?, createdEnd: Int?, updatedStart: Int?, updatedEnd: Int?, author: String?, creator: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (query != null) {
                    put("query", listOf(query.toString()))
                }
                if (startDate != null) {
                    put("startDate", listOf(parseDateToQueryString(startDate)))
                }
                if (endDate != null) {
                    put("endDate", listOf(parseDateToQueryString(endDate)))
                }
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (end != null) {
                    put("end", listOf(end.toString()))
                }
                if (createdStart != null) {
                    put("createdStart", listOf(createdStart.toString()))
                }
                if (createdEnd != null) {
                    put("createdEnd", listOf(createdEnd.toString()))
                }
                if (updatedStart != null) {
                    put("updatedStart", listOf(updatedStart.toString()))
                }
                if (updatedEnd != null) {
                    put("updatedEnd", listOf(updatedEnd.toString()))
                }
                if (author != null) {
                    put("author", listOf(author.toString()))
                }
                if (creator != null) {
                    put("creator", listOf(creator.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (dollarSkip != null) {
                    put("\$skip", listOf(dollarSkip.toString()))
                }
                if (dollarTop != null) {
                    put("\$top", listOf(dollarTop.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/workItems",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
    fun workItemsIdGetRequestConfig(id: String, fields: String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<String, List<String>>()
            .apply {
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/workItems/{id}".replace("{"+"id"+"}", id),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }
}