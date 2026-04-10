# Structure of the Java Program

```
//class decleration
class Demo //class name
{ // class block
                    // main -> method name
    public static void main(String args[]) // Method Decleration
    { // method block
        //implementation

        // print statement decleration
        System.out.println("Hello World");
    }
}
```

---

At Compilation whole source code is complied (my contain multiple classes)

We can compile an empty class (class with doent contains data members[variables] and member function [method])

**Example:** ``` class Demo{} ```

At the time of execution we should use class name

At runtime jvm searches for "main method" if not found then it throws a runtime error 

i.e ``` please define main method as "public static void main(String[] args)"```

---

## Can we execute java program without main()?

**NO,**

We cannot execute without main method beacuse java follows a standard operating procedure to run(execute) a program.

JVM always searches for main method.

In java, execution start from main() method and ends at main() this approach of execution if followed by procedural programming language.

**OR**

**YES,**

We can execute java program without main method with the help of static block(initilizer).

A static block in java get's execute before main(), so we can use it to execute a program direclty without main method.

After static method execution jvm searches for main method and throws runtime error 
``` main() not found ```.

So to get ridge of error we should use,
```System.exit(0) ```

---

## WAJP to print a name without "semi colon"?

```
class Demo{
    public static void main(String [] args){
        if(System.out.printf("Helloooo") != null){}
    }
}
```