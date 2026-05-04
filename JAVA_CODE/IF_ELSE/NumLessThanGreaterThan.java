// 1)Check Number is Less than 10 OR Greater than 50 
// Input:- num=60 output : within Range
// Input:- num 25  output: NOT IN RANGE


import java.util.Scanner;
class NumLessThanGreaterThan{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if(num < 10 || num > 50){
			System.out.println("Within range");

		} else{
			System.out.println("Not in range");
		}
	}
}

// o/p:

// Enter num: 
// 12
// Not in range
