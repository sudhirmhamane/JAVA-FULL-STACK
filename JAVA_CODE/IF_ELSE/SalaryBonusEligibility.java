/*
5) Salary Bonus Eligibility  (condition salary >= 25000 && exp >= 2 )
Input: salary=30000  exp=3   output: BONUS ELIGIBLE
*/

import java.util.Scanner;
class SalaryBonusEligibility{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sal: ");
		int sal = sc.nextInt();

		System.out.println("Enter a exp: ");
		int exp = sc.nextInt();

	
		if(( sal >= 25000 && exp >=2 )){
			System.out.println("BONUS ELIGIBLE");
		} else{
			System.out.println("NBE");
		}
	}
}
