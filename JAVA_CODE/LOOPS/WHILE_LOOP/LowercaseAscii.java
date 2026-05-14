class LowercaseAscii{

	public static void main(String[] args){

		char ch = 'a';
		while(ch <= 'z'){
			System.out.println("Ascii Value of: " + ch + " is: " + ((int) ch));
			ch++;
		}
	}
}