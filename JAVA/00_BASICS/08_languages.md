# Classifiction on Languges:

Languages are classified in different categories

## 1. Based on understanding their are three types of languages:

1. High Level Language
2. Mid Level Language
3. Low Level Language


---

### 1. High Level Language:

A language which is easily understandable, readable and instructable for humans
is know as High Level Language.

High Level Languages are introduced because before HLL programmers uses machine language 
and assembly language which is very difficult to write, error prone, time consuming and was not portable.

HLL uses english like sytax and abstraction which makes it easy to understand.

All programming languages are the examples of HLL.

### Disadvantages of HLL:

Slower than the LLL.

It requires compiler and interpreter.

Less control over hardware

---

### 2 Low Level Language:

A language which is easily understandable to the machine is know as low level language

This language is very closer to the machines which give the control over memory, cpu and register.

It is harder to understand to humans but lll is faster and efficent.

Ex-> Binary Language

Low Level Language is also know as machine understandable language.

---

### 3 Mid Level Language:

A lang which is neither understandable to machine nor humans or programmer is known as Mid level Language.

It is basically low level lang. that uses mneumonics (short readble instruction) to represent m/c level operation.

This language instruct directly with the hardware i.e cpu, register and memory.

### Advantages:

Fast in execution

full access over hardware

efficient memory uses.

---

## 2. Based on the Typing Discipline:

Programming language can be classified based on typing discipline

there are mainly two types,

1. Statically Typed PL
2. Dyanamically Typed PL


### 1 Statically Typed Programming Language:

A Staticallu Typed language is one where variable types are known and checked at compile time i.e before execution.

Ex-> Java, C, C++

We Must define the type of the variable(container) before using it.
EX -> int x = 10; -> correct, x = 20 -> will give error.

At Compile Time,

a. Compiler reservers memory for the variable
b. type compatibility
c. valid operations
d. method signatures

At the time of execution, since the type are already checked, so no need to check the type again, because of which execution becomes faster.

### Advantages:

1. Easy error detection:
Error caught at compile time, reduces runtime crashes.

2. Better Performance:
No runtime type checking so execution becomes more faster.

3. Strong Type Safety:
Prevents invalid operation and avoids unexpected behaviours(changes).

4. Maintainablity:
Easier to manage larger code base and improves code readability(simple and clean).

### Disadvantages:

1. Less Flexibility:
cannot change variable type easily

2. Requires compilation:
We cannot run directly without compailation due to type checking

```

class Demo{
    public static void main(String[] args){
        int a = 10 // valid
        system.out.println(a);
        a = 123.23; // compile time error
        a = "Hello" // compile time error
    }
}

```

### 2. Dyamically Type Programming Language:

Dynamically typed lang. is one where variable types are determined and checked at runtime(execution time).

Ex-> JS, Python, Ruby, PHP etc

We don't needed to declare the type explicitly.

We don't needed to define types like int float, etc

Type is automatically assigned at runtime
Ex-> x = 10

We can change the type of variable dynamically at run time
Ex-> x = 10 -> integer, x = 'hello' -> string

Memory Allocation happens based on the value assigned.

It doen't needs separate compilation step.

This functionality used heavly in scripting and rapid development.

### Advantages:

1. Faster Developement:
NO type declaration required so less code to write.

2. High flexbility:
Variables can changes their type at anytime.

3. Easy to learn:
Simple syntax and beginer friendly.

### Disadvantages:

1. Less type safety:

2. Slower In Performance:
Type checking happens at runtime 

3. Runtime errors:
Errors occured at runtime or during execution harder to debug.

---

## Classification of Language Based on their execution through multiple platform:

Their are mainly two types,

1. Platform Indepenedent application language
2. platform Dependent application language

### Platform:

A Platform in programming refers to the environment where program runs(executes).

It includes both hardware and software that supports the execution of program.

It provides the environment for developing and running an application.

**Hardware**: A physical part of m/c that we can see an touch

ex-> keyboard, monitor, cpu, ram, mouse, etc.

**Software**: Software is collection of program, instruction and data that tells the m/c what to do.

basically software controls the hardware and makes it useful.

Ex-> Operating system, Drivers, Chrome, Microsoft Office tools, etc