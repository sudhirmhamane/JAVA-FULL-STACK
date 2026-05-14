// 34. WAP to print product of odd digit in a given number

import java.util.Scanner;
class OddProduct{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		int prod = 1;
		do{	
			if( i%2 != 0){
				prod *= i;
			}
			i++;
		}while(i <= num);
		System.out.println("product of even digit in a given number: " + prod);
		sc.close();
	}

}