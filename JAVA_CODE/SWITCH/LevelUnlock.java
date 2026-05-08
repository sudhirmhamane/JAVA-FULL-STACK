// 20)write a program to print Level Unlock Game

import java.util.Scanner;

public class LevelUnlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter level: ");
        int level = sc.nextInt();

        switch (level) {
            case 1:
                System.out.println("Level 1 Unlocked");
                break;
            case 2:
                System.out.println("Level 2 Unlocked");
                break;
            case 3:
                System.out.println("Boss Level!");
                break;
            default:
                System.out.println("Invalid Level");
        }
        sc.close();
    }
}
