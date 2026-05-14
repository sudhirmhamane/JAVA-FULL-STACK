// 17. count digits

import java.util.Scanner;
class CountDigits{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = 0;
		do{	
			count++;
			num /= 10;
		}while(num != 0);
		System.out.println("Digit count of given num is:  " + count);
		sc.close();
	}

}