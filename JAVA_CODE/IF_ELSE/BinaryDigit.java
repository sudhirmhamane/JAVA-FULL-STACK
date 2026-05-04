// 18)Check if character is binary digit 

import java.util.Scanner;
class BinaryDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch == '0' || ch == '1')){
			System.out.println("character is binary digit ");
		} else{
			System.out.println("character is not binary digit");
		}
		sc.close();
		
	}

}