# VARCHAR2 Data Type

It is the just updated version of varchar datatype.

- In this data types we can store upto 4000 characters.
- **Syntax** – VARCHAR2(size)

VARCHAR2 is a **variable-length character data type**, which means it occupies only the memory required to store the actual data.

Unlike CHAR data type, VARCHAR2 does **not waste memory** because it does not reserve unused space.

VARCHAR2 stores alphabets, numbers, and special characters such as:
- Capital letters (A–Z)
- Small letters (a–z)
- Numbers (0–9)
- Special characters (! @ # $ % ^ & *)

The size in VARCHAR2(size) specifies the **maximum number of characters** that can be stored.

If VARCHAR2(10) is defined and the value "sudhir" is stored, only **6 character spaces** are used and no extra memory blocks remain unused.

Key points of VARCHAR2 data type:
- Maximum storage capacity is **4000 characters**
- Uses **variable-length memory allocation**
- Memory is allocated based on actual data stored
- **No memory wastage**
- Efficient in terms of storage
- Mostly used in real-time database applications

Difference between CHAR and VARCHAR2:
- CHAR uses fixed-length memory allocation, while VARCHAR2 uses variable-length memory allocation
- CHAR causes memory wastage, whereas VARCHAR2 does not
- CHAR is faster for fixed-size data, while VARCHAR2 is better for variable-size data

VARCHAR2 is commonly used for storing:
- Names
- Addresses
- Emails
- Descriptions
- Text-based fields
