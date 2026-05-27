class SumOfFirstEighteenFibonacii{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int c;
		int sum = 0;
		
		while(a <= 18){
			System.out.println(a);
			sum += a;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Sum of first all 18 Fibonacci series is: " + sum);

	}
}