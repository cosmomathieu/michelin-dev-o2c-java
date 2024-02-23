
# Address 2

## Structure

`Address2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `List<String>` | Optional | - | List<String> getStreet() | setStreet(List<String> street) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `District` | `String` | Optional | - | String getDistrict() | setDistrict(String district) |
| `PostCode` | `String` | Optional | - | String getPostCode() | setPostCode(String postCode) |
| `PostBoxCode` | `String` | Optional | - | String getPostBoxCode() | setPostBoxCode(String postBoxCode) |
| `SubCountry` | `String` | Optional | - | String getSubCountry() | setSubCountry(String subCountry) |
| `CountryCode` | `String` | Required | - | String getCountryCode() | setCountryCode(String countryCode) |

## Example (as JSON)

```json
{
  "Street": [
    "Street2",
    "Street3",
    "Street4"
  ],
  "City": "City2",
  "District": "District0",
  "PostCode": "PostCode4",
  "PostBoxCode": "PostBoxCode2",
  "CountryCode": "CountryCode0"
}
```

