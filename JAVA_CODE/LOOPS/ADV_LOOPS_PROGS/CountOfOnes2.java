// wap to find sum of all 1's in given number


import java.util.Scanner;
class CountOfOnes2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int binary
		int count = 0;
		int ld = 0;

		while(num > 0){

			ld = num%2;
			binary = ld * place + binary;
			num /= 2;
			place = place * 10;
		}

		while(num > 0){
			ld = num %2;
			
			if(ld == 1){
				count++;
			}
			num /= 2;
		}
		System.out.println(count);

	}
}