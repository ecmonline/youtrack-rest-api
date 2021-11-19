# youtrack-rest-api

This was generated with https://github.com/OpenAPITools/openapi-generator then fixed and rewritten to use apache http.

### Example:

```
  private val youtrackApiConfig = YoutrackApiConfig(
    baseUrl = "https://yourorg.myjetbrains.com",
    authToken = "your auth token"
  )
  
  private val youtrackRestApi = YoutrackApi(youtrackApiConfig)
  
  val issue: Issue? = youtrackRestApi.issuesIdGet (
    "id",
    "\$typedescription, resolved,summary,updated"
  )
```
