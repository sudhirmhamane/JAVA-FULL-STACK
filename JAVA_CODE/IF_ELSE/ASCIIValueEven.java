// 19)Check if ASCII value is even 


import java.util.Scanner;
class ASCIIValueEven{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if((ch %2 == 0)){
			System.out.println("ASCII value is even ");
		} else{
			System.out.println("ASCII value is not even");
		}
		sc.close();
		
	}

}