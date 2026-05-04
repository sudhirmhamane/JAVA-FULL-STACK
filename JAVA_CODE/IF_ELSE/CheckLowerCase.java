// wap to check given char is lowercase?

import java.util.Scanner;
class CheckLowerCase{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch >= 'a' && ch <= 'z')){ 
			System.out.println("LOWERCASE");
		} else{
			System.out.println("NOT LOWERCASE");
		}
		sc.close();

	}
}