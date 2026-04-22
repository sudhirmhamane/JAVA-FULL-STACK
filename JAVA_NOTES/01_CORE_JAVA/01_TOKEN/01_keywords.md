# Keywords:

Keyword are the words which have pre define meaning and purpose in programming language and they are easily recognized by the java compiler and cannot be used as identifiers.

We have 52+ Keywords in Java and Exact 67 keywords till JDK 26.

Keywords are always written in Lower Case.

Compiler uses them to understand struture of java program and we cannot alter them.

Each keyword has a specific role in the java syntax.

---

## Keywords in Java:

> Java currently has **67 keywords** (including reserved words and context-sensitive keywords introduced through JDK 26).  
> Keywords marked with a version were introduced or became official in that JDK.

---

## Reserved Keywords (Cannot be used as identifiers)

| Keyword | Category | Description |
|---------|----------|-------------|
| `abstract` | Class/Method | Declares an abstract class or method |
| `assert` | Control Flow | Used for debugging assertions (JDK 1.4+) |
| `boolean` | Data Type | Primitive boolean type (`true`/`false`) |
| `break` | Control Flow | Exits a loop or switch statement |
| `byte` | Data Type | 8-bit integer primitive |
| `case` | Control Flow | Defines a case in a switch statement |
| `catch` | Exception | Catches exceptions in a try-catch block |
| `char` | Data Type | 16-bit Unicode character primitive |
| `class` | OOP | Declares a class |
| `const` | Reserved | Reserved but **not used** in Java |
| `continue` | Control Flow | Skips to the next iteration of a loop |
| `default` | Control Flow | Default case in switch; default method in interface |
| `do` | Control Flow | Starts a do-while loop |
| `double` | Data Type | 64-bit floating-point primitive |
| `else` | Control Flow | Alternative branch in an if statement |
| `enum` | OOP | Declares an enumerated type (JDK 5+) |
| `extends` | OOP | Indicates class inheritance |
| `final` | Modifier | Prevents modification of class, method, or variable |
| `finally` | Exception | Block that always executes after try-catch |
| `float` | Data Type | 32-bit floating-point primitive |
| `for` | Control Flow | Declares a for loop |
| `goto` | Reserved | Reserved but **not used** in Java |
| `if` | Control Flow | Conditional statement |
| `implements` | OOP | Indicates interface implementation |
| `import` | Package | Imports a class or package |
| `instanceof` | Operator | Tests object type; also used in pattern matching (JDK 16+) |
| `int` | Data Type | 32-bit integer primitive |
| `interface` | OOP | Declares an interface |
| `long` | Data Type | 64-bit integer primitive |
| `native` | Modifier | Indicates a method implemented in native code |
| `new` | Object | Creates a new object instance |
| `package` | Package | Declares a package |
| `private` | Access | Restricts access to the declaring class |
| `protected` | Access | Restricts access to the package and subclasses |
| `public` | Access | Allows access from anywhere |
| `return` | Control Flow | Returns a value from a method |
| `short` | Data Type | 16-bit integer primitive |
| `static` | Modifier | Declares a class-level member |
| `strictfp` | Modifier | Enforces strict floating-point calculations (deprecated JDK 17) |
| `super` | OOP | Refers to the parent class |
| `switch` | Control Flow | Multi-branch selection statement |
| `synchronized` | Concurrency | Prevents concurrent access in multithreading |
| `this` | OOP | Refers to the current object instance |
| `throw` | Exception | Throws an exception |
| `throws` | Exception | Declares exceptions a method may throw |
| `transient` | Modifier | Marks a field to be excluded from serialization |
| `try` | Exception | Starts a try-catch exception block |
| `void` | Return Type | Indicates a method returns no value |
| `volatile` | Concurrency | Ensures visibility of variable changes across threads |
| `while` | Control Flow | Declares a while loop |

---

## Context-Sensitive / Restricted Identifiers

These are **not reserved words** but have special meaning in specific contexts (JDK 9–26):

| Keyword | Introduced | Context | Description |
|---------|------------|---------|-------------|
| `var` | JDK 10 | Local variable | Local variable type inference |
| `record` | JDK 16 | Class declaration | Declares an immutable data record |
| `sealed` | JDK 17 | Class/Interface | Restricts which classes can extend/implement |
| `permits` | JDK 17 | Class declaration | Lists allowed subclasses of a sealed class |
| `non-sealed` | JDK 17 | Class declaration | Reopens a sealed hierarchy |
| `yield` | JDK 14 | Switch expression | Returns a value from a switch expression block |
| `module` | JDK 9 | Module declaration | Declares a module |
| `open` | JDK 9 | Module declaration | Declares an open module |
| `opens` | JDK 9 | Module declaration | Opens a package in a module |
| `requires` | JDK 9 | Module declaration | Declares a module dependency |
| `exports` | JDK 9 | Module declaration | Exports a module package |
| `uses` | JDK 9 | Module declaration | Specifies a service interface the module uses |
| `provides` | JDK 9 | Module declaration | Specifies a service implementation |
| `with` | JDK 9 | Module declaration | Used with `provides` to name implementation |
| `transitive` | JDK 9 | Module declaration | Makes a required module accessible to dependents |
| `when` | JDK 21 | Pattern matching | Guard clause in pattern matching switch (JDK 21+) |

---

## Literal Keywords (Special Values)

| Keyword | Description |
|---------|-------------|
| `true` | Boolean literal true |
| `false` | Boolean literal false |
| `null` | Null reference literal |

---

## Underscore `_`

| Symbol | Introduced | Description |
|--------|------------|-------------|
| `_` | JDK 22 | Unnamed variable/pattern (blank identifier); single `_` is now a keyword-level reserved token |

---

## Summary by JDK Version

| JDK Version | Keywords/Features Added |
|-------------|------------------------|
| JDK 1.0 | All original 48 reserved keywords |
| JDK 1.4 | `assert` |
| JDK 5 | `enum` |
| JDK 9 | `module`, `open`, `opens`, `requires`, `exports`, `uses`, `provides`, `with`, `transitive` |
| JDK 10 | `var` |
| JDK 14 | `yield` (switch expressions) |
| JDK 16 | `record`; `instanceof` pattern matching finalized |
| JDK 17 | `sealed`, `permits`, `non-sealed` |
| JDK 21 | `when` (pattern matching guards) |
| JDK 22 | `_` (unnamed variables — reserved token) |
| JDK 26 | Unnamed classes & instance main methods finalized (no new keywords) |

---

> **Note:** `const` and `goto` are reserved by the Java specification but have no functionality — they exist to prevent their use as identifiers and to provide better error messages for C/C++ programmers.
---

```
public strictfp final class Example {
    public final synchronized static void main(String[] args){
        final boolean a = false;

        try{
            int a = 1;
            do{
                System.out.println(a++);
                if(a == 1) continue;
            } while(a <= 3);
        }
        catch(Exception e){
            System.out.pritln("catch block");

        } finally{
            System.out.println("Finally block");
        }
        return ;
    }
}

```

---

## Classification of Java Keywords:

Java Keywords can be grouped in four major categories,

1. Standard Keywords
2. Contectual Keywords
3. Reserved Keywords
4. Deprecated Keywords


---

## 1. Standard Keyword:

Standard keyword are the core reserved words that are always treated as keyword by the java compiler in every context.

They can't be used as an identifier anywhere in java program

Their are 54 Standard Keyword in java.

## 2. Contectual Keywords:

Contectual Keywords in java are not reserved globally they acts like keyword only in specific context which means that we can use them as an identifier in other context.

**EX:** ``` yield, var, record, sealed, module, open, etc ```

**Code Example:**

```
class Example{
    public static void main(String[] agrs){
        int yield = 124;
        System.out.println(yield);

        int var = 123;

        var var = "Hello"
    }
}
```

## 3. Deprecated Keywords:

It means a feature(class, method, variable, or a kewords) is no longer recommented to use, because it is outdated, unsafe or has better alternative.

Ex-> ```const, go to```

1. go to:

go to is reserved from java 1. It is never implemented because of unstrucural (unconditional) jumps.

Unstructural jumps makes the code harder to debug and read.

We have an alternative of it,
```
return,
break,
continue,
for,
while, etc.
```

2. const:

const is also reserved in java but never implemented because java already had an alternative keyword of it,

``` final ```

final in java can be used with class, variabe, and method.

Code Example:

```
final class Ramesh{
    final void m1(){
        sout("hello from m1);
    }

    class Suresh extends Ramesh{
        void m1(){
            sout("change by child for m1());
        }
    }
    
    class DriverExample{
        public static void main(String[] args){
            final int a = 123;
            a = 12343 // CTE
            Suresh obj = new Suresh();

            obj.m2();
            obj.m1();
        }
    }
}
```

## 4. Reserved Keywords:

In java we have reserved literals that cannot be used as identifiers

Their are 3 reserved literal,

1. true
2. false
3. null

true and false are logical value which is used by boolean datatype

null is used to represent default value for non-primitive datatypes.

Code Example:

```
import java.util.Queue;
class Demo{
    static String str;
    static Queue q;

    public static void main(String[] args){
        boolean a = false;
        boolean b = true;
        sout(a); // false
        sout(b); // true
        sout(str); // null
        sout(q) // null
    }
}
```