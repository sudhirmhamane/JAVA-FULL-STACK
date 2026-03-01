# Statements in SQL

Statements in SQL are the **commands** used to **interact with a database** in order to perform different types of operations such as creating tables, inserting data, updating records, retrieving data, and controlling access.

SQL statements are mainly divided into the following categories:

1. DDL (Data Definition Language)  
2. DML (Data Manipulation Language)  
3. DQL (Data Query Language)  
4. TCL (Transaction Control Language)  
5. DCL (Data Control Language)

---

## 1. DDL (Data Definition Language)

DDL is a category of SQL statements that is responsible for the **creation, definition, and deletion of database objects**.

- It works at the **structural level** of the database
- It defines **how tables, columns, and objects should be created**
- Changes made by DDL statements are **auto-committed**

DDL statements mainly deal with:
- Tables
- Views
- Indexes
- Schemas

### DDL Subtypes

a. CREATE  
b. ALTER  
c. DROP  
d. TRUNCATE  
e. RENAME  

---

### a. CREATE Statement

The CREATE statement is used to **create new database objects** such as tables, databases, or views.

Example:
CREATE TABLE student (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(20),
    age NUMBER
);

---

### b. ALTER Statement

The ALTER statement is used to **modify the structure** of an existing table.

Operations include:
- Add a column
- Modify a column
- Drop a column

Example:
ALTER TABLE student ADD marks NUMBER;

---

### c. DROP Statement

The DROP statement is used to **permanently delete a database object**.

- Structure and data are both removed
- Cannot be rolled back

Example:
DROP TABLE student;

---

### d. TRUNCATE Statement

The TRUNCATE statement is used to **remove all records** from a table.

- Table structure remains
- Faster than DELETE
- Cannot be rolled back

Example:
TRUNCATE TABLE student;

---

### e. RENAME Statement

The RENAME statement is used to **change the name of a database object**.

Example:
RENAME student TO student_info;

---

## 2. DML (Data Manipulation Language)

DML is a category of SQL statements used to **manipulate data stored in tables**.

- It works at the **data level**
- It deals with **rows and records**
- Changes can be **rolled back**

### DML Subtypes

a. INSERT  
b. UPDATE  
c. DELETE  

---

### a. INSERT Statement

The INSERT statement is used to **add new records** into a table.

Example:
INSERT INTO student VALUES (1, 'Sudhir', 22);

---

### b. UPDATE Statement

The UPDATE statement is used to **modify existing records** in a table.

Example:
UPDATE student SET age = 23 WHERE id = 1;

---

### c. DELETE Statement

The DELETE statement is used to **remove specific records** from a table.

Example:
DELETE FROM student WHERE id = 1;

---

## 3. DQL (Data Query Language)

DQL is used to **retrieve data** from the database.

- It does not modify data
- It is mainly used for **data fetching and reporting**

### Main DQL Statement

SELECT

Example:
SELECT * FROM student;

DQL supports:
- WHERE
- ORDER BY
- GROUP BY
- HAVING

---

## 4. TCL (Transaction Control Language)

TCL statements are used to **manage transactions** in the database.

A transaction is a **set of operations** that must be executed completely or not at all.

TCL ensures:
- Data consistency
- Data recovery

### TCL Commands

a. ROLLBACK  
b. COMMIT  
c. SAVEPOINT  

---

### a. COMMIT

- Saves all changes permanently
- Ends the current transaction

Example:
COMMIT;

---

### b. ROLLBACK

- Undoes changes made during the transaction
- Restores data to last committed state

Example:
ROLLBACK;

---

### c. SAVEPOINT

- Creates a point within a transaction
- Used to rollback to a specific point

Example:
SAVEPOINT sp1;

---

## 5. DCL (Data Control Language)

DCL statements are used to **control access and permissions** in the database.

- Used for security purposes
- Controls who can access database objects

### DCL Commands

a. GRANT  
b. REVOKE  

---

### a. GRANT

The GRANT statement is used to **provide permissions** to users.

Example:
GRANT SELECT ON student TO user1;

---

### b. REVOKE

The REVOKE statement is used to **remove permissions** from users.

Example:
REVOKE SELECT ON student FROM user1;

---

## Summary

- DDL → Structure of database  
- DML → Data inside tables  
- DQL → Fetching data  
- TCL → Transaction management  
- DCL → Access control and security  
