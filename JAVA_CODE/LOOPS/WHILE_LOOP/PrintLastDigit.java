import java.util.Scanner;

class Ld{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int ld = 0;


		while(num != 0){
		
			ld = num % 10;
			System.out.println("last digit: " + ld);
			num /= 10;
		}
		sc.close();
				
	}

}