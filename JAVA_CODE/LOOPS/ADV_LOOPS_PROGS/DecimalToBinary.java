import java.util.Scanner;
class DecimalToBinary{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int binary = 0;
		int sum = 0;
		int ld = 0;
		int place = 1;

		while(num > 0){

			ld = num%2;
			binary = ld * place + binary;
			num /= 2;
			place = place * 10;
		}
		System.out.println(binary);
	}
}