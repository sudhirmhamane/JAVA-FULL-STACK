// 12)Check if number is divisible by lastdigit or not

import java.util.Scanner;
class NumDivByLastDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anumber: ");
		int num = sc.nextInt();
			
		int last = num % 10;
		if(num != 0 && num % last == 0){
			System.out.println(num +  " is Divisible by last digit");
		} else {

			System.out.println(num +  " is not Divisible by last digit");

		}

		sc.close();
	}

}