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
