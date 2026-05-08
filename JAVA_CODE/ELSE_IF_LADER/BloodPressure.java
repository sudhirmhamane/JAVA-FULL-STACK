// 21. Classify blood pressure level (Low, Normal, High).

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter BP: ");
        int bp = scn.nextInt();
        scn.close();

        if (bp < 90)
            System.out.println("Low");
        else if (bp <= 120)
            System.out.println("Normal");
        else
            System.out.println("High");
    }
}

/*
o/p:

enter BP: 
120
Normal

*/
