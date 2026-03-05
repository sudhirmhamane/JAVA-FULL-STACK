# LIKE and NOT LIKE

This type of operator are used to perform the pattern matching operation.

- **SYNTAX**:

WHERE col/exp LIKE/NOT LIKE 'PATTERN';

---

## Pattern Formation :

In the like operator to create pattern the two special charactors are used.

1. '%' (precentage)
2. '_' (underscore)

---

1. '%':

- It will allow any type of charactors.
- It will also allow any number of charactors.-
- It also allow '%' and '_'.

---

2. '_'

- It will allow any type of charactors.
- But it will allow only one number/digit of charactor.
- It aslo allow % and _.

---

### Note: 
Like and not like are uninary operators.

---

### questions on like and not like special operators:

1. WAQTD all the details of emp, the emp whos name start with A.

Answer:

select *
from emp
where ename like 'A%';

---

2. WAQTD all the details of emp, the emp who's name ends with R.

Answer:

select * 
from emp
where ename like '%R';

---

3. WAQTD all the details of emp, the emp who's name having A charactor.

Answer:

select *
from emp
where ename like '%A%';

---

4. WAQTD all the details of emp the emp who's name start with M and having 3rd char R and ends with N

Answer:

select *
from emp
where ename 'M_R%N';

---

5. WAQTD all the details of emp, except the emp whos name start with A

Answer:

select *
from emp
where ename not like 'A%';

---