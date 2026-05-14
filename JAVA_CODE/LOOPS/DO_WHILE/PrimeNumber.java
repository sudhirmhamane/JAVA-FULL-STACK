// 19. Check palindrome number

import java.util.Scanner;
class PrimeNumber{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = 0;
		int i = 1;
		do{	
			if(num % i == 0){
				count++;
			}
			i++;
		}while(i <= num);
		if(count == 2){
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		sc.close();
	}
}