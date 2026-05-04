// 11)Check if difference of two numbers is exactly 1 

import java.util.Scanner;
class CheckdiffExactOne{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();


		if((num1 - num2 == 1) || (num1 - num2 == -1)){
			System.out.println("difference is exactly 1");
		} else {
			System.out.println("difference is not exactly 1");
		}

	}
}