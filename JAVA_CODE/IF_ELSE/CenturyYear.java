// 6)Check if year is century year or not   A century year is a year that is divisible by 100

import java.util.Scanner;
class CenturyYear{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int year = sc.nextInt();

		if(year %100 == 0){
			System.out.println(year + " Is a century year");
		} else {
			System.out.println(year + " Not a century year");

		}
		
	}
}
