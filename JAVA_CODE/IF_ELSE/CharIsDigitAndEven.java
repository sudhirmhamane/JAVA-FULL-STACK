// 20)Check if char is digit AND even 


import java.util.Scanner;
class CharIsDigitAndEven{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch>= '0' && ch <= '9') && (ch %2 == 0)){ 
			System.out.println("char is digit AND even.");
		} else{
			System.out.println("char is not digit");
		}
		sc.close();
		
	}
	
}