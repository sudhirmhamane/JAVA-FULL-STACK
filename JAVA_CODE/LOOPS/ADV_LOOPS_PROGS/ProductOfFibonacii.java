class ProductOfFibonacii{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int c;
		int p = 1;
		
		for(int i=1; i<=3; i++){
		
			System.out.println(a);
			if(a != 0){
				p *= a;
			}
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Product of first all 3 fibonacii series is: " + p);

	}
}