# Constraints in SQL

Constraints are nothing but **conditions** that we assign to a particular **column** in order to **validate the data** stored in a table.

Constraints help in maintaining:
- Data accuracy
- Data integrity
- Consistency in the database

There are mainly **6 types of constraints** used in SQL as follows:

1. UNIQUE  
2. NOT NULL  
3. CHECK  
4. PRIMARY KEY  
5. FOREIGN KEY  
6. DEFAULT  

---

## 1. UNIQUE Constraint

- Ensures that all values in a column are **different**
- Does not allow **duplicate values**
- NULL values are allowed (but only one)

Used when:
- Email
- Mobile number
- Username

---

## 2. NOT NULL Constraint

- Ensures that a column **cannot have NULL values**
- Value must be provided while inserting data

Used when:
- Name
- Roll number
- Salary

---

## 3. CHECK Constraint

- Validates data based on a **condition**
- Allows only values that satisfy the given condition

Examples:
- Age must be greater than 18
- Salary must be greater than 0

---

## 4. PRIMARY KEY Constraint

- Uniquely identifies each record in a table
- Combination of **UNIQUE + NOT NULL**
- Only one primary key is allowed per table

Used when:
- Employee ID
- Student ID
- Account number

---

## 5. FOREIGN KEY Constraint

- Establishes a relationship between **two tables**
- Refers to the **primary key** of another table
- Maintains **referential integrity**

Used when:
- Linking child table with parent table

---

## 6. DEFAULT Constraint

- Assigns a **default value** to a column
- Used when no value is provided during insertion

Examples:
- Default city = 'Pune'
- Default status = 'Active'

---

## Importance of Constraints

- Prevents invalid data entry
- Maintains data integrity
- Improves database reliability
- Makes data meaningful and consistent

---