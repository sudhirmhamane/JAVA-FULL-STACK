import java.util.Scanner;
class BaseToThePower{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		int base = sc.nextInt();
		
		System.out.println("Enter Power: ");
		int power = sc.nextInt();
		int res = 1;

		for(int i=1; i<=power; i++){

			res *= base;	
		}
		System.out.println("base to the power is: " + res);
	}
}