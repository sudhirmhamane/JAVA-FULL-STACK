# Identifier In java

An identifer in java are the name given by a programmer to various java members(components).

They are used for identification as well as to invoke(call) while execution.

## List of Identifiers:

1. class
2. method
3. variable
4. interface
5. enum
6. package
7. records
8. annotations


---

## Rules for the Identifers:

1. It cannot start with digits
2. Keywords are not used as Identifiers
3. Spaces between charactors are not allowed.
4. Only '$' and '_' these special charectors are allowed to use as identifiers.
5. Any Size of identifiers can be written.
6. We Can also use Unicode Charactors.

---

### Examples:

1. number -> correct
2. num_124 -> correct
3. number# -> correct
4. $ -> correct
5. _ -> wrong
6. __ -> correct

---

We cannot use just '_' underscore as an identifier because

1. An underscore is treated as replacement for space, and if we use them an idetifier become unnamed.
2. From java9 '_' is treated as Keyword.


'$' is allowed in naming and identifier because it represent inner class or interface.

**Inner Class:**

A class written inside a class is known as inner class.

**Syntax:**

``` OuterClass$InnerClass ```

**Example:**

```
LinkedList$Node (inner class)
Map$Entry (Inner Interface)
```

## Conventions:

Conventions are the industry standards which we need to follow to ensure consistency, compatibility and quality across product and servies.

Conventions are commonaly expected rules guidelines and practices followed by the industry.

Conventions are not strictly mandatory but they are widely followed because they make system and work standarlize and understandale.

### Convension for Classes:

If a class name single or multiple word, every word 1st characters is capital(upper case).

The way of defining class name is known as "PASCAL CASE".

**Examples:**

1. String
2. LinkedList
3. MyFirstProgram

**NOTE:**

The convesion for an interface(similar to class) is same as class convensions.

---

### Convesion for Variables:

If a variable name is an single word it must be written in LowerCase.

If it contains multiple words from 2nd word onwards every words first characters must be uppercase.

The way declaring variable name is known as "CamelCase".

**Examples:**

1. panCard
2. yearOfPassOut
3. accountHolderName
4. charAt()

---

### Convension for a method:

Convesion for a method is same as the variable convensions

**Examples:**

1. toString()
2. hashCode();
3. nextInt();
4. next();
5. getClass();

---


### Final:

Final in java is a keyword which is used to make constant.

If a variable is declared with final it cannot be reinitialized(cannot change).

**Examples:**

1. PI
2. MAX_VALUE
3. MIN_VALUE

---