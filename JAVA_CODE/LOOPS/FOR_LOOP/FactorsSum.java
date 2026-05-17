import java.util.Scanner;

class FactorsSum{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		System.out.println("Sum of factors of given num is: " + sum);
	}
}