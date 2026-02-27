# NUMBER Data Type

- It is a type of data used to store **numeric values**.
- It can store **integer** as well as **decimal numbers**.
- The NUMBER data type can take **two arguments**.

The two arguments are:

1. **Precision**
   - It denotes the **total number of digits** that can be stored.
   - It includes digits on **both sides of the decimal point**.

2. **Scale**
   - It denotes the **number of digits after the decimal point**.
   - The scale value should always be **less than or equal to precision**.

---

## Syntax

NUMBER(precision, [scale])

*Note:*  
In SQL syntax, if any argument is written inside **square brackets**, it means that argument is **optional**.

---

## Examples

NUMBER(3)  
This allows a total of **3 digits**.  
Example values:
- 111
- 999

NUMBER(5)  
This allows a total of **5 digits**.  
Example values:
- 99999
- 12345

NUMBER(5, 2)  
- Total digits (precision) = 5  
- Digits after decimal (scale) = 2  
Example values:
- 999.99
- 123.45

NUMBER(2, 5)  
- Precision is less than scale  
- SQL adjusts the value automatically  
Example representation:
- 0.0099
- 0.00099

---

## Important Points of NUMBER Data Type

- Used to store **numeric data**
- Supports **positive and negative values**
- Can store **whole numbers and decimal numbers**
- Precision defines the **maximum digits**
- Scale defines the **decimal digits**
- If scale is not provided, the number is treated as an **integer**
- Commonly used for:
  - Salary
  - Marks
  - Age
  - Price
  - Quantity

---