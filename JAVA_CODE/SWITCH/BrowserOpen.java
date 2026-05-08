import java.util.Scanner;

public class BrowserOpen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter browser name to open: ");
        String browser = sc.next();


        sc.close();
        switch (browser) {

            case "chrome":
                System.out.println("Opening Chrome");
                break;

            case "firefox":
                System.out.println("Opening Firefox");
                break;

            case "edge":
                System.out.println("Opening Edge");
                break;

            default:
                System.out.println("Unknown Browser");
        }
    }
}