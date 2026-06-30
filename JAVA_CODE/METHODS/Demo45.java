import java.util.Scanner;

class Demo45{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		System.out.println(evenOrOdd(5));
	}
	
	public static boolean evenOrOdd(int num){

		if(num % 2 == 0){
			return true;
		} else {
			return false;
		}
	}
}