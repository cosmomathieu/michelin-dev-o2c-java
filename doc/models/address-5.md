
# Address 5

## Structure

`Address5`

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
| `Geolocation` | [`Geolocation`](../../doc/models/geolocation.md) | Optional | - | Geolocation getGeolocation() | setGeolocation(Geolocation geolocation) |

## Example (as JSON)

```json
{
  "Street": [
    "Street2"
  ],
  "City": "City2",
  "District": "District0",
  "PostCode": "PostCode4",
  "PostBoxCode": "PostBoxCode2",
  "CountryCode": "CountryCode0"
}
```

