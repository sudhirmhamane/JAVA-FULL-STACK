/*
Two Digit Number  (num >= 10 && num <= 99) 
Input: num=45 output: TWO DIGIT
Input: num=999 output: IT IS NOT TWO DIGIT
*/

class TwoDigNum{

	public static void main(String [] args){
		int num = 45;
		String res = (num >= 10 && num <= 99) ? "TWO DIGIT" : "IT IS NOT TWO DIGIT";
		System.out.println(res);
	}
}
// o/p => TWO DIGIT