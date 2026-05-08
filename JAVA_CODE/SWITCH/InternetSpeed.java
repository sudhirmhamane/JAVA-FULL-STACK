
import java.util.Scanner;
public class InternetSpeed {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("internet speed(mpbs): ");
        int speed = scn.nextInt();

        switch (speed / 10) {
            case 0:
                System.out.println("slow");
                break;
            case 1:
                System.out.println("Moderate");
                break;
            case 2:
                System.out.println("Fast");
                break;
            case 3:
                System.out.println("Ultra Fast");
                break;
            case 4:
                System.out.println("Super Fast");
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
        scn.close();
    }
}
