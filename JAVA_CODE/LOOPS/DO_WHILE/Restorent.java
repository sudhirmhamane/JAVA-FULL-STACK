import java.util.Scanner;
class Restorent 
{
	public static void main(String[] args) 
	{
		int totalBill = 0;
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("1.Vada-pav\n 2.Mutton Biryani\n 3.Chicken Biryani\n 4.Panner Biryani\n 5.Exit");
			System.out.println();
			choice = sc.nextInt();
			System.out.println();
			
			if(choice == 1){
				totalBill +=40;
				System.out.println("vada pav ordered..!");
			} else if(choice == 2){
				totalBill +=140;
				System.out.println("Mutton Biryani ordered..!");
			} else if(choice == 3){
				totalBill +=240;
				System.out.println("Chicken Biryani ordered..!");
			} else if(choice == 4){
				totalBill +=240;
				System.out.println("panner Biryani ordered..!");
			} else if(choice == 5){
				System.out.println("order completed!");
			} 
		}while(choice != 5);
		
		if(totalBill >0){
			System.out.println("💰 Your Total Bill is: " + totalBill);
		} else{
			System.out.println("Thank You...!😄 ");
		}
		sc.close();
		
	}
}
