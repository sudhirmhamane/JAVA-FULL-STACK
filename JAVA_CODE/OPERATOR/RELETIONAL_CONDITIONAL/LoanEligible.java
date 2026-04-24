/*
16) Loan Eligibility  (condition: creditScore>=550)
Input: creditScore=500 output: eligible
Input: creditScore=600 output: not eligible
*/

class LoanEligible{


	public static void main(String[] args){
		int a = 500;
	
		String res =  a >= 550? "eligible" : "not eligible";
		System.out.println(res);
	}
}