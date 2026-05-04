// 17)Check if character is hex digit 

import java.util.Scanner;
class HexDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch>= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || ( ch >= 'a' && ch <= 'f')){
			System.out.println("character is hex digit");
		} else{
			System.out.println("character is not hex digit");
		}
		sc.close();
		
	}
}