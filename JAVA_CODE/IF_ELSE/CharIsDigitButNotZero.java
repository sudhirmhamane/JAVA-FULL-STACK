// 7)Check if char is digit but not '0' 


import java.util.Scanner;
class CharIsDigitButNotZero{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if( ch > '0' && ch <= '9'){
			System.out.println(ch + " is a digit");
		} else {
			System.out.println(ch + " is not a digit");
		}
		sc.close();
	}
}