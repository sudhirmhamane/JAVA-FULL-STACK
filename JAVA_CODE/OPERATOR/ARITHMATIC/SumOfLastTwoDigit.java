class SumOfLastTwoDigit{

	public static void main(String [] args){

		int num  = 1234;
		int sum = 0;

		int first = num % 10;
		num = num/10;
	
		int second = num % 10;
		sum = first + second;
		num = num/10;

		int third = num % 10;	
		sum = first + second + third;
		
		System.out.println("sum of " + first + " and " + second + " and " + third + " is: " + sum);
	}
}

// o/p -> sum of 3 and 2 is: 5
// o/p -> sum of 4 and 3 and 2 is: 9