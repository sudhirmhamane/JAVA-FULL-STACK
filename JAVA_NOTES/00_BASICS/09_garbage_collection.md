# Dyanamic Memory Management:(Garbage Collection)

It is one of the most important feature of Java.

It deals with the allocation and deallocation of memory during runtime without program intervation

This Process is handle by the Java Virtual Machine in which it uses a mechanisms known as garbage collector.

**Object:** An Object is block of memory which is created at the runtime and stored in the heap area.

**Garbage:** Garbage is nothing but an object which is no longer used in the program or it has no reference(unreachable) is known as garbage.


**Example:**

```
class Student {
    Student obj1 = new Student(); //Ramesh
    obj1.name; // Ramesh

    obj1 = new Student() //Suresh
    obj1.name; //Suresh

    // Ramesh obj is eligible for the gagbage collection.
}
```

---

## Garbage Collection/Collector:

Garbage Collection is the process of automatically removing unused object from heap memory to free space in java, GC is handled by jvm(not by the programmer).

### Why do we need of Garbage Collector?

1. Without GC memory keeps filling up program may crash with "OutOfMemoryError".

2. With GC memory is cleaned automatically, developer doen't need manual de allocation of memory(explicitly like c, c++).