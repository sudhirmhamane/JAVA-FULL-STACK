// 5)Check if two numbers have same last digit

import java.util.Scanner;
class TwoNumSameDigit{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();


		if(num1 % 10 == num2 % 10){
			System.out.println(num1 + " and " + num2 + " have same last digit");
		} else {
			System.out.println(num1 + " and " + num2 + " not have same last digit");
		}
		
	}
}