import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        switch (year) {
            case 1:
                if((year %4 == 0 && year != 100 ) || ( year %400 == 0))
                System.out.println("Year is leap year");
                break;
            default:
                System.out.println("Not a leap year");
                break;
        }
        sc.close();
    }
}
