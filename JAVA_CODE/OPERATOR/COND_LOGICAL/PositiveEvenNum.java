/*
2)Check Positive Even Number  (num > 0 && num % 2 == 0 )
Input: num=8   output: POSITIVE EVEN
Input: num=-12 output: NOT POSTIVE EVEN
Input: num=17 output: NOT POSITIVE EVEN
*/

class PositiveEvenNum{
	
	public static void main(String[] args){
		int num = -12;
		String res = (num > 0 && num%2==0) ? "Positive Even" : "Not Positive Even";
		System.out.println(res);
	}
}