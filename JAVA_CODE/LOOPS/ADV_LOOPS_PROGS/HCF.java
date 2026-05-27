import java.util.Scanner;
class HCF{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter a Number2: ");
		int num2 = sc.nextInt();

		int min = num1 < num2 ? num1 : num2;
		int hcf = 1;

		for(int i = 1; i<=min; i++){
			if(num1%i == 0 && num2%i == 0){
				hcf = i;
			}
		}
		System.out.println("HCF is: " + hcf);

	}
}