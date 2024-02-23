
# Address 10

## Structure

`Address10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Required | - | String getStreet() | setStreet(String street) |
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
  "Street": "Street6",
  "City": "City6",
  "District": "District2",
  "PostCode": "PostCode2",
  "PostBoxCode": "PostBoxCode0",
  "SubCountry": "SubCountry2",
  "CountryCode": "CountryCode8",
  "Geolocation": {
    "Latitude": "Latitude8",
    "Longitude": "Longitude6"
  }
}
```

