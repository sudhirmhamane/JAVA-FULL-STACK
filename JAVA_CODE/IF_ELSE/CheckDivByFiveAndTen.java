/*
4)Divisible by 5 and 10 
Input: num=50  output: DIVISIBLE
Input: num=60  output:NOT DIVISIBLE
*/


import java.util.Scanner;
class CheckDivByFiveAndTen{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num%5==0 && num%10==0)){
			System.out.println("Divisible");
		} else{
			System.out.println("Not Divisible");
		}
	}
}

