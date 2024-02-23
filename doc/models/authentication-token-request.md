
# Authentication Token Request

## Structure

`AuthenticationTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrantType` | `String` | Required | - | String getGrantType() | setGrantType(String grantType) |
| `ClientId` | `String` | Required | - | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | - | String getClientSecret() | setClientSecret(String clientSecret) |

## Example (as JSON)

```json
{
  "grant_type": "grant_type4",
  "client_id": "client_id0",
  "client_secret": "client_secret6"
}
```

