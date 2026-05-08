
// 17. Determine insurance premium slab based on age group.
import java.util.Scanner;

public class InsurancePremium {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scn.nextInt();

        scn.close();

        if (age < 18)
            System.out.println("Not Eligible");
        else if (age >= 18 && age <= 30)
            System.out.println("Low Premium");
        else if (age > 30 && age <= 50)
            System.out.println("Medium Premium");
        else
            System.out.println("High Premium");
    }
}

/*
o/p:

Enter age: 
23
Low Premium

*/