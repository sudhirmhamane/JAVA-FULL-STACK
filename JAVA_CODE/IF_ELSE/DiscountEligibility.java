/*
12)Discount Eligibility  (amount >= 3000 && amount <= 10000 )
Input: amount = 4000 output: ELIGIBLE FOR DISCOUNT
Input: amount=2500 output: NOT ELIGIBLE FOR DISCOUNT
*/


import java.util.Scanner;
class DiscountEligibility{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a amount: ");
		int amount = sc.nextInt();
	
		if(amount >= 3000 && amount <= 10000){
			System.out.println("ELIGIBLE FOR DISCOUNT");
		} else{
			System.out.println("NOT ELIGIBLE FOR DISCOUNT");
		}
	}
}


/* 
o/p => 
Enter a amount:
4000
ELIGIBLE FOR DISCOUNT
*/

