
// 2. Electricity bill calculation based on unit slabs.
import java.util.Scanner;
class ElectricalBill {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units: ");
		int units = sc.nextInt();
		
		if(units <= 100){
			System.out.println("Low Bill");
		}else if(units <= 300){
			System.out.println("Medium Bill");
		}else{
			System.out.println("High Bill");
		}
	}
}

/*
o/p:

Enter Units:
120
Medium Bill
*/