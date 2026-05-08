
// 23. Categorize percentage into Grade A+, A, B, C, Fail.

import java.util.Scanner;

public class PreGrade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter pre: ");
        int per = scn.nextInt();

        scn.close();
        if (per >= 90)
            System.out.println("A+");
        else if (per >= 75)
            System.out.println(" A");
        else if (per >= 60)
            System.out.println("B");
        else if (per >= 40)
            System.out.println("B");
        else
            System.out.println("Fail");
    }
}

/*
o/p:

enter pre: 
34
Fail

*/