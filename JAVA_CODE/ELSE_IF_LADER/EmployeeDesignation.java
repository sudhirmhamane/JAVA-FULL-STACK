// 18. Categorize employee designation based on years of experience.

import java.util.Scanner;

public class EmployeeDesignation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter exp: ");
        int exp = scn.nextInt();
        scn.close();

        if (exp < 1)
            System.out.println("Fresher");
        else if (exp < 3)
            System.out.println("Junior");
        else if (exp < 7)
            System.out.println("Mid-Level");
        else
            System.out.println("Senior");
    }
}

/* 
o/p:

enter exp: 
23
Senior

*/