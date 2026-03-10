# URL (Uniform Resource Locator)

A **URL (Uniform Resource Locator)** is the **address used to access a resource on the internet**.

It is mainly used to **locate web pages, files, images, APIs, or other resources on a server**.

Every URL must be **unique**, so that the requested resource can be correctly identified and accessed.

Example URL:

```
https://www.example.com:443/products?id=101#reviews
```

---

# Syntax of URL

```
protocol://DomainName:PortNumber/ResourcePath?QueryParameter#FragmentID
```

Each part of the URL has a specific role in identifying and accessing the resource.

---

# Components of URL

1. Protocol  
2. Domain Name  
3. Port Number  
4. Resource Path  
5. Query Parameter  
6. Fragment Identifier  

---

# 1. Protocol

A **Protocol** is a **set of rules and instructions** used for communication between two systems over a network.

It defines **how data should be transmitted, formatted, and received** between devices.

Protocols ensure that both systems understand each other during communication.

Protocols are often called the **common language of communication between systems**.

### Purpose of Protocol

- Establish communication between systems
- Define how data is transmitted
- Ensure reliable and secure data transfer

---

## Types of Protocols

### A. Media Protocol

Media protocols are used for **transferring files and messages between systems**.

Examples:

**SMTP (Simple Mail Transfer Protocol)**  
- Used to send emails between mail servers.

**FTP (File Transfer Protocol)**  
- Used to transfer files between a client and a server.

---

### B. Network Protocol

Network protocols are responsible for **data transmission between devices in a network**.

Examples:

**TCP (Transmission Control Protocol)**  
- Reliable protocol
- Ensures data reaches the destination correctly
- Used in web browsing, email, etc.

**UDP (User Datagram Protocol)**  
- Faster but less reliable than TCP
- Used in streaming and online gaming

---

### C. Internet Protocol

Internet protocols are used to **identify and route data packets across the internet**.

The most common internet protocol used in web applications is:

- **HTTP (HyperText Transfer Protocol)**
- **HTTPS (HyperText Transfer Protocol Secure)**

---

### Important Note

From the **web application perspective**, the protocol is **mandatory**.

From the **user perspective**, the protocol may appear optional because browsers automatically add it.

Example:

User may type:
```
google.com
```

But the browser automatically converts it to:
```
https://google.com
```

---

# 2. Domain Name

A **Domain Name** is the **human-readable name of a website**.

It is used to **navigate the user request to the correct server** on the internet.

Since remembering IP addresses is difficult, domain names are used instead.

Example:

```
google.com
amazon.com
github.com
```

Internally, the domain name is translated into an **IP address** using the **DNS (Domain Name System)**.

---

## Types of Domain Names

Domain names are mainly classified into three types.

### A. Subdomain

A **Subdomain** is an additional part added before the main domain.

It helps organize different sections of a website.

Example:

```
blog.google.com
mail.google.com
```

Here:

```
blog
mail
```

are subdomains.

---

### B. Root Domain

The **Root Domain** is the main name of the website.

It consists of:

1. **Domain Name**
2. **IP Address (internally used)**

Example:

```
google.com
amazon.com
```

Here:

```
google
amazon
```

are root domain names.

---

### C. Top Level Domain (TLD)

The **Top Level Domain (TLD)** is the **last part of a domain name**.

Example:

```
.com
.org
.net
.in
```

TLDs are further classified into two types.

---

#### 1. Type-Based TLD

These represent the **type or purpose of the organization**.

Examples:

```
.com  → Commercial
.org  → Organization
.edu  → Educational institutions
.gov  → Government
```

---

#### 2. Region-Based TLD (Country Code)

These represent **specific countries or regions**.

Examples:

```
.in → India
.us → United States
.uk → United Kingdom
.au → Australia
```

---

# 3. Port Number

A **Port Number** is a **virtual communication endpoint** used to identify a specific service running on a server.

It helps the server determine **which application or service should handle the incoming request**.

Different protocols use different port numbers.

Examples:

```
HTTP  → Port 80
HTTPS → Port 443
FTP   → Port 21
SMTP  → Port 25
```

Example URL with port:

```
http://example.com:80
```

Usually, browsers automatically use default ports.

---

# 4. Resource Path

The **Resource Path** specifies the **exact location of a resource on the server**.

It helps redirect the user to a **specific page or file inside the web application**.

Example:

```
https://example.com/products
https://example.com/users/profile
```

Here:

```
/products
/users/profile
```

are resource paths.

---

# 5. Query Parameter

A **Query Parameter** is used to **send input data from the client (user) to the server**.

It helps the server process user requests dynamically.

Query parameters always follow the **key-value pair format**.

Syntax:

```
?key=value
```

Multiple parameters are separated using `&`.

Example:

```
?username=admin&password=admin
```

Example full URL:

```
https://example.com/login?username=admin&password=admin
```

Here:

```
username = admin
password = admin
```

are query parameters sent to the server.

---

# 6. Fragment Identifier (#)

A **Fragment Identifier** is used to **navigate to a specific section inside a webpage**.

It does not send any request to the server.  
It is handled **only by the browser**.

Example:

```
https://example.com/tutorial#introduction
```

Here:

```
#introduction
```

directly scrolls the page to the **introduction section**.

Commonly used in:

- Documentation websites
- Single-page applications
- Long articles

---

# Example of Complete URL

```
https://www.example.com:443/products?category=electronics#reviews
```

Breakdown:

| Component | Value |
|----------|------|
| Protocol | https |
| Domain Name | www.example.com |
| Port Number | 443 |
| Resource Path | /products |
| Query Parameter | category=electronics |
| Fragment ID | reviews |

---

# Summary

A **URL (Uniform Resource Locator)** is the **complete address used to access resources on the internet**.

Main parts of a URL:

1. Protocol – communication rules  
2. Domain Name – identifies the server  
3. Port Number – identifies the service  
4. Resource Path – specific location of resource  
5. Query Parameter – user input sent to server  
6. Fragment ID – navigation inside a web page

---