
# Address 1

## Structure

`Address1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `List<String>` | Optional | - | List<String> getStreet() | setStreet(List<String> street) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `District` | `String` | Optional | - | String getDistrict() | setDistrict(String district) |
| `PostCode` | `String` | Optional | - | String getPostCode() | setPostCode(String postCode) |
| `PostBoxCode` | `String` | Optional | - | String getPostBoxCode() | setPostBoxCode(String postBoxCode) |
| `SubCountry` | `String` | Optional | - | String getSubCountry() | setSubCountry(String subCountry) |
| `CountryCode` | `String` | Required | - | String getCountryCode() | setCountryCode(String countryCode) |
| `Geolocation` | [`Geolocation`](../../doc/models/geolocation.md) | Optional | - | Geolocation getGeolocation() | setGeolocation(Geolocation geolocation) |

## Example (as JSON)

```json
{
  "Street": [
    "Street4",
    "Street5",
    "Street6"
  ],
  "City": "City0",
  "District": "District8",
  "PostCode": "PostCode6",
  "PostBoxCode": "PostBoxCode4",
  "SubCountry": "SubCountry8",
  "CountryCode": "CountryCode2"
}
```

