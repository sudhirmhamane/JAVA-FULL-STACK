
// 9 Battery level
import java.util.Scanner;

public class BatteryLevel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter battery per: ");
        int b = scn.nextInt();

        switch (b / 25) {
            case 0:
                System.out.println("Low");
                break;
            case 1:
                System.out.println("Medium");
                break;
            case 2:
                System.out.println("high");
                break;
            case 3:
                System.out.println("Full");
                break;
            case 4:
                System.out.println("100%");
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
        scn.close();
    }
}
