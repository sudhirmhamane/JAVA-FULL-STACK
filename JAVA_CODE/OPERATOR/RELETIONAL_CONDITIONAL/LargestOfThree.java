/*
11)Largest of Three Numbers 
Input a=10 b=20 c=30    output : 30
Input a=5, b=3, c=1    output: 5
*/

class LargestOfThree{
	
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 30;
		
		int res = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println(res);

	}
}