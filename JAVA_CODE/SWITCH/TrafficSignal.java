// 7)Write a program to print Traffic Signal 


import java.util.Scanner;
public class TrafficSignal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Signal: ");
        String signal = scn.nextLine();

        scn.close();
        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
        
            default:
                System.out.println("invalid input");
                break;
        }
    }
 
}
