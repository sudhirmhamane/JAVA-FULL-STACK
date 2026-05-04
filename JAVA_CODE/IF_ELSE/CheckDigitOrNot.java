/*
13) Digit Check  (ch >= '0' && ch <= '9' )

Input: ch=’5’  output: DIGIT
Input: ch=’T’ output: NOT DIGIT
*/

import java.util.Scanner;
class CheckDigitOrNot{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch >= '0' && ch <= '9')){ 
			System.out.println("Digit");
		} else{
			System.out.println("Not Digit");
		}
		sc.close();

	}
}

/*
o/p: 
Enter a character:
r
Not Digit
*/