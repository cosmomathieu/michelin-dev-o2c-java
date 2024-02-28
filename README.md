
# Getting Started with Michelin Order-to-Cash

## Introduction

Michelin Order-to-Cash services for tires dealers, that will help you to manage your orders and invoices with Michelin.
<br><br><b>Authentication details:</b><br>
<br><u>Option A:</u> OAuth2 Client Credentials (recommended)
<br><u>Option B:</u> API Key + Basic Authentication (not recommended)
<br><br>To request your access, please contact your Customer Service Representative.
<br><br>Our services are based on the EDIWHEEL standards.
<br>You can find more information on the <a href="https://www.ediwheel.com/" target="_blank">EDIWHEEL website</a>.

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=import3)

## Installation

The following section explains how to use the MichelinOrder2Cash library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *MichelinOrder2Cash* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify MichelinOrder2Cash in `Group Id`, michelin-order-2-cash in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=MichelinOrder2Cash-Java&workspaceName=MichelinOrder2Cash&projectName=MichelinOrder2Cash&rootNamespace=com.michelin.api.dev&groupId=MichelinOrder2Cash&artifactId=michelin-order-2-cash&version=1.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project MichelinOrder2Cash from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](doc/http-client-configuration.md) | Http Client Configuration instance. |
| `apikeyCredentials` | [`ApikeyCredentials`](doc/auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |
| `basicAuthCredentials` | [`BasicAuthCredentials`](doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |
| `oAuth2ClientCredentialsCredentials` | [`OAuth2ClientCredentialsCredentials`](doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
MichelinOrder2CashClient client = new MichelinOrder2CashClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .apikeyCredentials(new ApikeyModel.Builder(
            "apikey"
        )
        .build())
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "Username",
            "Password"
        )
        .build())
    .oAuth2ClientCredentialsCredentials(new OAuth2ClientCredentialsModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** Dev server |
| environment2 | Qualif server |
| environment3 | Indus server |
| environment4 | Production server |

## Authorization

This API uses the following authentication schemes.

* [`apikey (Custom Header Signature)`](doc/auth/custom-header-signature.md)
* [`basicAuth (Basic Authentication)`](doc/auth/basic-authentication.md)
* [`oAuth2ClientCredentials (OAuth 2 Client Credentials Grant)`](doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [O Auth Authorization](doc/controllers/o-auth-authorization.md)
* [Authentication](doc/controllers/authentication.md)
* [Deliveries](doc/controllers/deliveries.md)
* [Invoices](doc/controllers/invoices.md)
* [Orders](doc/controllers/orders.md)
* [Referentials](doc/controllers/referentials.md)
* [Stocks](doc/controllers/stocks.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

