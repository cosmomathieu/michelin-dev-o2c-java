
# Envelope Header

## Structure

`EnvelopeHeader`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Required | - | String getVariant() | setVariant(String variant) |
| `ReceiverID` | `String` | Required | - | String getReceiverID() | setReceiverID(String receiverID) |
| `SenderID` | `String` | Required | - | String getSenderID() | setSenderID(String senderID) |
| `MessageType` | `String` | Required | - | String getMessageType() | setMessageType(String messageType) |
| `InterchangeID` | `String` | Optional | - | String getInterchangeID() | setInterchangeID(String interchangeID) |
| `Timestamp` | `String` | Required | - | String getTimestamp() | setTimestamp(String timestamp) |
| `NumberOfMessages` | `String` | Required | - | String getNumberOfMessages() | setNumberOfMessages(String numberOfMessages) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID6",
  "Variant": "Variant0",
  "ReceiverID": "ReceiverID0",
  "SenderID": "SenderID4",
  "MessageType": "MessageType4",
  "InterchangeID": "InterchangeID2",
  "Timestamp": "Timestamp0",
  "NumberOfMessages": "NumberOfMessages4"
}
```

