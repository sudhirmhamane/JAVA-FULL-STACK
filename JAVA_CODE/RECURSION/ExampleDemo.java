import java.util.Scanner;

class ExampleDemo{

	static Scanner sc = new Scanner(System.in);
	static int num = reverseNumber(sc.nextInt());
	
	public static void main(String[] args){
		System.out.println("main starts");
		System.out.println("num: " +num);
	}

	public static int reverseNumber(int num){
		System.out.println("reverse number");
		int rev = 0;
		while(rev != 0){
			rev = rev * 10 + (num%10);
			num /= 10;
		}

		return rev;
	}
}