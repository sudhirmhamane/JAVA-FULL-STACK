import java.util.Scanner;

class CharArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] ch = new char[5];

        System.out.println("Enter 5 characters:");

        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }

        System.out.println("Characters:");

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}