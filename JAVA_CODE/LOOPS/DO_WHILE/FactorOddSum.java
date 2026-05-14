// 30. WAP to print only sum of odd factors in a given number



import java.util.Scanner;
class FactorOddSum{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		do{	
			if( (num%i == 0) && (i%2 != 0)){
				sum += i;
			}
			i++;
		}while(i <= num);
		System.out.println("factors sum of odd num is: " + sum);
		sc.close();
	}

}