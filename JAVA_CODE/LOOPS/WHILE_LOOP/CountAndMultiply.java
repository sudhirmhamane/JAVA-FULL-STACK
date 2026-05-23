import java.util.Scanner;
class CountAndMultiply{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();

		int temp = num;
		int count = 0;
		int ld = 0;
		int p = 1;
	
		while(num > 0){
			count++;
			for(int i=1; i<=num; i++){
				ld = num % 10;
				p = ld * ld * ld;
				temp /= 10;
			}
			System.out.println("multiplication of count: " + p);
			num /= 10;
		}		
		sc.close();
	}
}	