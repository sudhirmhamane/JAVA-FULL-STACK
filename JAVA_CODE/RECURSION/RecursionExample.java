import java.util.Scanner;
class RecursionExample{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String op = isPrime(num,2)?num+ " prime ": num +" is not prime";
		System.out.println(op);
	}

	//public static boolean isPrime(int num, int i){
		//if(num<2) return false;
		//if(i > num/2) return true;
		//if(num%i == 0) return false;
		//return isPrime(num, ++i);
	//}

	public static boolean isPrime(int num, int i){

		if(num <  2 || num%i==0 && num!=2) return false;
		if(i > num/2) return true;
		return isPrime(num, ++i);
	}
}