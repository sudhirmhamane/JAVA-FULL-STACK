import java.util.Scanner;

class Demo1233{


	static int num;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num: ");
		num = sc.nextInt();
		int reverse = reverseNum();
		System.out.println("Reverse num: " + reverse);
	}

	public static int reverseNum(){

		int rev = 0;
		while(num != 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}

		return rev;
	}
}