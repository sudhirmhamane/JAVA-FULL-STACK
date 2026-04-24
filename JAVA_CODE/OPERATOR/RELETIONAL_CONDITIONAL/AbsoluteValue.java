/*

12)Absolute Value 
Input: -9  output: 9
input : 10 output: 10


*/

class AbsoluteValue{

	public static void main(String args[]){
		int num = 349;
	
		int res = num < 0 ? num - num * 2 : num;
		System.out.println(res);
	}
}