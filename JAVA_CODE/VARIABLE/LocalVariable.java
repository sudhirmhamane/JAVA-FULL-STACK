/*

    Local Variable in java:

    A variable which is declared or created inside a method or any other block except class block is known as local variable.
*/

/*
public class LocalVariable {

    // class block
    public static void main(String[] args) {
        // method block

        int a = 10; // this is a local block
        System.out.println(a);
        
    }
}

*/

/*

public class LocalVariable {

    double d = 0; // this is not a local variable
    public static void main(String[] args) {
        
    }
}

*/

/*
    Characteristics  of local variable:

    1. If we want we can declare local varible without initilization but, if we want to use local variable then initialization is compalsory.

Example:

public class LocalVariable {

    public static void main(String[] args) {
        boolean b = true;
        System.out.println(b);
    }
}

*/

/*
    2. Local Variable does not have default value.
*/

/*
    3. Local variable having block level scope it means inside which block we have created local variable, we can use it inside the same block.
    
public class LocalVariable {
        
    public static void main(String[] args) {
        char ch = 'A';
    }
    
    public static void Test(){
        // System.out.println(ch);
        // we cannot access the ch variable inside the another class or method
        // ch variable is blocked scope and it is only accessable in main() method.
    }
}
    
*/


/*
    4. We can have multiple local variable inside a java program

public class LocalVariable {

    public static void main(String[] args) {
        int age = 12;
        String name = "sudhir";
        double salary = 8088080.0;
        
        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
    }
}
*/

/*
    5. We cannot have multiple local variable within one scope with same name.

public class LocalVariable {

    public static void main(String[] args) {
        String name = "Sudhir";
        String name = "Ram";
        System.out.println(name);
        System.out.println(name);

        // this code will give the error: name variable already declared inside main block.

        // During runtime JVM get confusion which local variable value to print, because both variable having same name
    }
}

*/  

/*
    6. We can have multiple local variable with same name inside different block


public class LocalVariable {

    public static void main(String[] args) {
        String name = "Sud";
        System.out.println(name);
        Teacher();
    }

    public static void Teacher() {
        String name = "ram";
        System.out.println(name);
    }
}

*/

/*
    7. For Local Variable memory will be allocated inside  "Local variable Array"

*/