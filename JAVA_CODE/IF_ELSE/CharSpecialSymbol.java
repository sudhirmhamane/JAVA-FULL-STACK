// 8)Check if char is special symbol but printable 

import java.util.Scanner;
class CharSpecialSymbol{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))){
			System.out.println(ch + " is a special character");
		} else {
			System.out.println(ch + " is a not special character");
		}

		
	}
}