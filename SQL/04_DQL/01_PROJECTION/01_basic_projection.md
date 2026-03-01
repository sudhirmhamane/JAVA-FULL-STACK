# Projection in DQL

Projection in DQL is the process of **fetching data by selecting specific columns only** from a table instead of retrieving all columns.

Projection helps to:
- Reduce unnecessary data retrieval
- Improve query performance
- Display only required information

---

## Syntax of Projection

SELECT * / [DISTINCT] column_name / expression [ALIAS]
FROM table_name;

Where:
- `*` retrieves all columns
- `DISTINCT` removes duplicate values
- `column_name` specifies required columns
- `expression` performs calculations
- `ALIAS` provides an alternative column name

---

## Working Procedure of Projection

1. The **FROM clause** executes first.

2. The FROM clause goes to the database and searches for the specified table.
   a) If the table is present, the FROM clause processes the table into the **execution area**.  
   b) If the table is not present, the FROM clause gives an error message:  
      **table does not exist**

3. After the FROM clause, the **SELECT clause** executes.

4. The SELECT clause goes to the table produced by the FROM clause.
   a) If the respective column is present, the SELECT clause picks the column and displays it as the final result.  
   b) If the column is not present, the SELECT clause gives an error message:  
      **invalid identifier**

---

## Examples of Projection

1. WAQTD all the employee names from the emp table.

Answer:
SELECT ename FROM emp;

---

2. WAQTD salary of all the employees from the emp table.

Answer:
SELECT sal FROM emp;

---

3. WAQTD employee name, employee salary, and department number of all employees.

Answer:
SELECT ename, sal, dno FROM emp;

---

4. WAQTD all the details of all employees from the emp table.

Answer:
SELECT * FROM emp;

---

## Important Notes on Projection

- In the SELECT clause, **along with `*`**, it is **not possible** to access any additional column or expression directly.
- This is because `*` already represents **all columns** of the table.

Example of invalid usage:
SELECT *, sal FROM emp;

---

## Accessing Extra Columns with `table_name.*`

To access all columns along with additional expressions or columns, we can use:

Syntax:
SELECT table_name.*, column_name
FROM table_name;

Example:
SELECT emp.*, sal
FROM emp;

---

## Advantages of Projection

- Fetches only required columns
- Improves query performance
- Reduces memory usage
- Makes output more readable

---

## Summary

- Projection is used to select specific columns
- FROM clause executes before SELECT
- SELECT clause validates column existence
- Errors occur if table or column does not exist
- Helps in efficient data retrieval
