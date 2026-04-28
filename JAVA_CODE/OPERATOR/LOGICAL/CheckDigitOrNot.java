class CheckDigitOrNot{
	public static void main(String args[]){

		char ch = '8';
			
		// String res = (ch >= 48 && ch <= 57) ? "Digit" : "Not Digit";
		String res = (ch >= '0' && ch <= '9') ? "Digit" : "Not Digit";
		System.out.println(res);
	}
}