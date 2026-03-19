# Multi Row Functions (MRF) in SQL

## The 5 Types of MRF

| Function | Description |
|---|---|
| `MAX()` | Returns the maximum (largest) value in a group |
| `MIN()` | Returns the minimum (smallest) value in a group |
| `COUNT()` | Returns the number of rows in a group |
| `SUM()` | Returns the total sum of values in a group |
| `AVG()` | Returns the average (mean) value of a group |

---

## Rules for Multi Row Functions

### 1. Accepts Only One Argument
MRF allows only **one column / expression / function** as an argument at a time.

```sql
-- ✅ Correct
SELECT MAX(sal) FROM emp;

-- ❌ Wrong — cannot pass multiple columns
SELECT MAX(sal, comm) FROM emp;
```

---

### 2. Multiple MRFs Allowed in SELECT
In the `SELECT` clause, you can use **n number of MRFs** together in the same query.

```sql
-- ✅ Correct — using multiple MRFs in one query
SELECT MAX(sal), MIN(sal), SUM(sal), AVG(sal), COUNT(sal)
FROM emp;
```

---

### 3. MRF Ignores NULL Values
MRF automatically **skips NULL values** while processing. This is important to keep in mind when using `COUNT()` and `AVG()`.

```sql
-- If comm column has NULLs, they are ignored in the calculation
SELECT AVG(comm) FROM emp;  -- averages only non-NULL values
SELECT COUNT(comm) FROM emp; -- counts only non-NULL values
```

> ⚠️ `AVG(comm)` and `(SUM(comm) / COUNT(*))` may give different results if NULLs are present, because `COUNT(*)` includes NULL rows but `COUNT(comm)` does not.

---

### 4. MRF Cannot Be Used in WHERE Clause
MRF **cannot be used in the `WHERE` clause** because:
- `WHERE` clause executes **row by row**
- MRF executes **group by group**

These two are incompatible in execution order. Use `HAVING` clause instead for filtering groups.

```sql
-- ❌ Wrong — MRF not allowed in WHERE
SELECT * FROM emp
WHERE sal = MAX(sal);

-- ✅ Correct — use a subquery in WHERE, or HAVING for groups
SELECT * FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);
```

---

### 5. Difficult to Mix MRF with Normal Columns in SELECT
Using MRF alongside regular (non-aggregated) columns in `SELECT` is **not directly possible** because:
- MRF collapses all rows into a single result
- Regular columns return one value per row
- The result would not be in a proper table format

To combine them, use the **`GROUP BY`** clause.

```sql
-- ❌ Wrong — mixing normal col with MRF without GROUP BY
SELECT ename, MAX(sal)
FROM emp;

-- ✅ Correct — use GROUP BY to group by department, then apply MRF
SELECT deptno, MAX(sal) AS max_salary
FROM emp
GROUP BY deptno;
```

---

### 6. COUNT() is the Special MRF
Among all MRFs, **`COUNT()` is unique** because:
- It can work with **all data types** (numeric, text, date)
- It is the **only MRF that accepts `*` (asterisk)** as an argument
- `COUNT(*)` counts **all rows including NULLs**, while `COUNT(column)` ignores NULLs

```sql
-- COUNT(*) → counts all rows (including rows with NULLs)
SELECT COUNT(*) FROM emp;

-- COUNT(col) → counts only non-NULL values in that column
SELECT COUNT(comm) FROM emp;

-- COUNT with other data types
SELECT COUNT(ename) FROM emp;    -- text column
SELECT COUNT(hiredate) FROM emp; -- date column
```

---

## Quick Summary Table

| Rule | Details |
|---|---|
| **Arguments** | Only one column / expression per MRF |
| **Multiple MRFs** | Allowed in the same SELECT clause |
| **NULL handling** | NULLs are ignored in all MRFs |
| **WHERE clause** | MRF not allowed — use HAVING or subquery instead |
| **With normal columns** | Use GROUP BY to combine MRF with regular columns |
| **COUNT special case** | Only MRF that accepts `*`; works with all data types |

---

## Execution Order Reference

```
FROM → WHERE → GROUP BY → HAVING → SELECT → ORDER BY
```

> 📝 This is why MRF cannot be used in `WHERE` — the grouping hasn't happened yet at that stage. MRF results are available only from the `HAVING` and `SELECT` stage onward.