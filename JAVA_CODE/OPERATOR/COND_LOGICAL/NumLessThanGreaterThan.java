// 1)Check Number is Less than 10 OR Greater than 50 
// Input:- num=60 output : within Range
// Input:- num 25  output: NOT IN RANGE

import java.util.Scanner;
public class NumLessThanGreaterThan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();

        String res = (num < 10 || num > 50) ? "Within range" : "Not in range";
        System.out.println(res);
        sc.close();

    }
}

// o/p:

// Enter num: 
// 12
// Not in range
