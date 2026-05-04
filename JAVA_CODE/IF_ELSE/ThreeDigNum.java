/*
8)Three Digit Number  (num >= 100 && num <= 999 )
*/


import java.util.Scanner;
class ThreeDigNum{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num >= 100 && num <= 999)){
			System.out.println("THREE DIGIT");
		} else{
			System.out.println("IT IS NOT THREE DIGIT");
		}
	}
}