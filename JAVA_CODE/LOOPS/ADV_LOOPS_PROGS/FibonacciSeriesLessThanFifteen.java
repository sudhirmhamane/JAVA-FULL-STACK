class FibonacciSeriesLessThanFifteen{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int c;
		
		while(a <= 15){
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}
}