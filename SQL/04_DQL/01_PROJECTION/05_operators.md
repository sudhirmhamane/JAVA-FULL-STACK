# Operators in SQL

Operators in SQL are **symbols or keywords** that are used to **perform operations on data**.  
They are mainly used in **expressions**, **conditions**, and **calculations** inside SQL queries.

Operators help to:
- Perform arithmetic calculations
- Compare values
- Combine multiple conditions
- Filter data
- Perform logical decisions

---

## Types of Operators in SQL

SQL operators are mainly classified into the following types:

1. Arithmetic Operators  
2. Relational (Comparison) Operators  
3. Logical Operators  
4. Set Operators  
5. Special Operators  
6. Comparision Operators
7. Sub Query Operator(ANY, ALL)
8. Corelated Sub Query Operator
9. Concat Operator

---

## 1. Arithmetic Operators

Arithmetic operators are used to perform **mathematical calculations** on numeric values or columns.

### Arithmetic Operators List

| Operator | Description |
|--------|------------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |

---

### Examples of Arithmetic Operators

WAQTD employee name, salary, and annual salary.

SELECT ename, sal, sal * 12  
FROM emp;

WAQTD employee name and salary after 10% increment.

SELECT ename, sal, sal + (sal * 0.10)  
FROM emp;

---

## 2. Relational (Comparison) Operators

Relational operators are used to **compare two values**.  
They are mostly used in the **WHERE clause** to filter records.

### Relational Operators List

| Operator | Description |
|--------|------------|
| = | Equal to |
| != or <> | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |

---

### Examples of Relational Operators

WAQTD all employees whose salary is greater than 3000.

SELECT *  
FROM emp  
WHERE sal > 3000;

WAQTD employees whose department number is not equal to 10.

SELECT *  
FROM emp  
WHERE deptno <> 10;

---

## 3. Logical Operators

Logical operators are used to **combine multiple conditions** in a query.

### Logical Operators List

| Operator | Description |
|--------|------------|
| AND | All conditions must be true |
| OR | Any one condition must be true |
| NOT | Reverses the condition |

---

### Examples of Logical Operators

WAQTD employees whose salary is greater than 3000 and department number is 10.

SELECT *  
FROM emp  
WHERE sal > 3000 AND deptno = 10;

WAQTD employees who work in department 10 or department 20.

SELECT *  
FROM emp  
WHERE deptno = 10 OR deptno = 20;

WAQTD employees who are not from department 30.

SELECT *  
FROM emp  
WHERE NOT deptno = 30;

---

## 4. Set Operators

Set operators are used to **combine the results of two or more SELECT queries**.

### Set Operators List

| Operator | Description |
|--------|------------|
| UNION | Combines results and removes duplicates |
| UNION ALL | Combines results including duplicates |
| INTERSECT | Returns common records |
| MINUS | Returns records from first query not in second |

---

### Rules for Set Operators

- Number of columns must be same
- Data types must be compatible
- Column order must be same

---

### Examples of Set Operators

SELECT ename FROM emp1  
UNION  
SELECT ename FROM emp2;

SELECT ename FROM emp1  
MINUS  
SELECT ename FROM emp2;

---

## 5. Special Operators

Special operators are used for **specific conditions** and **pattern matching**.

### Special Operators List

| Operator | Description |
|--------|------------|
| IN | Matches values in a list |
| NOT IN | Excludes values from a list |
| BETWEEN | Range of values |
| NOT BETWEEN | Outside range |
| LIKE | Pattern matching |
| IS NULL | Checks null values |
| IS NOT NULL | Checks non-null values |

---

### Examples of Special Operators

WAQTD employees working in department 10 or 20.

SELECT *  
FROM emp  
WHERE deptno IN (10, 20);

WAQTD employees whose salary is between 2000 and 4000.

SELECT *  
FROM emp  
WHERE sal BETWEEN 2000 AND 4000;

WAQTD employees whose name starts with 'S'.

SELECT *  
FROM emp  
WHERE ename LIKE 'S%';

WAQTD employees whose commission is null.

SELECT *  
FROM emp  
WHERE comm IS NULL;

---

## Importance of Operators

- Used to filter data
- Used in expressions
- Helps in decision making
- Essential for writing effective SQL queries

---

## Summary

- Operators perform operations on data
- Arithmetic operators handle calculations
- Relational operators compare values
- Logical operators combine conditions
- Set operators combine query results
- Special operators handle patterns and ranges