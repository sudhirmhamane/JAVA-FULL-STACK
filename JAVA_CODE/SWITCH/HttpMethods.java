import java.util.Scanner;

public class HttpMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter method name: ");

        String method = sc.next();

        switch (method) {
            case "GET":
                System.out.println("Read");
                break;
            case "POST":
                System.out.println("Create");
                break;
            case "PUT":
                System.out.println("Update");
                break;
            case "DELETE":
                System.out.println("Delete");
                break;
        }
        sc.close();
    }
}
