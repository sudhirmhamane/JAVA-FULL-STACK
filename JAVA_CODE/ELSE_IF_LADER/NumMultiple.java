// 8. Check whether a number is multiple of 2, 3, 5, or none.

import java.util.Scanner;
class NumMultiple 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		
		int n = sc.nextInt();

		if(n % 2 == 0)
			System.out.println("Multiple of 2");
		else if(n % 3 == 0)
			System.out.println("Multiple of 3");
		else if(n % 5 == 0)
			System.out.println("Multiple of 5");
		else
			System.out.println("None");

	}
}


/*

o/p:

Enter num:
45
Multiple of 3

*/