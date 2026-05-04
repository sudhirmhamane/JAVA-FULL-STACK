// 16)Check if character is uppercase vowel only



import java.util.Scanner;
class CharUppercaseVowelOnly{

	public static void main(String[] args){	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch>= 'A' && ch <= 'Z') && (ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U')){
			System.out.println("character is uppercase and vowel");
		} else{
			System.out.println("character is not uppercase and vowel only");
		}
	}

}