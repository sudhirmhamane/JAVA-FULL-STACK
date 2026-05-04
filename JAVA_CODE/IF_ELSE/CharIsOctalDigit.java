// 21)Check if char is octal digit 


import java.util.Scanner;
class CharIsOctalDigit{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if(ch >= '0' && ch <= '7'){ 
			System.out.println("char is octal digit");
		} else{
			System.out.println("char is not octal digit");
		}
		sc.close();
		
	}
	
}