// 24. Categorize a number as Very Small (<10), Small, Medium, Large, Very Large (>1000).


import java.util.Scanner;
public class NumberSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        sc.close();
        if (n < 10)
            System.out.println("Very Small");
        else if (n <= 100)
            System.out.println("Small");
        else if (n <= 500)
            System.out.println("Medium");
        else if (n <= 1000)
            System.out.println("Large");
        else
            System.out.println("Very Large");

    }
}

/*
o/p:

Enter number: 
12
Small

*/