# CHAR Data Type

The CHAR data type is used to store character-based data. It is a fixed-length data type, which means it always occupies the same amount of memory regardless of the actual data stored.

The CHAR data type can store different types of characters such as alphabets, numbers, and special characters.

Alphabets include:
- Capital letters: A–Z
- Small letters: a–z

Numbers include:
- 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

Special characters include:
- ! @ # $ % ^ & *

Syntax of CHAR data type:
CHAR(size)

Here, size denotes the number of characters that can be stored.

Example:
CHAR(10)

When we define CHAR(10), the main memory allocates a fixed block of 10 character spaces.

If we store the value "sudhir" in CHAR(10), the memory will be allocated as:

| s | u | d | h | i | r |   |   |   |   |

Only 6 characters are used, and the remaining 4 blocks stay empty. These empty blocks cause memory wastage.

Important points about CHAR data type:
- Maximum size allowed is 2000 characters
- Uses fixed-length memory allocation
- Memory size remains constant for every record
- Causes memory wastage if the stored value is smaller than the defined size
- Initial and final memory blocks remain fixed
