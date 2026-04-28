/*
5) Salary Bonus Eligibility  (condition salary >= 25000 && exp >= 2 )
Input: salary=30000  exp=3   output: BONUS ELIGIBLE
*/

class SalaryBonusEligibility{
	public static void main(String args[]){
		int sal = 30000;
		byte exp = 3;
	
		String res = ( sal >= 25000 && exp >=2 )? "BONUS ELIGIBLE" : "NBE";
		System.out.println(res);
	}
}

/*
o/p => BONUS ELIGIBLE
*/