# Special Operators

These operators are used to perform special types of operation in a SQL.

In the SQL their are 8 types of special operators are present as follows,

1. IN 
2. NOT IN
3. IS 
4. NOT IS
5. BETWEEN 
6. NOT BETWEEN
7. LIKE 
8. NOT LIKE

---

- Out of SQL we are going to learn
1. Regular Expressions
2. Escape Expressions

---

## 1. IN vs NOT IN

These are the special operator which are used to handle multiple values at RHS side.

- **IN** - It will act as or operator handle multiple values at RHS while comparing the values.
- **NOT IN** - Its is the opposite to in operator.
- **Syntax:**
- WHERE COL/EXP IN/NOT IN (V1, V2,..Vn)

---

### Q1. WAQTD all the details of emp, the emp who are working in deptno 10, 20, 30.

ANSWER:

SELECT *
FROM emp
WHERE deptno IN(10, 20, 30);

---

### Q2. WAQTD all the details of emp, the emp who are working as salesman, manager and president.

ANSWER:

SELECT *
FROM emp
WHERE job IN ('SALESMAN', 'MANAGER', 'PRESIDENT');

---

### Q3. WAQTD all the details of emp, the emp who are working in deptno 10 and 20 as sm, m, c, p and an.

ANSWER:

SELECT *
FROM EMP
WHERE DEPTNO IN (10, 20) AND JOB IN ('SALESMAN', 'MANAGER', 'CLEARK', 'PRESIDENT', 'ANALYST');

---

### Q4. WAQTD all details of emp, the emp whos are working in dept no 10, 20.

ANSWER:

SELECT *
FROM emp
WHERE dept NOT IN (10,20);

---

### Q5. WAQTD ALL the details of emp, the emp whos salary are 3000, 5000, 1500, 1600 except deptno 10 and 30.

ANSWER:

SELECT *
FROM emp
WHERE sal IN (3000, 5000, 1500, 1600) AND deptno NOT IN (10, 30);