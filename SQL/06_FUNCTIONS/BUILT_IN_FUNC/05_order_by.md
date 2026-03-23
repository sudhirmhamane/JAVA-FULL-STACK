# Order By Clause:

This clause is used to arrange the final result either in the asending order or desending order.

## SYNTAX:

```
select col/exp/*
from table_name
where [record filteration condition]
group by columns
having [group filteration condition]
order by coulumns asc/dec;

```

## Working flow

```
FROM -> [WHERE] --> [GROUP BY] ---> [HAVING] ----> SELECT ------> ORDER BY

```

### Key NOTES

1. ORDER BY is the only clause which will execute after the select clause.

2. The alias name form the select caluse we can easily able to access in the order by clause.

---