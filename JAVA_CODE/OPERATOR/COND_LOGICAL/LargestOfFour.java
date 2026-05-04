import java.util.Scanner;
class LargestOfFour{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Four Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
	
		int res = (a>b && a>c && a>d) ? a : ( (b>c && b>d) ? b : (c>d ? c : d) );
		System.out.println("Largest Of Among four is: " + res);

		System.out.println("Enter only 8 digit num: ");
		int num = sc.nextInt();

		int first = num/10000000; //1
		int mid = (num%10000000)/10;//234567
		int last = num % 10;//8
	
		int swap = last * 10000000 + mid * 10 + first;
		System.out.println(swap);
		sc.close();
		
		// System.out.println("Enter any two numbers: ");
		// int num1 = sc.nextInt(); // 6
		// int num2 = sc.nextInt(); // 3  3

		// int sub = (num1/num2)/(num1/num2);
		// System.out.println(sub);
			  
	}
	
}