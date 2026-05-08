import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dir: ");
        char dir = sc.next().charAt(0);

        switch (dir) {
            case 'N':
                System.out.println("North");
                break;
            case 'S':
                System.out.println("South");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'W':
                System.out.println("West");
                break;
        }

        sc.close();
    }
}
