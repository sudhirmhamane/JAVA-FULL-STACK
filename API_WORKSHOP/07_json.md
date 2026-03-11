# JSON (JavaScript Object Notation)

## Definition

- Json format is the storing data in object datatype of javascript.
- Json is used to store and transfer data from one system to another.
- Json is a direct extension of javascript which means as the data come from the server we dont require parse the data we can easily interprete the data by using javascript.
- Json is more lightweighted when compared with xml.

### Additional Explanation

**JSON (JavaScript Object Notation)** is a **lightweight data interchange format** used to **store and exchange data between systems**.

It is commonly used in:

- Web Applications
- APIs
- Client-Server communication
- Database storage
- Microservices communication

JSON is **language independent**, which means it can be used with many programming languages such as:

- JavaScript
- Java
- Python
- C#
- Go
- PHP

Even though it originated from **JavaScript**, it is now used across almost every technology.

---

# Example

### Storing the student data

```
name -> rakesh  
id -> 401  
result -> fail
```

### JSON Representation

```json
{
    "name": "rakesh",
    "id": 401,
    "result": false
}
```

---

# Rules for Storing the Data Inside JSON

## Ruels for storing the data inside json

1. Provide a boundary for data using parenthesses `{}`.
2. Identify all possible key value pairs.
3. Mention all the keys in double cots `" "`.
4. Mention all the values w.r.to their datatypes.  
   `{String, Number, Boolean, Null, Object, Array}`
5. Between every key and value we have to use `:`.
6. Between every key and value pair we having mention `,`.

### Explanation of the Rules

- JSON data must always start and end with **curly braces `{}`** when representing an object.
- Keys must always be written inside **double quotes**.
- Values must match their **correct data type**.
- Every **key and value pair is separated by `:`**.
- Multiple key-value pairs are separated by **comma `,`**.

---

# JSON Datatypes

JSON supports the following datatypes:

| Datatype | Description | Example |
|--------|-------------|--------|
| String | Text data | `"name": "Rakesh"` |
| Number | Numeric values | `"id": 401` |
| Boolean | true or false values | `"result": false` |
| Null | Empty value | `"middleName": null` |
| Object | Nested JSON structure | `"student": { }` |
| Array | List of values | `"skills": ["Java", "SQL"]` |

---

# Json Format

```json
{
    "Name": "Rakesh",
    "ID": 401,
    "Result": false
}
```

---

# One-to-One and One-to-N Nature

- The first four datatypes are come under **one-to-one nature**
- one-to-one -> one key and one value.

Example

```json
{
    "name": "Rakesh"
}
```

Here one key maps to one value.

---

- arrays and objects come under **one-to-n nature like (one key and multiple values)**

Example

```json
{
    "skills": ["Java", "Python", "API"]
}
```

Here **one key contains multiple values**.

---

# Array Syntax

### Array syntax:

```json
{
    "ArrayName": ["java", "python", "API"]
}
```

### Explanation

An **Array in JSON** is used to store **multiple values under a single key**.

Example:

```json
{
    "skills": ["Java", "Python", "SQL", "API"]
}
```

Arrays are commonly used for:

- Lists of skills
- Product categories
- User roles
- Tags

---

# Object Syntax

Inside object, data is defined or stored in **key-value pairs**.

### Object Syntax

```json
{
    "product":
    {
        "name": "iphone",
        "Price": 144444,
        "Insurance": true,
        "Color": ["blue", "Orange"]
    }
}
```

### Explanation

An **Object inside JSON** allows us to create **nested structures**.

Objects are useful for representing **real world entities** such as:

- User
- Product
- Order
- Employee

Example:

```json
{
    "employee": {
        "name": "Rahul",
        "id": 101,
        "department": "IT"
    }
}
```

---

# HTTP Structure

HTTP communication happens between **Client and Server**.

It consists of two main parts:

1. HTTP Request
2. HTTP Response

---

# HTTP Request

A **HTTP Request** is sent from the **client to the server** to request some data or perform an operation.

Example:

- Fetch product list
- Login user
- Submit form
- Upload file

HTTP Request has two main parts:

1. Header
2. Body

---

## Header

The **Header** contains **metadata about the request**.

---

### 1. Base URL

```
https://www.ecom.com
```

- Base url indicates the address from the client to the server.
- It represents the **main server location**.

Example:

```
https://api.github.com
https://www.amazon.com
```

---

### 2. HTTP Methods

HTTP Methods define **what type of operation we want to perform**.

| Method | Purpose |
|------|--------|
| POST | creation of data |
| GET | retrive of data |
| PUT | updating the complete data |
| PATCH | updating the selective data |
| DELETE | used to remove the data |

Example:

```
GET /users
POST /users
DELETE /users/101
```

---

### 3. End Point

- In the big servers or the backend to locate or navigate at perticular APIs we use of end point.
- It is same as the resourse path in web application.

Example:

```
https://api.ecom.com/products
https://api.ecom.com/users
https://api.ecom.com/orders
```

Here:

```
/products
/users
/orders
```

are **API endpoints**.

---

# Body

- data is always provided inside the body parameter.

The **Request Body** contains the **actual data sent to the server**.

Example:

```json
{
    "username": "admin",
    "password": "admin"
}
```

---

# Data Formats

Data can be sent in different formats.

### 1. Form Data

- present in key value pairs and files
- commonly used for **file upload**

Example:

```
username = sudhir
file = image.png
```

---

### 2. URL Encoded

- key-value pair
- mostly used in **HTML form submission**

Example:

```
username=sudhir&password=123
```

---

### 3. Binary

Used for **sending raw files such as images, videos, or PDFs**.

---

### 4. GraphQL

- Query form
- used in modern APIs like **GitHub GraphQL API**

Example

```
query {
  user(id:1){
    name
  }
}
```

---

### 5. Raw Data

Raw data means sending **structured data directly**.

Types:

a. xml  
b. json  
c. html  
d. js  

Example JSON Raw Body:

```json
{
    "product": "Laptop",
    "price": 50000
}
```

---

# HTTP Response

- It also having two section

1. Header
2. Body

The **HTTP Response** is sent from the **server back to the client** after processing the request.

---

# Response Header

## 1. Status Code

- It is a number which helps to understand the request is successfull or unsuccessfull.

### Status Code Categories

| Range | Meaning |
|------|--------|
| 200-299 | successfull |
| 400-499 | unsuccessfull from the client side |
| 500-599 | unsuccessfull from the server side |

Examples:

```
200 OK
201 Created
400 Bad Request
401 Unauthorized
404 Not Found
500 Internal Server Error
```

---

## 2. Status Description

- It is a string which helps to identify the problem or error and the success by giving meaningfull messages.

Examples:

```
200 OK
404 Not Found
500 Internal Server Error
401 Unauthorized
```

---

## 3. Response Time

- it is the time require for the sending the request (R1), proccessing and fetching the data (R2) and the recieving the response (R3)

```
Response Time = R1 + R2 + R3
```

Where:

- **R1** → Request travel time  
- **R2** → Server processing time  
- **R3** → Response travel time  

- It is calculated in **milliseconds (ms)**.

### Response Time Quality

| Response Time | Performance |
|--------------|-------------|
| 40ms - 200ms | Response is good |
| 200ms - 500ms | Response is ok |
| 500ms - 800ms | Response is not good |

---

# Response Body

The **Response Body** contains the **actual data returned by the server**.

Usually the data is returned in **JSON format**.

Example:

```json
{
    "id": 101,
    "name": "Laptop",
    "price": 50000,
    "available": true
}
```

The client application (browser, mobile app, frontend) **reads this data and displays it to the user**.

---

# Summary

- **JSON** is a lightweight data format used for **data storage and data transfer**.
- It is widely used in **APIs and web applications**.
- JSON supports **String, Number, Boolean, Null, Object, and Array** datatypes.
- HTTP communication works using **Request and Response** structure.
- APIs commonly send and receive **JSON data** between client and server.

---