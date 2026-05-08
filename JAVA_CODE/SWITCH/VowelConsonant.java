
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        sc.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Char is vowel");
                break;

            default:
                System.out.println("character is consonant");
                break;
        }

        sc.close();
    }
}
