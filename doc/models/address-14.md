
# Address 14

## Structure

`Address14`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `City` | `List<String>` | Optional | - | List<String> getCity() | setCity(List<String> city) |
| `District` | `String` | Optional | - | String getDistrict() | setDistrict(String district) |
| `PostCode` | `String` | Optional | - | String getPostCode() | setPostCode(String postCode) |
| `PostBoxCode` | `String` | Optional | - | String getPostBoxCode() | setPostBoxCode(String postBoxCode) |
| `SubCountry` | `String` | Optional | - | String getSubCountry() | setSubCountry(String subCountry) |
| `CountryCode` | `String` | Required | - | String getCountryCode() | setCountryCode(String countryCode) |

## Example (as JSON)

```json
{
  "Street": "Street2",
  "City": [
    "City3",
    "City2",
    "City1"
  ],
  "District": "District6",
  "PostCode": "PostCode8",
  "PostBoxCode": "PostBoxCode6",
  "CountryCode": "CountryCode4"
}
```

