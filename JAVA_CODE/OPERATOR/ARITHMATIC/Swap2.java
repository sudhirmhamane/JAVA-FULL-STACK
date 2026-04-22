/*
WAJP to swap two variable without using 3rd variable and only using *,/
*/

class Swap2{
		
	public static void main(String[] args){
		int a = 20;
		int b = 40;
		
		System.out.println("Before Swapping: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		
		a = a * b; // 20*40 = 80
		b = a / b; // 80/40 = 40
		a = a / b; // 80/40 = 20

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