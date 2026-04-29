class PIO{

	public static void main(String[] agrs){
		int a = 4; 
		int b = 5;
		
		a = a++ + b++;
		b = b++ + a++;
	
		System.out.println(a++);
		System.out.println(a);

		b = b++;
		System.out.println("b1 "+b);
		b++;
		System.out.println("b2 "+b);
	
		System.out.println("b3 "+b);
	}
}