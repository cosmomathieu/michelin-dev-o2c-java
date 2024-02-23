
# Authentication Token Response

## Structure

`AuthenticationTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Optional | - | String getAccessToken() | setAccessToken(String accessToken) |
| `Signature` | `String` | Optional | - | String getSignature() | setSignature(String signature) |
| `Scope` | `String` | Optional | - | String getScope() | setScope(String scope) |
| `InstanceUrl` | `String` | Optional | - | String getInstanceUrl() | setInstanceUrl(String instanceUrl) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `TokenType` | `String` | Optional | - | String getTokenType() | setTokenType(String tokenType) |
| `IssuedAt` | `String` | Optional | - | String getIssuedAt() | setIssuedAt(String issuedAt) |

## Example (as JSON)

```json
{
  "access_token": "access_token8",
  "signature": "signature8",
  "scope": "scope8",
  "instance_url": "instance_url0",
  "id": "id0"
}
```

