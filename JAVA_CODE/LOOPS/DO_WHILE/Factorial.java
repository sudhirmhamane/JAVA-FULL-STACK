// 15. factorial of a number

import java.util.Scanner;
class Factorial{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int fact = 1;
		int i = 1;
		do{	
			fact *= i; // fact = fact * i
			i++;
		}while(i <= num);
		System.out.println("Factorial of " + num + " is: " + fact);
		sc.close();
	}

}