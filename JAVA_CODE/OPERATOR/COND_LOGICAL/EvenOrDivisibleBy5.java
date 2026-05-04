/*
2) Even OR Divisible by 5
Condition: num % 2 == 0 || num % 5 == 0

Input: num = 10 → Output: True (even & divisible by 5)
Input: num = 7 → Output: False (not even, not divisible by 5)
*/


import java.util.Scanner;
class EvenOrDivisibleBy5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Num: ");
		int num = sc.nextInt();
		
		String res = (num % 2 == 0 || num % 5 == 0) ? "Yes" : "NO";
		System.out.println(res);
	}
}