
# Custom Header Signature



Documentation for accessing and setting credentials for apikey.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| apikey | `String` | - | `apikey` | `getApikey()` |



**Note:** Auth credentials can be set using `apikeyCredentials` in the client builder and accessed through `getApikeyCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
MichelinOrder2CashClient client = new MichelinOrder2CashClient.Builder()
    .apikeyCredentials(new ApikeyModel.Builder(
            "apikey"
        )
        .build())
    .build();
```


