# Functions in SQL

## What is a Function?

A **function** is a set of instructions used to perform a specific or special type of task. Functions take some input, process it, and return an output.

---

## Three Major Components of a Function

| Component | Description |
|---|---|
| **1. Input** | The value(s) passed into the function (also called arguments or parameters) |
| **2. Execution Process** | The logic/operations performed on the input |
| **3. Output** | The result returned after processing |

---

## Types of Functions

Functions in SQL are broadly classified into two types:

```
Functions
├── User Defined Functions (UDF)
└── Built-in Functions (BIF)
```

---

## 1. User Defined Functions (UDF)

- Functions that are **created by the user** based on their specific requirements.
- Also known as **Dynamic Functions** because they can be changed as needed.
- Can be **easily modified** by the user who created them.
- Access is **limited** — only the creator and those who know the function's working procedure can use it.

**Examples:**
```sql
f(x), f(y)
```

---

## 2. Built-in Functions (BIF)

- Functions that are **predefined in the compiler/database system**.
- Also known as **Static Functions** or **In-built Functions**.
- **Cannot be modified** (or are very difficult to modify) since they are part of the system.
- **All users** can access and use them freely.

**Examples:**
```sql
MIN()     -- Returns the minimum value
MAX()     -- Returns the maximum value
SUM()     -- Returns the total sum
COUNT()   -- Returns the number of rows
AVG()     -- Returns the average value
UPPER()   -- Converts text to uppercase
LOWER()   -- Converts text to lowercase
LENGTH()  -- Returns the length of a string
```

---

## UDF vs BIF — Comparison Table

| Feature | User Defined Function (UDF) | Built-in Function (BIF) |
|---|---|---|
| **Created by** | User | Database system / Compiler |
| **Also known as** | Dynamic Function | Static / In-built Function |
| **Modifiable** | Yes, easily | No, or very difficult |
| **Accessibility** | Limited (creator + authorized users) | All users |
| **Examples** | `f(x)`, `f(y)` | `MIN()`, `MAX()`, `SUM()`, `COUNT()`, `AVG()` |

---

## Further Classification of Built-in Functions

BIF in SQL are further divided into two major categories:

```
Built-in Functions (BIF)
├── Single Row Functions   → Operates on one row at a time, returns one result per row
└── Group Functions        → Operates on a group of rows, returns one result per group
```

> 📝 This classification is important as you go deeper into SQL — Single Row Functions and Group Functions behave very differently in queries.