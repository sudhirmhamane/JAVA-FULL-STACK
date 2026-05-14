class UppercaseAscii{

	public static void main(String[] args){

		char ch = 'A';
		while(ch <= 'Z'){
			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;
		}
	}
}