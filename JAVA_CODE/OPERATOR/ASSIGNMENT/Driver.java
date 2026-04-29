class Driver{

	public static void main(String[] res){

		int a = 5;
		int b = 6;
		int c = 8;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		a = b = c;
		c = b = a;
		b = a = b;


		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}