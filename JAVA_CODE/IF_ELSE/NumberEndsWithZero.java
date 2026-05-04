// 4)Check number ends with 0

import java.util.Scanner;
class NumberEndsWithZero{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(num % 10 == 0){
			System.out.println(num + " End with zero");
		} else {
			System.out.println(num + " Not End with zero");
		}
	}
}