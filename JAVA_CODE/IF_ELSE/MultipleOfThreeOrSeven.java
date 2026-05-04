// 4)Multiple of 3 OR 7

import java.util.Scanner;
class MultipleOfThreeOrSeven{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if(num %3 == 0 || num %7 == 0){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}

/*

o/p ->

Enter a number:
12
Yes

*/