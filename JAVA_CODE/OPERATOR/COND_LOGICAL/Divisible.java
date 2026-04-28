/*
4)Divisible by 5 and 10 
Input: num=50  output: DIVISIBLE
Input: num=60  output:NOT DIVISIBLE
*/

class Divisible{
	public static void main(String[] args){
		int num = 50;
		String res = (num%5==0 && num%10==0)? "DIVISIBLE" : "NOT DIVISIBLE";
		System.out.println(res);
	}
}

// o/p => DIVISIBLE