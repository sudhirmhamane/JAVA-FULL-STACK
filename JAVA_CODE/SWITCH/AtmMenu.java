import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        

        System.out.println("1.Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4. Mini Statement");
        int choice = sc.nextInt();

      
        
        sc.close();
        switch (choice) {

            case 1:
                System.out.println("Balance");
                break;
            case 2:
                System.out.println("Withdraw");
                break;

            case 3:
                System.out.println("Deposit");
                break;

            case 4:
                System.out.println("Mini Statement");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}