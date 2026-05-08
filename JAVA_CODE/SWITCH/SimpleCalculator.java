// 4.Write a program to perform basic Simple Calculator 

import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter charater op: ");
        char op = scn.next().charAt(0);

        scn.nextLine();

        System.out.println("enter first num");
        int n1 = scn.nextInt();

        System.out.println("enter second num");
        int n2 = scn.nextInt();


        scn.close();
        switch(op){
            case '+':
                System.out.println("sum: "+ (n1 + n2));
            break;

            case '-':
                System.out.println("Sub: "+ (n1 - n2));
            break;

            case '*':
                System.out.println("Mult: "+ (n1 * n2));
            break;

            case '/':
                System.out.println("Div: "+ (n1 / n2));
            break;

            case '%':
                System.out.println("Mod: "+ (n1 % n2));
            break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

