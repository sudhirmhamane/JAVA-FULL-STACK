
/*
14)ASCII Character Check 
Input:  ch=’A’ output:- ASCII 
Input ch=’\u0902’ output: NOT ASCII
*/


import java.util.Scanner;
class ASCIICharacterCheck{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if(ch <= 127){ 
			System.out.println("ASCII");
		} else{
			System.out.println("NOT ASCII");
		}
		sc.close();

	}
}