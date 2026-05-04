/*
2)Check Positive Even Number  (num > 0 && num % 2 == 0 )
Input: num=8   output: POSITIVE EVEN
Input: num=-12 output: NOT POSTIVE EVEN
Input: num=17 output: NOT POSITIVE EVEN
*/


import java.util.Scanner;
class CheckPositiveEvenNum{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num > 0 && num % 2 == 0 )){
			System.out.println("POSITIVE EVEN");
		} else{
			System.out.println("NOT POSITIVE EVEN");

		}
	}
}

