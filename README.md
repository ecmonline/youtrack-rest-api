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

### Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
