// 24. WAP to print Character of ASCII value in range 48-57

class DigitAsciiValueChar{

	public static void main(String [] args){
		
		char ch = '0';
		do{	

			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;

		}while(ch <= '9');
	}

}