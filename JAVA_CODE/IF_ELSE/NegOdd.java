// 3)Check Negative Odd Number


import java.util.Scanner;
class NegOdd{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num < 0 &&  num%2!=0)){
			System.out.println("Neg Odd Num");

		} else{
			System.out.println("NOT Neg Odd Num");

		}
	}
}

