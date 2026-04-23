// 16)WAP to perform sum of 3 digit

class SumOfThreeDig{

	public static void main(String[] args){

		int num = 234;
		int sum = 0;
	
		int last = num % 10;
		num = num / 10;

		int secondLast = num % 10;
		num = num / 10;
	
		int thirdLast = num % 10;
		
		sum = last + secondLast + thirdLast;
		
		System.out.println("Sum of three digit is: " + sum);
	}
}

// Sum of three digit is: 9