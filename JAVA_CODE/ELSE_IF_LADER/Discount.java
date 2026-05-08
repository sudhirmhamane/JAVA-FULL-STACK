// 3. Calculate discount percentage based on purchase amount.

import java.util.Scanner;
class Discount{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount: ");
		double amount = sc.nextDouble();

		sc.close();
		if(amount >= 5000){
			 System.out.println("20% Discount");
		}
		else if(amount >= 2000){
			System.out.println("10% Discount");
		}
		else{
			System.out.println("No Discount");
		}
		
	}
}

/*
o/p:
enter amount:
3000
10% Discount
*/
