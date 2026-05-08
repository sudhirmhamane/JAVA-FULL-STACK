
// 22. Determine eligibility for scholarship based on marks and income
import java.util.Scanner;

public class ScholarshipEligible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scn.nextInt();

        System.out.println("Enter income: ");
        int income = scn.nextInt();

        scn.close();
        if (marks >= 90 && income < 200000)
            System.out.println("Full Scholarship");
        else if (marks >= 75 && income < 300000)
            System.out.println("Partial Scholarship");
        else
            System.out.println("Not Eligible");

    }

}
