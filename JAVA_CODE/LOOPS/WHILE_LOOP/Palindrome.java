import java.util.Scanner;
class Palindrome{

	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int ld  = 0;
		int temp = num;
		int rev = 0;
	
		while(num != 0){
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;			
		}
		if(temp == rev){
			System.out.println("palindrome");
		} else {
			System.out.println("Not");
		}
		sc.close();
	}
}