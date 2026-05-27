import java.util.Scanner;
class LCM{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter a Number2: ");
		int num2 = sc.nextInt();

		int max = num1 > num2 ? num1 : num2;
		
		while(true){
			if(max%num1 == 0 && max%num2 == 0){
				break;
			}
			max++;
		}
		System.out.println("LCM is: " + max);

	}
}