// 10. Add int and double and store in int.

class AddOfIntDoule{

	public static void main(String[] args){
		int a = 100;
		double b = 300.99d;
		// int sum = (int) a + b; // it will give error due to operator precedence so java looks this code as ((int) a) + b 
		// that whenever casting is happeing add whole expression into brackets.
		int sum = (int) (a+b); // o/p => 400
		System.out.println(sum);
	}
}