/*
1)Check Number Between 10 and 50 
Input num=25  output:- IN RANGE
Input num=60 output: OUT OF RANGE
*/

import java.util.Scanner;
class CheckInRange{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num >= 10 || num <= 50)){
			System.out.println("In Range");
		} else{
			System.out.println("Not In Range");
		}
	}
}

