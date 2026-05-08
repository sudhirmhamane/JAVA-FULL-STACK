// 19. Determine movie ticket price based on age and time slot.

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter timing: ");
        String time = scn.nextLine();

        scn.close();

        if (age < 12)
            System.out.println("Child Discount");
        else if (time == "morning")
            System.out.println("Discount Price");
        else if (time == "evening")
            System.out.println("Regular Price");
        else
            System.out.println("Night High Price");

    }

}

/*
o/p: 

Enter age: 
11
Enter timing: 
moring
Child Discount


*/