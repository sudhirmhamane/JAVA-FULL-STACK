# Use of APIs in Postman (ShopperStack)

## ShopperStack APIs

ShopperStack provides RESTful Web Service APIs.

These APIs help us to send requests to the server without using GUI (Graphical User Interface).

Using tools like Postman, we can directly interact with the server by sending requests and receiving responses.

---

## API Documentation

In the documentation 46 APIs are available, which we can access using Postman.

But we cannot access these APIs directly, because the Shopper profile exists inside the Shopper Server.

So before accessing the APIs we must:

* Create a Server Environment
* Modify required variables
* Then create or access the API

---

## Server Setup in Postman

### Create a Workspace

Before accessing APIs we must create a workspace in Postman.

The workspace name should be same as the server API account used for access.

Example:

Workspace Name: shoppersstack

---

## Structure of APIs

There are 46 APIs, so the APIs should be well structured.

For that reason, APIs are organized into separate folders based on models.

Example structure:

Server Data Stored → Workspace (Postman)
Module Data Stored → Collections
API Data Stored → Requests

This structure helps to organize and manage APIs efficiently.

---

## Endpoints

An Endpoint is a specific URL where an API can be accessed.

Endpoints are divided into two types.

### 1. Static Endpoint

A static endpoint directly copies the URL.

Example:

https://api.shoppersstack.com/users

### 2. Dynamic Endpoint

A dynamic endpoint requires a value to be passed.

These values are usually given inside curly brackets {}.

Example:

https://api.shoppersstack.com/users/{userId}

Here userId is a dynamic value.

---

## Important Components of API Request

There are three important components while working with APIs.

1. Authorization
2. Parameters
3. Headers

---

### 1. Authorization

Authorization is used to verify the user identity before accessing APIs.

Example:

* Login using email and password
* Generate authentication token
* Use token to access protected APIs

---

### 2. Parameters

Parameters are used to send values to the server.

Types of parameters:

* Path Parameter
* Query Parameter

Example:

https://api.example.com/users?id=10

Here:

id = Query Parameter

---

### 3. Headers

Headers provide additional information about the request.

Example headers:

Content-Type: application/json
Authorization: Bearer token

Headers help the server understand how the data is being sent.

---

## Providing Data in API Requests

Usually data is provided in the Body section of the request.

Example JSON:

{ "email": "[user@gmail.com](mailto:user@gmail.com)", "password": "123456" }

---

## Other Sections Where Data Can Be Provided

Apart from the Body, there are two more sections where we can provide data.

### 1. Query Parameters

Query parameters are used to send data in the URL.

Example:

https://example.com/products?category=electronics

Here:

category = key
electronics = value

---

### 2. Headers

Headers are used to send metadata information about the request.

Example:

Authorization: Bearer Token
Content-Type: application/json

---

## API Flow Example

### Before Login

User cannot access protected APIs.

Examples:

* Register
* Login
* View products

### After Login

Once the user logs in successfully, additional APIs become accessible.

Examples:

* Update Profile
* Place Order
* Address Update
* View Order History

---

## HTTP Methods Used in APIs

GET → Retrieve data
POST → Create new data
PUT → Update complete data
PATCH → Update partial data
DELETE → Remove data

---

## Example API Request in Postman

### Login API

Endpoint:

POST /users/login

Request Body:

{ "email": "[user@gmail.com](mailto:user@gmail.com)", "password": "123456" }

Response Example:

{ "status": "success", "message": "Login Successful", "token": "abc123xyz" }

---

## Providing Data in API Requests

Apart from the Body, there are two more sections where we can provide the data.

* Query Parameters
* Headers

---

## Summary

* ShopperStack provides 46 REST APIs.
* APIs can be accessed using Postman.
* APIs are organized using Workspace → Collections → Requests.
* Endpoints can be Static or Dynamic.
* Data can be sent using Body, Query Parameters, and Headers.
* Authorization is required to access protected APIs.
