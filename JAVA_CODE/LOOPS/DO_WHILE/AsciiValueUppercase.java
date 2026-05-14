// 25. WAP to print Character of ASCII value in range 65-90

class AsciiValueUppercase{

	public static void main(String [] args){
		
		char ch = 'A';
		do{	

			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;

		}while(ch <= 'Z');
	}

}