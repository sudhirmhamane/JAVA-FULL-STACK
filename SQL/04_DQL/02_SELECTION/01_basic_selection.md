# Basics of selection method

Selection method is known as fiteration method which is used to fetch the data from the table by selecting both rows and column.

---

In SQL their are two types of filteration method,

1. Record Filteration Method
2. Group Filteration Method

The **Record fiteration method** we can do by using **'Where'** cluase and **Group Fiteration Method** by using **'Having'** Clause.

---

## 1. Record Fiteration Method:

1) Where Clause:

- Syntax: 

SELECT */[Distinct] col / Exp [Alias]
FROM Table_name
WHERE filter condition;

- Filter Condition => {col / exp + operator + values}

Ex:
col / exp | operator | values 
dno           =          10
sal           >          2000
sal * 12      >          30000

## Process of selection clause

1. First from clause will start the execution

2. After the from clause the 'where' clause start execution

3. The where clause use fiter condition as argument

4. The where clause will execute row by row in the table and checks the condition if condition is true then the where clause select the record, if the condition is false then the where clause will reject the record.

5. The where clause will give the result is in the form of boolean values.

- True -> select record
- False -> reject record

6. After the where clause, finally select clause execute and it will display the final result.

7. In the where clause we can also use multiple filter condition with the help of logical operator.

---

### Question on selection

1. WAQTD All the name of emp table, the emp who are working in dept no 20.

Answer:

SELECT ename
FROM emp
WHERE deptno = 20;

---

2. WAQTD All the name of emp table, the emp who's salary are more than 15000.

Answer:

SELECT ename
FROM emp
WHERE sal > 15000;

---

3. WAQTD All the details of emp table, the emp who's emp no is 7369.

Answer: 

SELECT *
FROM emp
WHERE empno = 7369;

---

4. WAQTD All the name of emp table, the emp who's are working as manager.

Answer:

SELECT *
FROM emp
WHERE job = 'MANAGER';

---

### NOTE:

In SQL while using the string data their are two ristriction.

1. String we need to present within single cot's.

2. The **data** which we are using in **SQL** is case sensitive but SQL is not case sensitive .

3. While using date data in SQL
    a. date we need to inclose within 'single cots'
    b. we must have to follow date syntax given by oracle.
        1.DD-MON-YY => 21-JAN-26
        2.DD-MON-YYYY => 21-JAN-2026

---