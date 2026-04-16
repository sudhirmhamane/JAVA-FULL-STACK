/*

	When we are using float datatype then it is mandatory to suffix value with 'f' and 'F'
	otherwise we will get compile time error.
	
*/

class FloatDemo1{

	public static void main(String[] args){
		
		float res = 10.6f;
		System.out.println("res: " + res);
		// o/p -> res: 10.6

		// float res1 = 10.6;
		// System.out.println("res1: " + res1);
		// error: incompatible types: possible lossy conversion from double to float
		
	}
}