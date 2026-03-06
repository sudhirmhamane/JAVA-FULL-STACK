# Regular Expression Operator in SQL

Regular Expression is an **advanced pattern matching technique** used to search data based on complex patterns.

It is an **updated and more powerful version of the `LIKE` operator**.

While the `LIKE` operator uses only two pattern symbols:

- `%` → represents **multiple characters**
- `_` → represents **a single character**

Regular Expressions provide **many more special symbols** to build complex patterns.

---

# Why Regular Expression is Used

Regular expressions are used when:

- We need **advanced pattern matching**
- We need **flexible text searching**
- `LIKE` operator is **not powerful enough**

Example use cases:

- Finding names starting with a specific letter
- Finding names ending with a specific letter
- Validating patterns
- Matching complex strings

---

# Syntax

```sql
WHERE REGEXP_LIKE(column_name / expression, 'pattern', '[i]');
```

### Explanation

| Component | Description |
|----------|-------------|
| `REGEXP_LIKE` | Function used to perform pattern matching |
| `column_name` | Column on which pattern matching is applied |
| `'pattern'` | Regular expression pattern |
| `'i'` | Optional parameter used for **case-insensitive search** |

---

# Special Characters Used in Regular Expressions

## 1. `^` (Start With)

This symbol is used to **match the beginning of a string**.

### Example

Find employees whose names **start with 'A'**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^A');
```

Example Matches

```
ADAMS
ALLEN
```

---

## 2. `$` (End With)

This symbol is used to **match the ending of a string**.

### Example

Find employees whose names **end with 'N'**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, 'N$');
```

Example Matches

```
ALLEN
MARTIN
```

---

## 3. `.` (Single Character)

The `.` represents **exactly one character**.

### Example

Find names having **A as first letter and any one character after it**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^A.');
```

Matches

```
ADAMS
ALLEN
```

---

## 4. `.*` (Multiple Characters)

`.*` represents **zero or more characters**.

### Example

Find names **starting with A and followed by any characters**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^A.*');
```

Matches

```
ADAMS
ALLEN
```

---

## 5. `[]` (Character Set)

Used to match **any one character inside the brackets**.

### Example

Find names starting with **A or B**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^[AB]');
```

Matches

```
ADAMS
ALLEN
BLAKE
```

---

## 6. `-` (Range)

Used to represent a **range of characters**.

### Example

Find names starting from **A to D**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^[A-D]');
```

Matches

```
ADAMS
BLAKE
CLARK
```

---

## 7. `i` (Case Insensitive Search)

The `'i'` flag makes the search **case-insensitive**.

### Example

Find names starting with **A or a**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^a', 'i');
```

Matches

```
ADAMS
ALLEN
```

Even if stored as:

```
adams
Allen
```

---

# Example Queries

## Example 1

Find employees whose names **start with A**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^A');
```

---

## Example 2

Find employees whose names **end with N**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, 'N$');
```

---

## Example 3

Find employees whose names **start between A and C**

```sql
SELECT *
FROM emp
WHERE REGEXP_LIKE(ename, '^[A-C]');
```

---

# Difference Between LIKE and REGEXP

| Feature | LIKE | REGEXP |
|------|------|------|
| Pattern Matching | Basic | Advanced |
| Symbols | `%`, `_` | Many special symbols |
| Flexibility | Limited | Highly flexible |
| Complexity | Simple | Powerful |

---

# Summary

- Regular Expressions are used for **advanced pattern matching**
- It is more powerful than the **LIKE operator**
- Uses special characters such as:

```
^  -> Start with
$  -> End with
.  -> Single character
.* -> Multiple characters
[] -> Character set
-  -> Range
i  -> Case insensitive search
```

Regular expressions help perform **complex searching operations in SQL queries**.

---