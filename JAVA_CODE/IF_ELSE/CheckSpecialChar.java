// 2)WAP to check given character is special character or not

import java.util.Scanner;
class CheckSpecialChar{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to check it is special char or not: ");
		char ch = sc.nextLine().charAt(0);
		
		if((ch>= '0' && ch<='9') || (ch >= 'A' && ch<='Z') || (ch >= 'a' && ch <= 'z')){
			System.out.println(ch + " is not a special character");
		} else {

			System.out.println(ch + " is a special character");

		}
		sc.close();
	}
}