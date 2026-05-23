// wap to print first and second half in a given number.


import java.util.Scanner;
class PrintFAndSHalf{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;

		while(num > 0){

			count++;
			num /= 10;
		}
		num = temp;

		if(count %2 == 0){

			int mult = 1;
			for(int i=1; i<=count/2; i++){
				mult = mult * 10;
			}

			int fh = num % mult;
			System.out.println(fh);

			int sh = num / mult;
			System.out.println(sh);

		} else{
			System.out.println("Invalid number");
		}
	}

}