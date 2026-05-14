// 28. WAP to print factors of given number


import java.util.Scanner;
class Factors{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		do{	
			if( num%i == 0){
				System.out.println("factors of given num:  " +i);
			}
			i++;
		}while(i <= num);
		sc.close();
	}

}