# Alias in SQL

An **Alias** is an alternative or temporary name given to a **column, expression, or table** in SQL.

Alias is mainly used to:
- Improve readability of output
- Rename columns or expressions in result set
- Make query results user-friendly

Alias names are valid **only for the duration of the query execution**.

---

## Alias for Column

- Alias can be assigned to a column or expression in the SELECT clause.
- The alias name appears as the **column heading** in the output.
- It does not change the actual column name in the table.

### Syntax

SELECT column_name AS alias_name  
FROM table_name;

The keyword **AS** is optional.

---

## Assigning Alias in Different Ways

Alias name can be assigned in three ways:

1. Using **AS keyword**
2. Without using **AS keyword**
3. Using **double quotes (" ")** or **single quotes (' ')** for special cases

---

## Examples of Column Alias

### 1. Alias using AS keyword

SELECT ename AS employee_name  
FROM emp;

---

### 2. Alias without using AS keyword

SELECT ename employee_name  
FROM emp;

---

### 3. Alias using quotes (for spaces or special characters)

SELECT ename AS "Employee Name"  
FROM emp;

---

## Alias with Expression

Alias is commonly used with **expressions** to give meaningful names to calculated columns.

### Example

WAQTD employee name, salary, and annual salary of all employees.

SELECT ename, sal, sal * 12 AS annual_salary  
FROM emp;

Here:
- `sal * 12` is an expression
- `annual_salary` is the alias

---

## Alias with Multiple Expressions

WAQTD employee name, actual salary, annual salary, half-year salary, and quarter-year salary.

SELECT ename,  
       sal,  
       sal * 12 AS annual_salary,  
       sal * 6 AS half_year_salary,  
       sal * 3 AS quarter_salary  
FROM emp;

---

## Alias for Table

- Alias can also be assigned to a table.
- Table alias is useful when:
  - Query is long
  - Using joins
  - Referring to same table multiple times

### Syntax

SELECT column_name  
FROM table_name alias_name;

---

## Example of Table Alias

SELECT e.ename, e.sal  
FROM emp e;

Here:
- `e` is the alias for table `emp`
- Used to shorten column references

---

## Important Rules of Alias

- Alias name should be **meaningful**
- Alias name can contain spaces only when enclosed in quotes
- Alias cannot be used in the **WHERE clause**
- Alias is temporary and exists only during query execution
- Alias does not change actual column or table structure

---

## Common Errors Related to Alias

- Using alias in WHERE clause
- Forgetting quotes when alias contains spaces
- Assuming alias is stored permanently

---

## Advantages of Using Alias

- Makes output readable
- Simplifies complex expressions
- Helps in reporting
- Improves query clarity

---

## Summary

- Alias provides an alternative name to column, expression, or table
- Used in SELECT clause
- AS keyword is optional
- Alias improves readability
- Alias is temporary
