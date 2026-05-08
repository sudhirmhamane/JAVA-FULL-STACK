// 1. Calculate income tax based on different tax slabs.


import java.util.Scanner;
class  IncomeTax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yearly sal: ");
		int salPA = sc.nextInt();
		
		sc.close();
		if(salPA <= 250000){
			System.out.println("No tax");
		} else if(salPA <= 500000){
			System.out.println("5% tax");
		} else if(salPA <= 1000000){
			System.out.println("10% tax");
		}
		else if(salPA <= 2000000){
			System.out.println("20% tax");
		} else{
			System.out.println("30% tax");
		}
		
		
	}
}




