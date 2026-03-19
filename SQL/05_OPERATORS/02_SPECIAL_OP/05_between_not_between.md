# BETWEEN and NOT BETWEEN Operator in SQL

## Overview

`BETWEEN` and `NOT BETWEEN` are special range operators in SQL used to filter data within a specific range. They work with **numbers**, **dates**, and **text (alphabetical range)** and make queries cleaner and more readable compared to using `>=` and `<=` together.

> 💡 `BETWEEN` is **inclusive** — it includes both the lower and upper boundary values in the result.

---

## Syntax

```sql
SELECT column_name(s)
FROM table_name
WHERE column_name / expression BETWEEN lower_range AND upper_range;
```

```sql
SELECT column_name(s)
FROM table_name
WHERE column_name / expression NOT BETWEEN lower_range AND upper_range;
```

---

## Key Points

- `BETWEEN lower AND upper` is equivalent to `>= lower AND <= upper`
- `NOT BETWEEN lower AND upper` is equivalent to `< lower OR > upper`
- Both boundary values are **inclusive** in `BETWEEN`
- Works with **numeric**, **date**, and **character/string** data types
- The lower range value should always be less than or equal to the upper range value; otherwise, the query returns no rows

---

## Equivalent Comparisons

| Operator | Equivalent Expression |
|---|---|
| `BETWEEN 1500 AND 3000` | `>= 1500 AND <= 3000` |
| `NOT BETWEEN 1500 AND 3000` | `< 1500 OR > 3000` |

---

## Practice Questions

### 1. Fetch all employee details whose salary is between 1500 and 3000

```sql
SELECT *
FROM emp
WHERE sal BETWEEN 1500 AND 3000;
```

**Equivalent query:**
```sql
SELECT *
FROM emp
WHERE sal >= 1500 AND sal <= 3000;
```

---

### 2. Fetch all employee details who were hired between 1981 and 1985

```sql
SELECT *
FROM emp
WHERE hiredate BETWEEN '01-JAN-81' AND '31-DEC-85';
```

> ⚠️ **Note:** Do not use extra parentheses around the range values with `BETWEEN`. The correct syntax is `BETWEEN value1 AND value2`, not `BETWEEN (value1 AND value2)`.

---

### 3. Fetch all employee details whose salary is NOT between 1500 and 3000

```sql
SELECT *
FROM emp
WHERE sal NOT BETWEEN 1500 AND 3000;
```

This returns employees earning **less than 1500** or **more than 3000**.

---

### 4. Fetch employee names and salaries for employees in department 10 or 20 with salary between 2000 and 5000

```sql
SELECT ename, sal, deptno
FROM emp
WHERE deptno IN (10, 20)
  AND sal BETWEEN 2000 AND 5000;
```

---

### 5. Fetch all employees whose name falls alphabetically between 'A' and 'M'

```sql
SELECT *
FROM emp
WHERE ename BETWEEN 'A' AND 'M';
```

> 📝 `BETWEEN` also works with strings — it compares values in **alphabetical (lexicographic)** order.

---

## Common Mistakes to Avoid

| Mistake | Wrong | Correct |
|---|---|---|
| Extra parentheses | `BETWEEN ('01-JAN-81' AND '31-DEC-85')` | `BETWEEN '01-JAN-81' AND '31-DEC-85'` |
| Reversed range | `BETWEEN 3000 AND 1500` | `BETWEEN 1500 AND 3000` |
| Forgetting it's inclusive | Expecting boundary values to be excluded | Both endpoints are included in results |

---

## Quick Reference

```
BETWEEN   → includes both boundary values (>=  and <=)
NOT BETWEEN → excludes the entire range (<  or >)
Works on  → Numbers, Dates, Strings
```