// 18. reverse number

import java.util.Scanner;
class ReverseNumber{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int rev = 0;
		int ld = 0;
		do{	
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}while(num != 0);
		System.out.println("reverse of given num is:  " + rev);
		sc.close();
	}

}