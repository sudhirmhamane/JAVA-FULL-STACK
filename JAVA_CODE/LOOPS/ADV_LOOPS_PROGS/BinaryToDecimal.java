import java.util.Scanner;
class BinaryToDecimal{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int d = 0;
		int ld = 0;
		int place = 1;

		while(num > 0){

			ld = num%10;
			d = ld * place + d;
			num /= 10;
			place = place * 2;
		}
		System.out.println(d);
	}
}