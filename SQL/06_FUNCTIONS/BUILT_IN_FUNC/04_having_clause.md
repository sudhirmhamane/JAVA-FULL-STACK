# Having Clause

The having clause is used to filter the groups which are created by group by clause.

## Syntax:

```
select MRF/GE
from table_name
where [record filter condition]
group by columns
having [group fiter condition]

```

## Working Procedure:

1. From clause will execute first

2. After the from clause if we are using the where clause it will execute second else
the group by clause will execute

3. Ones the group clause executes records are converted into multiple groups

4. After the group clause the having clause will execute

5. The having clause execute group by group and filter the group with the help of filter conditions.

6. After the having clause the select clause will execute and finally it will display the result.

---

## QUESTION on having clause

### 1.  WAQTD the detno in which exactly two emp are working.

```
select deptno
from emp
group by deptno
having count(*) = 2;
```

### 2. WAQTD the job in which total salary which needed to pay is more than 9000.

```
select job
from emp
group by job
having sum(sal) > 9000;
```
### 3. WAQTD the deptno in which atleast two cleark are working.

```

select deptno
from emp
where job = 'CLERK'
group by deptno
having count(*) >= 2;

```

