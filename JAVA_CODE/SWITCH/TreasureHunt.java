import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Treasure Hunt Game ===");
        System.out.println("you are at the starting point..");
        System.out.println("1. Enter Forest");
        System.out.println("2. Enter Cave");
        System.out.println("Choose your path: ");

        int choice1 = sc.nextInt();

        switch (choice1) {
            // This case for forest path:
            case 1:
                System.out.println("You choose forest path..");
                System.out.println("Climb a tree");
                System.out.println("Follow the river");
                System.out.println("Your choice:");
                int choice2 = sc.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("you entered Climb a tree");
                        System.out.println("you found a hidden treasure! YOU WIN!");
                        break;
                    case 2:
                        System.out.println("you entered Follow the river..");
                        System.out.println("Crocodile attack on you! Ohhh GAME OVER!");
                        break;

                    default:
                        System.out.println("invalid choice!");
                }
                break;

            // Cave path
            case 2:
                System.out.println("\n You entered the cave..");
                System.out.println("1. Light a Torch");
                System.out.println("2. WAlk in Darkness");
                System.out.println("your choice: ");

                int choice3 = sc.nextInt();

                switch (choice3) {
                    case 1:
                        System.out.println("you entered light a torch");
                        System.out.println("you scared away a monster and found tresure! YOU WIN");
                        break;
                    case 2:
                        System.out.println("\nWalking in darkness...");
                        System.out.println("You fell into a pit! GAME OVER!");
                        break;

                    default:
                        System.out.println("Invalid choice!");

                }
        }
        sc.close();
    }
}
