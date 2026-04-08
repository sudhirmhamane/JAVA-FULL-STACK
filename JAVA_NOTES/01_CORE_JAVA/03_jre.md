# JRE

JRE stands for Java Runtime Environment.

It provide an environment to run the java program.

JRE consits of Built in Libraries and JVM(java virtual machine)

---

## Built In Libraries:

A Built in library in JRE is the large collection of pre written, reuseable classes and interfaces that provides us the core functionality required to all java program.

A Built in librarires are also called as "Java API's" and Java Class Library(JCL).

This packages are present inside jre's lib folder and can be used by the programmer by using the import statement.

Their are several built in libraries in JRE such as:

### 1. java.lang:

This package contains the core language classes and interfaces, automatically imported in every java program

It is a default package in java

This package contains classes and defines basic data types such as:

1. Byte
2. Integer
3. Long, etc

It also contains object behaviour, mathematical operation, thereads, etc

**List of Classes and Interfaces:**

1. String
2. System
3. Thread
4. Object
5. Math, etc

### 2. java.sql:

Java.sql is a part of JRE standard library that provides an interfaces and classes for accessing and processing data stored inside the database by using the java databse conectivity(JDBC).

It acts as the Bridge between the the java program and RDBMS like(Mysql, oracle, postgreSql).

**List of Classes and Interfaces:**

1. DriverManager
2. Statement(Static query)
3. PreparedStatement(Dynamic Query)
4. CallableStatement
5. ResultState
6. Connection

---

### 3. java.util:

java.util package provides the utility classes and data structures such as, 
collection framework, date and time apis, misslleneous, etc.

**Classes and Interfaces:**

1. LinkedList
2. Stack
3. TreeSet
4. Deque
5. Queue, etc

---

### 4. java.io:

This packages among all which provides the classes and interfaces for the system input and output operations through files and serialization, etc.

The main purpose of this package is to handle:

1. File Conversion
2. Serialization
3. De serialization
4. File handling, etc

**Classes and Interfaces:**

1. File
2. FileReader
3. FileWriter
4. BufferInputStream
5. BufferOutputStream


**NOTES:**

1. The Process of converting Object into the byteStream is known as the Serialization

2. The Process of converting ByteStream to Object is known as De Serialization.

---