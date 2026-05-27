class SumOfFibonacii{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int c;
		int sum = 0;
		
		for(int i=1; i<=5; i++){
			System.out.println(a);
			sum += a;
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Sum of first all 5 fibonacii series is: " + sum);

	}
}