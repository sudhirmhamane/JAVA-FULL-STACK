// 1. Perform operation 1)Addition 2)Substraction 3)Multiplication 4)Division 5)Modulus

import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your choice: \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4. Division \n 5. Modulus ");
        int choice = scn.nextInt();

        System.out.println("enter first num");
        int n1 = scn.nextInt();

        System.out.println("enter second num");
        int n2 = scn.nextInt();


        scn.close();
        switch(choice){
            case 1:
                System.out.println("sum: "+ (n1 + n2));
            break;

            case 2:
                System.out.println("Sub: "+ (n1 - n2));
            break;

            case 3:
                System.out.println("Mult: "+ (n1 * n2));
            break;

            case 4:
                System.out.println("Div: "+ (n1 / n2));
            break;

            case 5:
                System.out.println("Mod: "+ (n1 % n2));
            break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
