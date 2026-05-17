import java.util.Scanner;

class FactorsProduct{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int prod = 1;
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				prod *= i;
			}
		}
		System.out.println("Product of factors of given num is: " + prod);
	}
}