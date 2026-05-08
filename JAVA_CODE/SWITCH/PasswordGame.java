// 19)Write a program to perform Password Game 

import java.util.Scanner;

public class PasswordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = sc.nextInt();

        switch (password) {
            case 1234:
                System.out.println("Access Granted");
                break;
            default:
                System.out.println("Access Denied");
        }
        sc.close();

    }
}
