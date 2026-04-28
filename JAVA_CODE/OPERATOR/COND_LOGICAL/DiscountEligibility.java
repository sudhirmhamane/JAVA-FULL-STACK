/*
12)Discount Eligibility  (amount >= 3000 && amount <= 10000 )
Input: amount = 4000 output: ELIGIBLE FOR DISCOUNT
Input: amount=2500 output: NOT ELIGIBLE FOR DISCOUNT
*/

class DiscountEligibility{

	public static void main(String [] args){
		int amount = 4000;
		String res = (amount >= 3000 && amount <= 10000) ? "ELIGIBLE FOR DISCOUNT" : "NOT ELIGIBLE FOR DISCOUNT";
		System.out.println(res);
	}
}
// o/p => ELIGIBLE FOR DISCOUNT