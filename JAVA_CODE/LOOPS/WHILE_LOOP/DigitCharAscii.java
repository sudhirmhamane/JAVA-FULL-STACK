class DigitCharAscii{

	public static void main(String[] args){

		char ch = '0';
		while(ch <= '9'){
			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;
		}
	}
}