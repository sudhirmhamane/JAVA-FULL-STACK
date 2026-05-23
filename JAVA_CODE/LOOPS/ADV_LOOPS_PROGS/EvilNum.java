import java.util.Scanner;
class EvilNum{


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = 0;
		int ld = 0;
		int p = 1; int b = 0;

		while(num > 0){
			ld = num % 2;
			b = ld * p + b;
			num /= 2;
			p = p * 10;
		}
		ld = 0;
		
		while(b > 0){
			ld = b % 10;

			if(ld == 1){
				count++;
			}
			b /= 10;
		}
		

		if(count % 2 == 0)
			System.out.println("Even Num");
		else 
			System.out.println("Odd Num");

	}
}