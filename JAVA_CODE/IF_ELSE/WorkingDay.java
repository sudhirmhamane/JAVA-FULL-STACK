/*
10)Working Day (1–5)  (condition day >= 1 && day <= 5 )
Input: day= 3  output: working day
Input: day= 8 output: NOT WORKING DAY
*/

import java.util.Scanner;
class WorkingDay{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day: ");
		int day = sc.nextInt();
	
		if((day >= 1 && day <= 5)){
			System.out.println("working day");
		} else{
			System.out.println("NOT WORKING DAY");
		}
	}
}