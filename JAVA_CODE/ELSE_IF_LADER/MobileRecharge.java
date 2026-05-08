// 15. Determine mobile recharge bonus based on recharge amount.

import java.util.Scanner;

class MobileRecharge {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter amount: ");
        int amount = scn.nextInt();

        if (amount < 100){
            System.out.println("No Bonus");
        }
        else if (amount >= 100 && amount < 300){
            System.out.println("Small Bonus");
        }
        else if (amount >= 300 && amount < 500){
            System.out.println("Medium Bonus");
        }
        else{
            System.out.println("High Bonus");
        }
        scn.close();

    }
}