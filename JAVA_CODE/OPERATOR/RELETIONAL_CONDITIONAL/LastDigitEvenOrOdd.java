/*
19)Last Digit Even or Odd 
Input:-  num=123  output: Odd
Input:- num=256  output: Even
*/

class LastDigitEvenOrOdd{

	public static void main(String[] agrs){
		int num = 12309008;
	
		String res = num%2==0 ? "Even" : "Odd";
		System.out.println(res);
	}
}