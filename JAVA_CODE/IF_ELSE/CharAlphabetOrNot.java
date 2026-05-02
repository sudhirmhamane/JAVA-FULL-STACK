// 1)WAP to check given character is alphabet or not

import java.util.Scanner;
class CharAlphabetOrNot{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to check it is alphabet or not: ");
		char ch = sc.nextLine().charAt(0);
	
		if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ){

			System.out.println(ch + " is alphabet");
		} else {
			System.out.println(ch + " is not alphabet");

		}
	}

}