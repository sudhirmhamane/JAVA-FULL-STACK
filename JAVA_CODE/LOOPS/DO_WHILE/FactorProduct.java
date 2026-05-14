// 32. WAP to print product of factors in a given number

import java.util.Scanner;
class FactorProduct{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		int prod = 1;
		do{	
			if( num%i == 0){
				prod *= i;
			}
			i++;
		}while(i <= num);
		System.out.println("factors prod of num is: " + prod);
		sc.close();
	}

}