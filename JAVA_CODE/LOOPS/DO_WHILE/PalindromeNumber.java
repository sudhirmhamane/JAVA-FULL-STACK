// 19. Check palindrome number

import java.util.Scanner;
class PalindromeNumber{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		int ld = 0;
		do{	
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}while(num != 0);
		if(temp == rev){
			System.out.println(temp + " is a palindrome");
		} else {
			System.out.println(temp + " is not a palindrome");
		}
		sc.close();
	}

}