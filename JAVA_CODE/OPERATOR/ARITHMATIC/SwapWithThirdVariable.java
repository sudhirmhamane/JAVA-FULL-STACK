class SwapWithThirdVariable{

	public static void main(String[] args){

		int temp;
		int a = -270;
		int b = 308;

		System.out.println("Before Swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);


		temp = a;
		a = b;
		b = temp;
	
		System.out.println("After Swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}

/*

Before Swapping:
a: -20
b: 30
After Swapping:
a: 30
b: -20

*/