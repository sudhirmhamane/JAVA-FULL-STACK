class ReverseThreeNum{

	public static void main(String[] agrs){

		int num = 123;

		int last = num % 10;
		num = num /10;

		int secondLast = num % 10;
		num = num / 10;
	
		int thirdLast = num % 10;
		
		int rev = last * 100 + secondLast * 10 + thirdLast;

		System.out.println("Reverse of num is: " + rev);
	}

}