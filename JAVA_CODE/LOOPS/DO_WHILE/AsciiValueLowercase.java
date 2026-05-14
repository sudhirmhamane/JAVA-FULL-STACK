// 26. WAP to print Character of ASCII value in range 97-122

class AsciiValueLowercase{

	public static void main(String [] args){
		
		char ch = 'a';
		do{	

			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;

		}while(ch <= 'z');
	}

}