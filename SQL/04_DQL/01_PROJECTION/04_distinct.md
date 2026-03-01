# Distinct 

Distinct is a keyword which is used to remove the repeated or duplicate records from result table.

## Use cases while using the distinct keyword

1. While using the distinct should be the first argument for the select cluse.

2. We can use only onecs distinct keyword in the select clause.

3. We can also use the distinct keyword for *

4. The distinct keyword will not remove repeated values it will remove repeated records.

---

### Questions

1. WAQTD all the jobs from emp table but their should not be any repeated records in the result.

Answer:

SELECT Distinct job
FROM emp;

---

### Note1->

The Distinct keyword if applied for in the same select clause the result of query will be not in form of table format hence, it is not aplicable to use multiple distinct keyword in select clause.

---

### Note2->

We can use distinct keyword for the astrick(*).

1. If the table consists of primary key we don't need to use distinct.

2. If the table not having any primary key we can use distinct with astrick.