// 35. WAP to find base to the power 


import java.util.Scanner;
class BaseToPower{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base = sc.nextInt();

		System.out.println("Enter power: ");
		int power = sc.nextInt();
		int res = 1;
		int i = 1;
		do{
			res = res * base;
			i++;
		}while(i <= power);
		                                                       
		System.out.println(base + " to the power " + power + " is: " + res);
		sc.close();
	}
}