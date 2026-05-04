// 5)Single Digit OR Two Digit 

import java.util.Scanner;
class SingleDigitOrTwoDigit{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num >=-9 && num <=9)){
			System.out.println("single digit");
		} else{
			System.out.println("Two digit");
		}
	}
}