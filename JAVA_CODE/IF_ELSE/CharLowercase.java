// 14)Check if character is lowercase and between 'm'–'z' 


import java.util.Scanner;
class CharLowercase{

	public static void main(String[] args){	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch>= 'a' && ch <= 'z') && (ch >='m' && ch <='z')){
			System.out.println("character is lowercase and between 'm'–'z'");
		} else{
			System.out.println("character is not between m–z");
		}
	}

}