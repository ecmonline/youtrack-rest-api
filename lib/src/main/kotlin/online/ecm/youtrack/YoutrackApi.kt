package online.ecm.youtrack

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import online.ecm.youtrack.model.*
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpRequestBase
import org.apache.http.client.utils.URIBuilder
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.message.BasicNameValuePair
import org.apache.http.util.EntityUtils
import java.nio.charset.StandardCharsets

class YoutrackApi(val youtrackApiConfig: YoutrackApiConfig) : YoutrackApiInterface {

    companion object {
        private val httpClientBuilder: HttpClientBuilder = HttpClientBuilder.create()
    }

    private val mapper: ObjectMapper = ObjectMapper()

    override fun activitiesGet(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ActivityItem>? {
        val config = activitiesGetRequestConfig(categories = categories, reverse = reverse, start = start, end = end, author = author, issueQuery = issueQuery, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun activitiesIdGet(id: String, fields: String?) : ActivityItem? {
        val config = activitiesIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun activitiesPageGet(categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, issueQuery: String?, cursor: String?, activityId: String?, fields: String?) : ActivityCursorPage? {
        val config = activitiesPageGetRequestConfig(categories = categories, reverse = reverse, start = start, end = end, author = author, issueQuery = issueQuery, cursor = cursor, activityId = activityId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesBuildGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<BuildBundle>? {
        val config = adminCustomFieldSettingsBundlesBuildGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesBuildIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesBuildIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesBuildIdGet(id: String, fields: String?) : BuildBundle? {
        val config = adminCustomFieldSettingsBundlesBuildIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesBuildIdPost(id: String, fields: String?, buildBundle: BuildBundle?) : BuildBundle? {
        val config = adminCustomFieldSettingsBundlesBuildIdPostRequestConfig(id = id, fields = fields, buildBundle = buildBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesBuildPost(fields: String?, buildBundle: BuildBundle?) : BuildBundle? {
        val config = adminCustomFieldSettingsBundlesBuildPostRequestConfig(fields = fields, buildBundle = buildBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesEnumGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<EnumBundle>? {
        val config = adminCustomFieldSettingsBundlesEnumGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesEnumIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesEnumIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesEnumIdGet(id: String, fields: String?) : EnumBundle? {
        val config = adminCustomFieldSettingsBundlesEnumIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesEnumIdPost(id: String, fields: String?, enumBundle: EnumBundle?) : EnumBundle? {
        val config = adminCustomFieldSettingsBundlesEnumIdPostRequestConfig(id = id, fields = fields, enumBundle = enumBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesEnumPost(fields: String?, enumBundle: EnumBundle?) : EnumBundle? {
        val config = adminCustomFieldSettingsBundlesEnumPostRequestConfig(fields = fields, enumBundle = enumBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesOwnedFieldGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<OwnedBundle>? {
        val config = adminCustomFieldSettingsBundlesOwnedFieldGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesOwnedFieldIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesOwnedFieldIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesOwnedFieldIdGet(id: String, fields: String?) : OwnedBundle? {
        val config = adminCustomFieldSettingsBundlesOwnedFieldIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesOwnedFieldIdPost(id: String, fields: String?, ownedBundle: OwnedBundle?) : OwnedBundle? {
        val config = adminCustomFieldSettingsBundlesOwnedFieldIdPostRequestConfig(id = id, fields = fields, ownedBundle = ownedBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesOwnedFieldPost(fields: String?, ownedBundle: OwnedBundle?) : OwnedBundle? {
        val config = adminCustomFieldSettingsBundlesOwnedFieldPostRequestConfig(fields = fields, ownedBundle = ownedBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesStateGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<StateBundle>? {
        val config = adminCustomFieldSettingsBundlesStateGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesStateIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesStateIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesStateIdGet(id: String, fields: String?) : StateBundle? {
        val config = adminCustomFieldSettingsBundlesStateIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesStateIdPost(id: String, fields: String?, stateBundle: StateBundle?) : StateBundle? {
        val config = adminCustomFieldSettingsBundlesStateIdPostRequestConfig(id = id, fields = fields, stateBundle = stateBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesStatePost(fields: String?, stateBundle: StateBundle?) : StateBundle? {
        val config = adminCustomFieldSettingsBundlesStatePostRequestConfig(fields = fields, stateBundle = stateBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserBundle>? {
        val config = adminCustomFieldSettingsBundlesUserGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdAggregatedUsersGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {
        val config = adminCustomFieldSettingsBundlesUserIdAggregatedUsersGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesUserIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdGet(id: String, fields: String?) : UserBundle? {
        val config = adminCustomFieldSettingsBundlesUserIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdGroupsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserGroup>? {
        val config = adminCustomFieldSettingsBundlesUserIdGroupsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdGroupsPost(id: String, fields: String?, userGroup: UserGroup?) : UserGroup? {
        val config = adminCustomFieldSettingsBundlesUserIdGroupsPostRequestConfig(id = id, fields = fields, userGroup = userGroup)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdDelete(id: String, userGroupId: String) {
        val config = adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdDeleteRequestConfig(id = id, userGroupId = userGroupId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdGet(id: String, userGroupId: String, fields: String?) : UserGroup? {
        val config = adminCustomFieldSettingsBundlesUserIdGroupsUserGroupIdGetRequestConfig(id = id, userGroupId = userGroupId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdIndividualsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {
        val config = adminCustomFieldSettingsBundlesUserIdIndividualsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdIndividualsPost(id: String, fields: String?, user: User?) : User? {
        val config = adminCustomFieldSettingsBundlesUserIdIndividualsPostRequestConfig(id = id, fields = fields, user = user)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdDelete(id: String, userId: String) {
        val config = adminCustomFieldSettingsBundlesUserIdIndividualsUserIdDeleteRequestConfig(id = id, userId = userId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdIndividualsUserIdGet(id: String, userId: String, fields: String?) : User? {
        val config = adminCustomFieldSettingsBundlesUserIdIndividualsUserIdGetRequestConfig(id = id, userId = userId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserIdPost(id: String, fields: String?, userBundle: UserBundle?) : UserBundle? {
        val config = adminCustomFieldSettingsBundlesUserIdPostRequestConfig(id = id, fields = fields, userBundle = userBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesUserPost(fields: String?, userBundle: UserBundle?) : UserBundle? {
        val config = adminCustomFieldSettingsBundlesUserPostRequestConfig(fields = fields, userBundle = userBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesVersionGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<VersionBundle>? {
        val config = adminCustomFieldSettingsBundlesVersionGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesVersionIdDelete(id: String) {
        val config = adminCustomFieldSettingsBundlesVersionIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesVersionIdGet(id: String, fields: String?) : VersionBundle? {
        val config = adminCustomFieldSettingsBundlesVersionIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesVersionIdPost(id: String, fields: String?, versionBundle: VersionBundle?) : VersionBundle? {
        val config = adminCustomFieldSettingsBundlesVersionIdPostRequestConfig(id = id, fields = fields, versionBundle = versionBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsBundlesVersionPost(fields: String?, versionBundle: VersionBundle?) : VersionBundle? {
        val config = adminCustomFieldSettingsBundlesVersionPostRequestConfig(fields = fields, versionBundle = versionBundle)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<CustomField>? {
        val config = adminCustomFieldSettingsCustomFieldsGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdDelete(id: String) {
        val config = adminCustomFieldSettingsCustomFieldsIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsGet(id: String, fields: String?) : CustomFieldDefaults? {
        val config = adminCustomFieldSettingsCustomFieldsIdFieldDefaultsGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdFieldDefaultsPost(id: String, fields: String?, customFieldDefaults: CustomFieldDefaults?) : CustomFieldDefaults? {
        val config = adminCustomFieldSettingsCustomFieldsIdFieldDefaultsPostRequestConfig(id = id, fields = fields, customFieldDefaults = customFieldDefaults)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdGet(id: String, fields: String?) : CustomField? {
        val config = adminCustomFieldSettingsCustomFieldsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdInstancesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ProjectCustomField>? {
        val config = adminCustomFieldSettingsCustomFieldsIdInstancesGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsIdPost(id: String, fields: String?, customField: CustomField?) : CustomField? {
        val config = adminCustomFieldSettingsCustomFieldsIdPostRequestConfig(id = id, fields = fields, customField = customField)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsCustomFieldsPost(fields: String?, customField: CustomField?) : CustomField? {
        val config = adminCustomFieldSettingsCustomFieldsPostRequestConfig(fields = fields, customField = customField)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminCustomFieldSettingsTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<FieldType>? {
        val config = adminCustomFieldSettingsTypesGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminDatabaseBackupBackupsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<BackupFile>? {
        val config = adminDatabaseBackupBackupsGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminDatabaseBackupBackupsIdGet(id: String, fields: String?) : BackupFile? {
        val config = adminDatabaseBackupBackupsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminDatabaseBackupSettingsBackupStatusGet(fields: String?) : BackupStatus? {
        val config = adminDatabaseBackupSettingsBackupStatusGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminDatabaseBackupSettingsGet(fields: String?) : DatabaseBackupSettings? {
        val config = adminDatabaseBackupSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminDatabaseBackupSettingsPost(fields: String?, databaseBackupSettings: DatabaseBackupSettings?) : DatabaseBackupSettings? {
        val config = adminDatabaseBackupSettingsPostRequestConfig(fields = fields, databaseBackupSettings = databaseBackupSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsAppearanceSettingsGet(fields: String?) : AppearanceSettings? {
        val config = adminGlobalSettingsAppearanceSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsAppearanceSettingsPost(fields: String?, appearanceSettings: AppearanceSettings?) : AppearanceSettings? {
        val config = adminGlobalSettingsAppearanceSettingsPostRequestConfig(fields = fields, appearanceSettings = appearanceSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsGet(fields: String?) : GlobalSettings? {
        val config = adminGlobalSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsLicenseGet(fields: String?) : License? {
        val config = adminGlobalSettingsLicenseGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsLicensePost(fields: String?, license: License?) : License? {
        val config = adminGlobalSettingsLicensePostRequestConfig(fields = fields, license = license)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsLocaleSettingsGet(fields: String?) : LocaleSettings? {
        val config = adminGlobalSettingsLocaleSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsLocaleSettingsPost(fields: String?, localeSettings: LocaleSettings?) : LocaleSettings? {
        val config = adminGlobalSettingsLocaleSettingsPostRequestConfig(fields = fields, localeSettings = localeSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsNotificationSettingsGet(fields: String?) : NotificationSettings? {
        val config = adminGlobalSettingsNotificationSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsNotificationSettingsPost(fields: String?, notificationSettings: NotificationSettings?) : NotificationSettings? {
        val config = adminGlobalSettingsNotificationSettingsPostRequestConfig(fields = fields, notificationSettings = notificationSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsPost(fields: String?, globalSettings: GlobalSettings?) : GlobalSettings? {
        val config = adminGlobalSettingsPostRequestConfig(fields = fields, globalSettings = globalSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsRestSettingsGet(fields: String?) : RestCorsSettings? {
        val config = adminGlobalSettingsRestSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsRestSettingsPost(fields: String?, restCorsSettings: RestCorsSettings?) : RestCorsSettings? {
        val config = adminGlobalSettingsRestSettingsPostRequestConfig(fields = fields, restCorsSettings = restCorsSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsSystemSettingsGet(fields: String?) : SystemSettings? {
        val config = adminGlobalSettingsSystemSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminGlobalSettingsSystemSettingsPost(fields: String?, systemSettings: SystemSettings?) : SystemSettings? {
        val config = adminGlobalSettingsSystemSettingsPostRequestConfig(fields = fields, systemSettings = systemSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Project>? {
        val config = adminProjectsGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdCustomFieldsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ProjectCustomField>? {
        val config = adminProjectsIdCustomFieldsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdCustomFieldsPost(id: String, fields: String?, projectCustomField: ProjectCustomField?) : ProjectCustomField? {
        val config = adminProjectsIdCustomFieldsPostRequestConfig(id = id, fields = fields, projectCustomField = projectCustomField)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdCustomFieldsProjectCustomFieldIdDelete(id: String, projectCustomFieldId: String) {
        val config = adminProjectsIdCustomFieldsProjectCustomFieldIdDeleteRequestConfig(id = id, projectCustomFieldId = projectCustomFieldId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminProjectsIdCustomFieldsProjectCustomFieldIdGet(id: String, projectCustomFieldId: String, fields: String?) : ProjectCustomField? {
        val config = adminProjectsIdCustomFieldsProjectCustomFieldIdGetRequestConfig(id = id, projectCustomFieldId = projectCustomFieldId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdCustomFieldsProjectCustomFieldIdPost(id: String, projectCustomFieldId: String, fields: String?, projectCustomField: ProjectCustomField?) : ProjectCustomField? {
        val config = adminProjectsIdCustomFieldsProjectCustomFieldIdPostRequestConfig(id = id, projectCustomFieldId = projectCustomFieldId, fields = fields, projectCustomField = projectCustomField)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdDelete(id: String) {
        val config = adminProjectsIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminProjectsIdGet(id: String, fields: String?) : Project? {
        val config = adminProjectsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdIssuesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {
        val config = adminProjectsIdIssuesGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdIssuesIssueIdDelete(id: String, issueId: String) {
        val config = adminProjectsIdIssuesIssueIdDeleteRequestConfig(id = id, issueId = issueId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminProjectsIdIssuesIssueIdGet(id: String, issueId: String, fields: String?) : Issue? {
        val config = adminProjectsIdIssuesIssueIdGetRequestConfig(id = id, issueId = issueId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdIssuesIssueIdPost(id: String, issueId: String, fields: String?, issue: Issue?) : Issue? {
        val config = adminProjectsIdIssuesIssueIdPostRequestConfig(id = id, issueId = issueId, fields = fields, issue = issue)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdIssuesPost(id: String, fields: String?, issue: Issue?) : Issue? {
        val config = adminProjectsIdIssuesPostRequestConfig(id = id, fields = fields, issue = issue)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdPost(id: String, fields: String?, project: Project?) : Project? {
        val config = adminProjectsIdPostRequestConfig(id = id, fields = fields, project = project)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsGet(id: String, fields: String?) : ProjectTimeTrackingSettings? {
        val config = adminProjectsIdTimeTrackingSettingsGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsPost(id: String, fields: String?, projectTimeTrackingSettings: ProjectTimeTrackingSettings?) : ProjectTimeTrackingSettings? {
        val config = adminProjectsIdTimeTrackingSettingsPostRequestConfig(id = id, fields = fields, projectTimeTrackingSettings = projectTimeTrackingSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsWorkItemTypesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<WorkItemType>? {
        val config = adminProjectsIdTimeTrackingSettingsWorkItemTypesGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsWorkItemTypesPost(id: String, fields: String?, workItemType: WorkItemType?) : WorkItemType? {
        val config = adminProjectsIdTimeTrackingSettingsWorkItemTypesPostRequestConfig(id = id, fields = fields, workItemType = workItemType)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDelete(id: String, workItemTypeId: String) {
        val config = adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDeleteRequestConfig(id = id, workItemTypeId = workItemTypeId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGet(id: String, workItemTypeId: String, fields: String?) : WorkItemType? {
        val config = adminProjectsIdTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGetRequestConfig(id = id, workItemTypeId = workItemTypeId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminProjectsPost(template: String?, fields: String?, project: Project?) : Project? {
        val config = adminProjectsPostRequestConfig(template = template, fields = fields, project = project)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTelemetryGet(fields: String?) : Telemetry? {
        val config = adminTelemetryGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsGet(fields: String?) : GlobalTimeTrackingSettings? {
        val config = adminTimeTrackingSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkItemTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<WorkItemType>? {
        val config = adminTimeTrackingSettingsWorkItemTypesGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkItemTypesPost(fields: String?, workItemType: WorkItemType?) : WorkItemType? {
        val config = adminTimeTrackingSettingsWorkItemTypesPostRequestConfig(fields = fields, workItemType = workItemType)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDelete(workItemTypeId: String) {
        val config = adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdDeleteRequestConfig(workItemTypeId = workItemTypeId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGet(workItemTypeId: String, fields: String?) : WorkItemType? {
        val config = adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdGetRequestConfig(workItemTypeId = workItemTypeId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdPost(workItemTypeId: String, fields: String?, workItemType: WorkItemType?) : WorkItemType? {
        val config = adminTimeTrackingSettingsWorkItemTypesWorkItemTypeIdPostRequestConfig(workItemTypeId = workItemTypeId, fields = fields, workItemType = workItemType)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkTimeSettingsGet(fields: String?) : WorkTimeSettings? {
        val config = adminTimeTrackingSettingsWorkTimeSettingsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun adminTimeTrackingSettingsWorkTimeSettingsPost(fields: String?, workTimeSettings: WorkTimeSettings?) : WorkTimeSettings? {
        val config = adminTimeTrackingSettingsWorkTimeSettingsPostRequestConfig(fields = fields, workTimeSettings = workTimeSettings)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Agile>? {
        val config = agilesGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdDelete(id: String) {
        val config = agilesIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun agilesIdGet(id: String, fields: String?) : Agile? {
        val config = agilesIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdPost(id: String, fields: String?, agile: Agile?) : Agile? {
        val config = agilesIdPostRequestConfig(id = id, fields = fields, agile = agile)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdSprintsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Sprint>? {
        val config = agilesIdSprintsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdSprintsPost(id: String, fields: String?, sprint: Sprint?) : Sprint? {
        val config = agilesIdSprintsPostRequestConfig(id = id, fields = fields, sprint = sprint)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdSprintsSprintIdDelete(id: String, sprintId: String) {
        val config = agilesIdSprintsSprintIdDeleteRequestConfig(id = id, sprintId = sprintId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun agilesIdSprintsSprintIdGet(id: String, sprintId: String, fields: String?) : Sprint? {
        val config = agilesIdSprintsSprintIdGetRequestConfig(id = id, sprintId = sprintId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesIdSprintsSprintIdPost(id: String, sprintId: String, fields: String?, sprint: Sprint?) : Sprint? {
        val config = agilesIdSprintsSprintIdPostRequestConfig(id = id, sprintId = sprintId, fields = fields, sprint = sprint)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun agilesPost(template: String?, fields: String?, agile: Agile?) : Agile? {
        val config = agilesPostRequestConfig(template = template, fields = fields, agile = agile)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun commandsAssistGet(fields: String?) : CommandList? {
        val config = commandsAssistGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun commandsGet(fields: String?) : CommandList? {
        val config = commandsGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun groupsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<UserGroup>? {
        val config = groupsGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun groupsIdGet(id: String, fields: String?) : UserGroup? {
        val config = groupsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueLinkTypesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueLinkType>? {
        val config = issueLinkTypesGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueLinkTypesIdDelete(id: String) {
        val config = issueLinkTypesIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issueLinkTypesIdGet(id: String, fields: String?) : IssueLinkType? {
        val config = issueLinkTypesIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueLinkTypesIdPost(id: String, fields: String?, issueLinkType: IssueLinkType?) : IssueLinkType? {
        val config = issueLinkTypesIdPostRequestConfig(id = id, fields = fields, issueLinkType = issueLinkType)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueLinkTypesPost(fields: String?, issueLinkType: IssueLinkType?) : IssueLinkType? {
        val config = issueLinkTypesPostRequestConfig(fields = fields, issueLinkType = issueLinkType)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueTagsGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueTag>? {
        val config = issueTagsGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueTagsIdDelete(id: String) {
        val config = issueTagsIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issueTagsIdGet(id: String, fields: String?) : IssueTag? {
        val config = issueTagsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueTagsIdIssuesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {
        val config = issueTagsIdIssuesGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueTagsIdPost(id: String, fields: String?, issueTag: IssueTag?) : IssueTag? {
        val config = issueTagsIdPostRequestConfig(id = id, fields = fields, issueTag = issueTag)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issueTagsPost(fields: String?, issueTag: IssueTag?) : IssueTag? {
        val config = issueTagsPostRequestConfig(fields = fields, issueTag = issueTag)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesGet(query: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {
        val config = issuesGetRequestConfig(query = query, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdActivitiesActivityItemIdGet(id: String, activityItemId: String, fields: String?) : ActivityItem? {
        val config = issuesIdActivitiesActivityItemIdGetRequestConfig(id = id, activityItemId = activityItemId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdActivitiesGet(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<ActivityItem>? {
        val config = issuesIdActivitiesGetRequestConfig(id = id, categories = categories, reverse = reverse, start = start, end = end, author = author, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdActivitiesPageGet(id: String, categories: String?, reverse: Boolean?, start: String?, end: String?, author: String?, cursor: String?, activityId: String?, fields: String?) : ActivityCursorPage? {
        val config = issuesIdActivitiesPageGetRequestConfig(id = id, categories = categories, reverse = reverse, start = start, end = end, author = author, cursor = cursor, activityId = activityId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdAttachmentsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueAttachment>? {
        val config = issuesIdAttachmentsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdAttachmentsIssueAttachmentIdDelete(id: String, issueAttachmentId: String) {
        val config = issuesIdAttachmentsIssueAttachmentIdDeleteRequestConfig(id = id, issueAttachmentId = issueAttachmentId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issuesIdAttachmentsIssueAttachmentIdGet(id: String, issueAttachmentId: String, fields: String?) : IssueAttachment? {
        val config = issuesIdAttachmentsIssueAttachmentIdGetRequestConfig(id = id, issueAttachmentId = issueAttachmentId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdAttachmentsIssueAttachmentIdPost(id: String, issueAttachmentId: String, fields: String?, issueAttachment: IssueAttachment?) : IssueAttachment? {
        val config = issuesIdAttachmentsIssueAttachmentIdPostRequestConfig(id = id, issueAttachmentId = issueAttachmentId, fields = fields, issueAttachment = issueAttachment)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdAttachmentsPost(id: String, fields: String?, issueAttachment: IssueAttachment?) : IssueAttachment? {
        val config = issuesIdAttachmentsPostRequestConfig(id = id, fields = fields, issueAttachment = issueAttachment)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCommentsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueComment>? {
        val config = issuesIdCommentsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCommentsIssueCommentIdDelete(id: String, issueCommentId: String) {
        val config = issuesIdCommentsIssueCommentIdDeleteRequestConfig(id = id, issueCommentId = issueCommentId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issuesIdCommentsIssueCommentIdGet(id: String, issueCommentId: String, fields: String?) : IssueComment? {
        val config = issuesIdCommentsIssueCommentIdGetRequestConfig(id = id, issueCommentId = issueCommentId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCommentsIssueCommentIdPost(id: String, issueCommentId: String, fields: String?, issueComment: IssueComment?) : IssueComment? {
        val config = issuesIdCommentsIssueCommentIdPostRequestConfig(id = id, issueCommentId = issueCommentId, fields = fields, issueComment = issueComment)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCommentsPost(id: String, draftId: String?, fields: String?, issueComment: IssueComment?) : IssueComment? {
        val config = issuesIdCommentsPostRequestConfig(id = id, draftId = draftId, fields = fields, issueComment = issueComment)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCustomFieldsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueCustomField>? {
        val config = issuesIdCustomFieldsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCustomFieldsIssueCustomFieldIdGet(id: String, issueCustomFieldId: String, fields: String?) : IssueCustomField? {
        val config = issuesIdCustomFieldsIssueCustomFieldIdGetRequestConfig(id = id, issueCustomFieldId = issueCustomFieldId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdCustomFieldsIssueCustomFieldIdPost(id: String, issueCustomFieldId: String, fields: String?, issueCustomField: IssueCustomField?) : IssueCustomField? {
        val config = issuesIdCustomFieldsIssueCustomFieldIdPostRequestConfig(id = id, issueCustomFieldId = issueCustomFieldId, fields = fields, issueCustomField = issueCustomField)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdDelete(id: String) {
        val config = issuesIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issuesIdGet(id: String, fields: String?) : Issue? {
        val config = issuesIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdLinksGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueLink>? {
        val config = issuesIdLinksGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdLinksIssueLinkIdGet(id: String, issueLinkId: String, fields: String?) : IssueLink? {
        val config = issuesIdLinksIssueLinkIdGetRequestConfig(id = id, issueLinkId = issueLinkId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdLinksIssueLinkIdIssuesGet(id: String, issueLinkId: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<Issue>? {
        val config = issuesIdLinksIssueLinkIdIssuesGetRequestConfig(id = id, issueLinkId = issueLinkId, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdLinksIssueLinkIdIssuesIssueIdDelete(id: String, issueLinkId: String, issueId: String) {
        val config = issuesIdLinksIssueLinkIdIssuesIssueIdDeleteRequestConfig(id = id, issueLinkId = issueLinkId, issueId = issueId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issuesIdLinksIssueLinkIdIssuesPost(id: String, issueLinkId: String, fields: String?, issue: Issue?) : Issue? {
        val config = issuesIdLinksIssueLinkIdIssuesPostRequestConfig(id = id, issueLinkId = issueLinkId, fields = fields, issue = issue)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdPost(id: String, fields: String?, issue: Issue?) : Issue? {
        val config = issuesIdPostRequestConfig(id = id, fields = fields, issue = issue)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdProjectGet(id: String, fields: String?) : Project? {
        val config = issuesIdProjectGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdProjectPost(id: String, fields: String?, project: Project?) : Project? {
        val config = issuesIdProjectPostRequestConfig(id = id, fields = fields, project = project)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdTimeTrackingGet(id: String, fields: String?) : IssueTimeTracker? {
        val config = issuesIdTimeTrackingGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdTimeTrackingWorkItemsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueWorkItem>? {
        val config = issuesIdTimeTrackingWorkItemsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdDelete(id: String, issueWorkItemId: String) {
        val config = issuesIdTimeTrackingWorkItemsIssueWorkItemIdDeleteRequestConfig(id = id, issueWorkItemId = issueWorkItemId)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdGet(id: String, issueWorkItemId: String, fields: String?) : IssueWorkItem? {
        val config = issuesIdTimeTrackingWorkItemsIssueWorkItemIdGetRequestConfig(id = id, issueWorkItemId = issueWorkItemId, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdTimeTrackingWorkItemsIssueWorkItemIdPost(id: String, issueWorkItemId: String, fields: String?, issueWorkItem: IssueWorkItem?) : IssueWorkItem? {
        val config = issuesIdTimeTrackingWorkItemsIssueWorkItemIdPostRequestConfig(id = id, issueWorkItemId = issueWorkItemId, fields = fields, issueWorkItem = issueWorkItem)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesIdTimeTrackingWorkItemsPost(id: String, fields: String?, issueWorkItem: IssueWorkItem?) : IssueWorkItem? {
        val config = issuesIdTimeTrackingWorkItemsPostRequestConfig(id = id, fields = fields, issueWorkItem = issueWorkItem)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun issuesPost(draftId: String?, fields: String?, issue: Issue?) : Issue? {
        val config = issuesPostRequestConfig(draftId = draftId, fields = fields, issue = issue)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun savedQueriesGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<SavedQuery>? {
        val config = savedQueriesGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun savedQueriesIdDelete(id: String) {
        val config = savedQueriesIdDeleteRequestConfig(id = id)
        val response = request(config)
        handleResponse<Unit>(response, mapper)
    }

    override fun savedQueriesIdGet(id: String, fields: String?) : SavedQuery? {
        val config = savedQueriesIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun savedQueriesIdPost(id: String, fields: String?, savedQuery: SavedQuery?) : SavedQuery? {
        val config = savedQueriesIdPostRequestConfig(id = id, fields = fields, savedQuery = savedQuery)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun savedQueriesPost(fields: String?, savedQuery: SavedQuery?) : SavedQuery? {
        val config = savedQueriesPostRequestConfig(fields = fields, savedQuery = savedQuery)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun searchAssistGet(fields: String?) : SearchSuggestions? {
        val config = searchAssistGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersGet(fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<User>? {
        val config = usersGetRequestConfig(fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdGet(id: String, fields: String?) : User? {
        val config = usersIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesGeneralGet(id: String, fields: String?) : GeneralUserProfile? {
        val config = usersIdProfilesGeneralGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesGeneralPost(id: String, fields: String?, generalUserProfile: GeneralUserProfile?) : GeneralUserProfile? {
        val config = usersIdProfilesGeneralPostRequestConfig(id = id, fields = fields, generalUserProfile = generalUserProfile)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesNotificationsGet(id: String, fields: String?) : NotificationsUserProfile? {
        val config = usersIdProfilesNotificationsGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesNotificationsPost(id: String, fields: String?, notificationsUserProfile: NotificationsUserProfile?) : NotificationsUserProfile? {
        val config = usersIdProfilesNotificationsPostRequestConfig(id = id, fields = fields, notificationsUserProfile = notificationsUserProfile)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesTimetrackingGet(id: String, fields: String?) : TimeTrackingUserProfile? {
        val config = usersIdProfilesTimetrackingGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdProfilesTimetrackingPost(id: String, fields: String?, timeTrackingUserProfile: TimeTrackingUserProfile?) : TimeTrackingUserProfile? {
        val config = usersIdProfilesTimetrackingPostRequestConfig(id = id, fields = fields, timeTrackingUserProfile = timeTrackingUserProfile)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdSavedQueriesGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<SavedQuery>? {
        val config = usersIdSavedQueriesGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersIdTagsGet(id: String, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueTag>? {
        val config = usersIdTagsGetRequestConfig(id = id, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun usersMeGet(fields: String?) : Me? {
        val config = usersMeGetRequestConfig(fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun workItemsGet(query: String?, startDate: java.time.LocalDate?, endDate: java.time.LocalDate?, start: Int?, end: Int?, createdStart: Int?, createdEnd: Int?, updatedStart: Int?, updatedEnd: Int?, author: String?, creator: String?, fields: String?, dollarSkip: Int?, dollarTop: Int?) : List<IssueWorkItem>? {
        val config = workItemsGetRequestConfig(query = query, startDate = startDate, endDate = endDate, start = start, end = end, createdStart = createdStart, createdEnd = createdEnd, updatedStart = updatedStart, updatedEnd = updatedEnd, author = author, creator = creator, fields = fields, dollarSkip = dollarSkip, dollarTop = dollarTop)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    override fun workItemsIdGet(id: String, fields: String?) : IssueWorkItem? {
        val config = workItemsIdGetRequestConfig(id = id, fields = fields)
        val response = request(config)
        return handleResponse(response, mapper)
    }

    private inline fun <reified I> request(requestConfig: RequestConfig<I>): YoutrackResponse {
        val baseUrl = youtrackApiConfig.baseUrl
        val apiPath = youtrackApiConfig.apiPath
        requestConfig.headers["Authorization"] = "Bearer ${youtrackApiConfig.authToken}"

        val request = HttpGet(baseUrl)

        val parameters = requestConfig.query.flatMap { query ->
            query.value.map { queryValue ->
                BasicNameValuePair(query.key, queryValue)
            }
        }

        request.uri = URIBuilder(baseUrl).apply {
            path = apiPath.trimStart('/') + requestConfig.path
            addParameters(parameters)
        }.build()

        requestConfig.headers.forEach { header ->
            request.addHeader(header.key, header.value)
        }

        return executeRequest(request)
    }

    private inline fun <reified T> handleResponse(response: YoutrackResponse, mapper: ObjectMapper): T? {
        return when (response.responseType()) {
            ResponseType.Success -> response.body?.let { mapper.readValue(it) }
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses : $response")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses : $response")
            ResponseType.ClientError -> throw Exception("Client error : $response")
            ResponseType.ServerError -> throw Exception("Server error : $response")
        }
    }

    private fun executeRequest(request: HttpRequestBase): YoutrackResponse {
        return httpClientBuilder.build().use { httpClient ->
            try {
                httpClient.execute(request).use { response ->
                    val responseBody = tryOrNull { EntityUtils.toString(response.entity, StandardCharsets.UTF_8) }

                    YoutrackResponse(
                        response.statusLine.statusCode,
                        response.statusLine.reasonPhrase,
                        responseBody
                    )
                }
            } catch (e: Exception) {
                YoutrackResponse(
                    400,
                    "Error executing youtrack http request: \"${e.message}\"",
                    null
                )
            }
        }
    }
}

class YoutrackResponse(
    val statusCode: Int,
    val message: String,
    val body: String?
) {
    fun responseType(): ResponseType {
        return when (statusCode.firstDigit()) {
            1 -> ResponseType.Informational
            2 -> ResponseType.Success
            3 -> ResponseType.Redirection
            4 -> ResponseType.ClientError
            5 -> ResponseType.ServerError
            else -> {
                ResponseType.ClientError
            }
        }
    }

    override fun toString(): String {
        return "YoutrackResponse(statusCode=$statusCode, message='$message', body=$body)"
    }
}

enum class ResponseType {
    Success, Informational, Redirection, ClientError, ServerError
}