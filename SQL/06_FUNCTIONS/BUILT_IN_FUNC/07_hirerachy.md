# Hirerachy Between the Column:

In the same table any two columns interconnected to each other is known as Hirerachy between column.

**For Ex:**

1. EMP(empno) --> MGR
2. STD(stdno) --> LID

Generally their are two types of hirerachy

1. Higher Hirerachy
2. Lower Hirerachy


for ex:

1. in the emp table HH is nothing but manager and LH is nothing but employees.

2. In the student table HH is nothing but leader and LL is student

---
## Q1. WAQTD the manager name of smith

```
select ename
from emp
where empno = (select mgr 
              from emp
              where ename = 'SMITH');

```

## Q2. WAQTD all the ename, the emp who are reporting to smith.

```
select ename
from emp
where mgr = (select empno
             from emp
             where ename = 'SMITH'
);
```

## Q3. WAQTD adams manager name

```
select ename
from emp
where empno in (select mgr
                from emp
                where ename = 'ADAMS'
);
```

## Q4. WAQTD adams manager manager name

```
select ename
from emp
where empno in (select mgr
                from emp
                where empno in (select mgr
                from emp
                where ename = 'ADAMS'));
```

## Q5. WAQTD all the ename, the emp who are reporting to smiths manager

```
select ename
from emp
where mgr in (
    select empno
    from emp
    where (select
    mgr
    from emp
    where ename = 'SMITH')
);

```