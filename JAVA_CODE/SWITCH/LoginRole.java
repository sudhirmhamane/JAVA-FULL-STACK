// 8)Write  a program to print Login Role 

import java.util.Scanner;
public class LoginRole{

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter role: ");
        String role = sc.nextLine();

        switch (role) {
            case "admin":
                System.out.println("Full Access");
                break;
            case "user":
                System.out.println("Limited Access");
                break;
        
            default:
                System.out.println("Guest");
                break;
        }
        sc.close();
    }
}