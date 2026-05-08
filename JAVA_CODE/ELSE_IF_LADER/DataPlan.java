// 16. Determine data plan category based on GB usage
import java.util.Scanner;
public class DataPlan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter data usage(GB): ");
        int data = scn.nextInt();

        if (data < 1) {
            System.out.println("Low usage");
        } else if (data <= 5) {
            System.out.println("Medium Usage");
        } else if (data <= 10) {
            System.out.println("high usage");
        } else{
            System.out.println("Unlimited USer");
        }
        scn.close();
    }
}

/*
o/p:

enter data usage(GB): 
11
Unlimited USer

*/