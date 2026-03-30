# Sub Query Functions

### What is QUERY?

The collection of all the sql keyword which are used to perform CURD operation on the database is known as QUERY.

### What is SUB QUERY?

The Query written inside a another query is known as sub query.


### Working of Sub Query:

1. Let's Consider two queries inner and outer query

2. Firstly the Inner query will be execute

3. After the execution of the inner query the output of inner query is given to the input of outer query , this output is a partial output.

4. After the inner query the outer query will execute and print the final result

5. The outer query is always depenedent on the output of inner query.

6. we can able to nest upto 255 inner queries.

### Why Sub Query:

We can write the sub query inside select, from, where, having clause

### Why sub query is used inside the where clause?

Whenever their is a unknown values are present inside the question to find those all unknown values we have to use the sub query inside the where clause.


#### CASE1:

The data to be selected and the condition to be executed both of these belong to the same table then this belongs to CASE1.


#### CASE2:

The data to be selected and the conditio to tbe executed both of these belong to the different table then this belongs to CASE2.

---

### Examples on sub queries.

1. WAQTD all the emp name, the emp whos salaries are more than allen

```
select ename
from emp
where sal > (select sal
    from emp
    where ename = 'ALLEN');

```

2. WAQTD all the ename, the emp who are working in HR department

```
select ename
from emp
where deptno in ( select deptno
    from dept
    where dname = 'HR');

```

--- 

## Types of Sub Query:

The sub queries are classifed into the two types,

1. Multi Row Sub Query

If the inner query returns multiple or more than one value as output these type of queries are known as Mutli Row Sub Query.


2. Single Row Sub Query

If the inner query returns only one value as output these type of quries are known as single row sub query

---

### Examples on types of sub query:

1. WAQTD the location of all the emp, the emp whos name start with k

```
select loc
from dept
where deptno in ( select deptno
    from emp
    where ename like 'k%');
```

### NOTE:

By Looking all the question it is difficult to identify weather given question is single row sub query or the multi row sub query so inorder to avoid the confusion we use either special operators(in, not in) or the sub query operator (all, any).

### ALL:

ALL is the sub query operator which handle multiple output from the inner query in case of making the relations.

The ALL operator will give the final result as true if all the values at RHS satisfied the condition.

ALL operator is similar to the AND operator.


### ANY:

ANY is the sub query operator which is also used to handle mutliple output from the inner query in case of making the relations

The ANY operator will give the final result as true if one of the value At RHS satisfied the condition.

ANY operator is similar to the OR operator.

---

1. WAQTD all the emp's deptname the emp whos salaries are more than 2000

```
select dname
from dept
where deptno in ( select deptno
    from emp
    where sal > 2000);
```
---

2. WAQTD all the details of emp the emp who's salaries are more than all the emp of deptno 20.

```
select *
from emp
where sal >All ( select sal
    from emp
    where deptno = 20)
```