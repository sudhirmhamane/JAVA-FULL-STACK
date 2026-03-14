# Postman API Testing – Learning Notes

## 1. What is an API

API stands for **Application Programming Interface**.

An API allows **two software systems to communicate with each other**.

### Example

When you use a food delivery app:

1. App sends request to the server.
2. Server processes request.
3. Server sends response back to the app.

This communication happens using **APIs**.

---

# 2. What is API Testing

API Testing is the process of **sending requests to an API and verifying the response**.

Instead of testing through UI, we directly test the **server endpoints**.

### What we check in API Testing

* Response status code
* Response data
* Response time
* Headers
* Error handling

---

# 3. What is Postman

Postman is a tool used for:

* API Testing
* Sending HTTP requests
* Checking API responses
* Automating API tests

It is widely used by:

* Developers
* QA Engineers
* Backend Engineers

---

# 4. HTTP Methods

HTTP methods define the type of operation performed on a server.

### GET

Used to **retrieve data** from the server.

Example:

```
GET /books
```

### POST

Used to **send data to the server**.

Example:

```
POST /addBook
```

### PUT

Used to **update existing data**.

Example:

```
PUT /updateBook
```

### DELETE

Used to **delete data**.

Example:

```
DELETE /deleteBook
```

---

# 5. HTTP Status Codes

Status codes tell us whether a request was successful or not.

### 200

Request successful

### 201

Resource created successfully

### 400

Bad request from client

### 401

Unauthorized request

### 404

Resource not found

### 500

Internal server error

---

# 6. What is a Collection in Postman

A **Collection** is a group of API requests.

Example:

Collection: Library API

Inside collection:

* Get Books
* Get Book by ID
* Add Book
* Delete Book

Collections help organize API testing.

---

# 7. Types of Workspaces in Postman

## Personal Workspace

Used when working **alone**.

Features:

* Free
* No team collaboration
* Best for learning

---

## Team Workspace

Used when working **with a team**.

Features:

* Collaboration
* Sharing collections
* Requires upgrade for some features

---

# 8. Why Upgrade Message Appears

When a collection is inside a **Team Workspace**, Postman may ask for **upgrade** if you try to share.

This happens because:

Team collaboration features are **paid features**.

Solution:

* Use **Personal Workspace**
* Or avoid sharing if not required

---

# 9. Steps Done During Practice

Today we performed the following steps:

1. Logged into Postman
2. Started Postman API Fundamentals learning
3. Created a workspace
4. Imported the **Postman Library API v2 collection**
5. Sent API requests
6. Observed API responses
7. Learned about upgrade message in team workspace

---

# 10. Example API Requests Practiced

### Get Books

```
GET /books
```

### Get Fiction Books

```
GET /fiction
```

### Get Book by ID

```
GET /books/{id}
```

### Add Book

```
POST /books
```

---

# 11. Key Concepts Learned

* API communication
* Request and response
* HTTP methods
* Status codes
* Collections
* Workspaces
* API testing using Postman

---

# 12. Real World Example

Example: Cricket score app

Steps happening in backend:

1. App sends request to server
2. Server fetches data from database
3. Server sends updated score
4. App displays live score

This process uses **APIs**.

---

# 13. Conclusion

API testing is an important skill for:

* Backend developers
* QA engineers
* Full stack developers

Postman makes it easy to:

* Send API requests
* Test APIs
* Debug server responses

Learning Postman helps understand **how web applications communicate with servers**.

---
