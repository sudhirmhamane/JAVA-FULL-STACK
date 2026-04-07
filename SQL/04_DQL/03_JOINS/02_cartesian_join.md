# Cartesian Joins :

It is the process of fetching the data from all the multiple tables based on the crossing principle.

## Crossing Principle:

The process of merging each and every records of one table to each and every records of all the remaining table is known as Crossing Principle.

---

### Q1. WAQTD all the husband names and their wife names.

**Syntax for cartesian Join:**

1. ORACLE SYNTAX:

```
select col/exp/*
from Table1, Table2,...,TableN
where [filter condition]
```

2. ANSI SYNTAX:

```
select col/exp/*
from Table1 CROSS JOIN Table2 CROSS JOIN ... TableN
[ON Join condition]
[Where filter condition]
```