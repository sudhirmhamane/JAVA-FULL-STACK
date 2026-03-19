# Built-in Functions (BIF) in SQL

## Classification of Built-in Functions

In SQL, based on the **parameters**, **result**, or **working procedure**, Built-in Functions are classified into two types:

```
Built-in Functions (BIF)
├── Single Row Functions (SRF)
└── Multi Row Functions (MRF)
```

---

## 1. Single Row Functions (SRF)

- Takes **n number of inputs** and returns **n number of outputs** (one output per row).
- Executes **row by row** — processes each row independently.
- **No aggregation** is involved.
- The number of input rows always equals the number of output rows.

```
Input  →  [Row 1]  [Row 2]  [Row 3]  ...  [Row N]
               ↓        ↓        ↓              ↓
Output →  [Out 1]  [Out 2]  [Out 3]  ...  [Out N]
```

**Rule:** `No. of Input Rows = No. of Output Rows`

**Examples:**

| Function | Description |
|---|---|
| `LENGTH()` | Returns the number of characters in a string |
| `UPPER()` | Converts string to uppercase |
| `LOWER()` | Converts string to lowercase |
| `SUBSTR()` | Extracts a substring from a string |
| `INSTR()` | Returns the position of a substring within a string |
| `ROUND()` | Rounds a number to specified decimal places |
| `TRUNC()` | Truncates a number to specified decimal places |
| `MOD()` | Returns the remainder of a division |

**Example Query:**
```sql
-- LENGTH() works row by row, returns one result per employee
SELECT ename, LENGTH(ename) AS name_length
FROM emp;
```

---

## 2. Multi Row Functions (MRF)

- Takes **n number of inputs**, collects them, processes them together, and returns a **single output**.
- Executes **group by group** — processes a set of rows and returns one result per group.
- Also known as **Aggregate Functions** or **Group Functions**.
- No matter how many rows are given as input, the output is always a single value (per group).

```
Input  →  [Row 1]  [Row 2]  [Row 3]  ...  [Row N]
                    ↘       ↓       ↙
                      [ Aggregation ]
                            ↓
Output →              [Single Result]
```

**Rule:** `No. of Input Rows = Single Output`

**Examples:**

| Function | Description |
|---|---|
| `MIN()` | Returns the minimum value in a group |
| `MAX()` | Returns the maximum value in a group |
| `SUM()` | Returns the total sum of values in a group |
| `COUNT()` | Returns the number of rows in a group |
| `AVG()` | Returns the average value of a group |

**Example Query:**
```sql
-- SUM() collects all salaries and returns one total
SELECT SUM(sal) AS total_salary
FROM emp;
```

---

## SRF vs MRF — Comparison Table

| Feature | Single Row Function (SRF) | Multi Row Function (MRF) |
|---|---|---|
| **Input** | N rows | N rows |
| **Output** | N results (one per row) | Single result (per group) |
| **Execution** | Row by row | Group by group |
| **Aggregation** | No | Yes |
| **Also known as** | Scalar Functions | Aggregate / Group Functions |
| **Used with GROUP BY** | Not required | Often used with `GROUP BY` |
| **Examples** | `LENGTH()`, `UPPER()`, `SUBSTR()`, `ROUND()` | `MIN()`, `MAX()`, `SUM()`, `COUNT()`, `AVG()` |

---

## Important Note

> ⚠️ You **cannot mix SRF and MRF** directly in the same `SELECT` statement without using `GROUP BY`.
> MRF collapses all rows into one result, while SRF expects to return one result per row — mixing them causes an error.

```sql
-- ❌ Wrong — mixing SRF and MRF without GROUP BY
SELECT ename, SUM(sal)
FROM emp;

-- ✅ Correct — use GROUP BY when combining
SELECT deptno, SUM(sal) AS total_salary
FROM emp
GROUP BY deptno;
```