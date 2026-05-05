// 6. Determine shipping charges based on weight slabs.

import java.util.Scanner;
class ShippingCharges{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight: ");
		int weight = sc.nextInt();
		
		if(weight <= 5){
			System.out.println("shipping charges: 45 per Kg");
		} else if(weight <= 15){
			System.out.println("shipping charges: 40 per Kg");
		} else if(weight <= 25){
			System.out.println("shipping charges: 35 per Kg");
		} else if(weight <= 35){
			System.out.println("shipping charges: 30 per Kg");
		} else{
			System.out.println("shipping charges: 25 per Kg");
		}
	}
}

/*

o/p: 

Enter Weight:
20
35 per Kg

*/
