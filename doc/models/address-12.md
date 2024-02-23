
# Address 12

## Structure

`Address12`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `List<String>` | Required | - | List<String> getStreet() | setStreet(List<String> street) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `District` | `String` | Optional | - | String getDistrict() | setDistrict(String district) |
| `PostCode` | `String` | Required | - | String getPostCode() | setPostCode(String postCode) |
| `PostBoxCode` | `String` | Optional | - | String getPostBoxCode() | setPostBoxCode(String postBoxCode) |
| `SubCountry` | `String` | Optional | - | String getSubCountry() | setSubCountry(String subCountry) |
| `CountryCode` | `String` | Required | - | String getCountryCode() | setCountryCode(String countryCode) |
| `Geolocation` | [`Geolocation`](../../doc/models/geolocation.md) | Optional | - | Geolocation getGeolocation() | setGeolocation(Geolocation geolocation) |

## Example (as JSON)

```json
{
  "Street": [
    "Street8"
  ],
  "City": "City6",
  "District": "District4",
  "PostCode": "PostCode0",
  "PostBoxCode": "PostBoxCode8",
  "SubCountry": "SubCountry4",
  "CountryCode": "CountryCode6",
  "Geolocation": {
    "Latitude": "Latitude8",
    "Longitude": "Longitude6"
  }
}
```

