// WAJP to swap two numbers without using 3rd variable ?
class Swap{

	public static void main(String[] args){

		int a = 10;
		int b = 20;

		System.out.println("Before Swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		
		a = a + b; // 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 30 - 10 = 20

		System.out.println("After Swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
}

/*
	Before Swapping:
	a: 10
	b: 20
	After Swapping:
	a: 20
	b: 10
*/