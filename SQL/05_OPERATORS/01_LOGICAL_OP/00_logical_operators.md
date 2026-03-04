# Logical Operators in SQL

Logical operators in SQL are used to **combine multiple filter conditions** in the `WHERE` clause.  
They help in applying **more than one condition** to filter records from a table.

Logical operators mainly work with **boolean results** (TRUE or FALSE).

---

## AND Logical Operator

- The AND operator is used to pass **multiple filter conditions** to the `WHERE` clause.
- The AND operator returns **TRUE only when all conditions are satisfied** for a record.
- If any one condition is FALSE, the final result will be FALSE.

### Syntax

SELECT *  
FROM table_name  
WHERE condition1 AND condition2;

---

### Truth Table for AND Operator

| Input 1 | Input 2 | Result |
|-------|--------|--------|
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |

---

### Example

WAQTD all the details of employees whose salary is greater than 3000 AND department number is 20.

SELECT *  
FROM emp  
WHERE sal > 3000 AND deptno = 20;

---

## OR Logical Operator

- The OR operator is used when **any one condition** needs to be satisfied.
- The OR operator returns TRUE if **at least one condition is TRUE**.
- It returns FALSE only when **all conditions are FALSE**.

### Syntax

SELECT *  
FROM table_name  
WHERE condition1 OR condition2;

---

### Truth Table for OR Operator

| Input 1 | Input 2 | Result |
|-------|--------|--------|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

---

### Example

WAQTD all the details of employees who are working in department 10 OR department 20.

SELECT *  
FROM emp  
WHERE deptno = 10 OR deptno = 20;

---

## NOT Logical Operator

- The NOT operator is used to **reverse the result of a condition**.
- If the condition is TRUE, NOT makes it FALSE.
- If the condition is FALSE, NOT makes it TRUE.

### Syntax

SELECT *  
FROM table_name  
WHERE NOT condition;

---

### Truth Table for NOT Operator

| Input | Result |
|------|--------|
| 0 | 1 |
| 1 | 0 |

---

### Example

WAQTD all the details of employees who are NOT working in department 30.

SELECT *  
FROM emp  
WHERE NOT deptno = 30;

---

## Using Logical Operators with Multiple Conditions

Logical operators can be combined to form **complex conditions**.

### Example 1

WAQTD all the details of employees who are working as SALESMAN AND department number is 30 AND salary is greater than 2000.

SELECT *  
FROM emp  
WHERE job = 'SALESMAN'  
AND deptno = 30  
AND sal > 2000;

---

### Example 2

WAQTD all the details of employees who are MANAGERS in department 10 OR 20.

SELECT *  
FROM emp  
WHERE job = 'MANAGER'  
AND (deptno = 10 OR deptno = 20);

---

## Important Notes on Logical Operators

- AND operator gives **narrow results** (more filtering)
- OR operator gives **wider results** (less filtering)
- NOT operator is used to **exclude records**
- Logical operators are mostly used in the `WHERE` clause
- Parentheses `( )` should be used to avoid confusion in complex conditions

---

## Summary

- AND → All conditions must be TRUE  
- OR → Any one condition must be TRUE  
- NOT → Reverses the condition  
- Logical operators help in filtering data accurately  
- Used extensively in real-time SQL queries
