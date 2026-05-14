// 16. Multiplication table of a given number

import java.util.Scanner;
class MultiplicationTable{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
	
		int i = 1;
		do{	
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}while(i <= 10);
		sc.close();
	}

}