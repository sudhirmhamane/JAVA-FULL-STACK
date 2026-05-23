// wap to find sum of all 1's in given number


import java.util.Scanner;
class SumOfOnes{
	
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
		int nld = 0;

		for(int i=1; i<= binary; i++){
			nld = binary % 10;
			
			if(nld == 1){
				sum += nld;
			}
			binary /= 10;
		}
		System.out.println("Sum of all 1's is: " + sum);
		


	}
}