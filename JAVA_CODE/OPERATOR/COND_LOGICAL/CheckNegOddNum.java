// 3)Check Negative Odd Number 

class CheckNegOddNum{

	public static void main(String args[]){

		int num = -13;
		
		String res = (num < 0 &&  num%2!=0) ? "Neg Odd Num" : "NOT Neg Odd Num";
		System.out.println(res);
	}
}