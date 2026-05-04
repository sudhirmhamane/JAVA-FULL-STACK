// 13)Check if character is uppercase but not a vowel

import java.util.Scanner;
class UppercaseButNotVowel{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch >= 'A' && ch <='Z')){
			System.out.println(ch + " is a UpperCase and not a vowel");
		} else {
			System.out.println(ch + " may be lowercase or uppercase");
		}

	}

}