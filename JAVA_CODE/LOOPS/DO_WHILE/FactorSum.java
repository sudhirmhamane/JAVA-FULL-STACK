// 28. WAP to print factors sum of given number


import java.util.Scanner;
class FactorSum{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		do{	
			if( num%i == 0){
				sum += i;
			}
			i++;
		}while(i <= num);
		System.out.println("factors sum of num is: " + sum);
		sc.close();
	}

}