class CountOfFibonacii{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int c;
		int count = 0;
		
		while(a <= 15){
		
			System.out.println(a);
			count++;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("count of fibonacii series is: " + count);

	}
}