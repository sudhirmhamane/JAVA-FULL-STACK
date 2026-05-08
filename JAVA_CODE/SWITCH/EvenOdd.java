// 5)Write a program to perform even and odd operation using switch

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();

        scn.close();
        switch (n % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        
            default:
                break;
        }
    }
}
