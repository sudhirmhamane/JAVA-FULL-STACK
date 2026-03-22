# Group By Clause:

Group By Clause is used to convert the records from the tables into multiple groups.

## Syntax:

```
Select MRF/GP
from Table_name
where [record filteration method] optional in group by clause
group by Columns;

```

---

## Working of Group By Clause:

1. From clause will start the execuation

2. After the from clause if we are using the where clause it will execute second else the group by clause will execute.

3. The Group by clause will execute row by row.

4. After the execution of group by clause the the records inside the tables are converted into multiple groups.

5. After the execution of group by clause the whatever the clause are executed all will execute in group by group.

6. We can also use multiple columns in the group by clause which will create a sub categories of a main group.

7. The column which we are using in the group by clause same column can also used in the select clause which is known as group expression.

---

## 1. WAQTD the number of emp who are working in each and every department which are present in emp table.

```
select count(*), deptno
from emp
group by deptno;

```

## 2. WAQTD total number of emp, who are working in each and every job

```
select count(*), job
from emp
group by job;
```