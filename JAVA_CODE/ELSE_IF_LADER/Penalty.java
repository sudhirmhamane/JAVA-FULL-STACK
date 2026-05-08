// 20. Determine penalty based on late submission days.

import java.util.Scanner;

public class Penalty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter late days: ");
        int days = scn.nextInt();
        scn.close();

        if (days == 0)
            System.out.println("No penalty");
        else if (days <= 3)
            System.out.println("Small Penalty");
        else if (days <= 7)
            System.out.println("Medium Penalty");
        else
            System.out.println("Heavy Penalty");
    }
}

/*
o/p:

Enter late days: 
1
Small Penalty

*/
