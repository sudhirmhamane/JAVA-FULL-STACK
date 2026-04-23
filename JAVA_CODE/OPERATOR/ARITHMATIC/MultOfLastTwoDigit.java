class MultOfLastTwoDigit{

	public static void main(String args[]){
		int num = 123;
		int mult = 0;
	
		int first = num % 10;
		num = num/10;
		
		int second = num % 10;
		num = num/10;
		
		mult = first * second;
		System.out.println("multiplication of last two digit is: " + mult);
			
	}
}