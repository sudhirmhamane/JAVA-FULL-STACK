/*
1)Check Number Between 10 and 50 
Input num=25  output:- IN RANGE
Input num=60 output: OUT OF RANGE
*/

class NumberBetween{
	public static void main(String[] args){
		
		int num = 9;

		String res = (num >= 10 && num <= 50) ? "In range" : "Out Of Range";
		System.out.println(res);
	}
}