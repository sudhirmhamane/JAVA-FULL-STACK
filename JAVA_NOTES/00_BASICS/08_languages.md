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

### 2. Low Level Language:

A language which is easily understandable to the machine is know as low level language

This language is very closer to the machines which give the control over memory, cpu and register.

It is harder to understand to humans but lll is faster and efficent.

Ex-> Binary Language

Low Level Language is also know as machine understandable language.

---

### 3. Mid Level Language:

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


### 1. Statically Typed Programming Language:

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

## 3. Classification of Language Based on their execution through multiple platform:

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

---

### 1. Platform Dependent Language:

An Application created at one specific platform which can only run the same specific platform is known as the platform dependent language.

This Application cannot run on multiple platform without recompailation or modification of base code.

**Ex-** C++, C

PDL is directly compiled into machine code.

the m/c code can be,

1. specific to cpu.
2. specific to operating system.

so the output from this language become tightly coupled with operating systema and hardware.

---

**Advantages:**

1.High Performance:

Runs directly on hardware due to which faster in execution.

2. Better Efficiency:

No need for the runtime environment like jvm and pvm

3. optimized for platform specific:

This lanaguage makes Full use of Operating System

4. Full Hardware Access:

It makes use of operating System feature as much as possible

---

**Disadvantages:**

1. Limited Portablity:

Cannot run on different platform

2. High Developement Cost:

For different Operating System we need to create different code bases.

3. Maintenance Complexity:

Due to multiple code bases maintenance(modification of existing feature, adding new features) is difficult.

4. Compatibility issues:

Different Operating System versions may break the application

---

### 2. Platform Independent Language:

An Application developed on one platform can run on multiple platforms without modificationa and recompilation is know as Platform Independent Language.

It Follows the Principle ** Write Ones Run Anywhere **(WORA).

One base code can run on any platform on which jvm or pvm is installed.

**NOTES**

1. The Basic Code created in java(any programming Lang), has to be passed through the compiler.

2. Compiler Converts it to the Byte Code
(.class) -> java
(.py) -> python

3. This byte Code is not m/c specific

4. Virtual m/c convert convert this byte code into m/c code at runtime.

5. So some program(byte Code) can run on multiple operating system

JVM specification changes from platform to platform that is why JVM is paltform Dependent.

---

**Advantages**

1. High Portability:

Single base code can run on on multiple platform

2. Reduced Development Efforts:

One code base works for all the platform

3. Faster Deployment:

No need to recompile for different operating system.

4. Easy Maintenance:

Only one base code to manage, changes become easy.

---

**Disadvantages:**

1. Dependency On Runtime:

Always requires a virtual Machine

2. Performance Overhead:

Slower in performance then paltform dependent language.

3. No control over hardware.

4. Steps of execution increases.

---

## 4. Classification of Programming Language Based on paradigm(process):

Their are mainly two types,

1.Imperative Programming Language
2.Declarative Programming Language

### 1. Imperative Programming Language:

Imperative programming languag focuses "HOW" to do something.

In this we define step by step instruction to solve the program(problem).

Here we control the execution flow(loops and conditions).

**Advantages:**

1. Easy to understand for begineers

2. Control over logic and performance.

3. Widely used in programming languages like java,c,c++

**Disadvantages:**

1. Code can become lengthy

2. Harger to maintain for complex problem.

3. More chances of bug due to mannual control.

**Example:** Sum of element in an array

```

class ArraySum{
    public static void main(String[] args){
        int[]arr = {10, 20, 30};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

o/p -> 50
```

### 2. Declarative Programming Language:

Declarative Programming Language focuses on what result we want not on how to achieve it.

This paradigm focuses on derised output not step by step process

In this system(compiler/interpreter) decides how to execute

**Adavantages:** 

1. Cleaner and consize code
2. Easier to maintain
3. Less bugs
4. better code redability

**Disadvantages:**

1.Slower in Execution
2.Less efficient
3.some time it would be difficult to debug internally

ex: python, react,html,sql,etc