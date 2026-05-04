// 5)Single Digit OR Two Digit 

class SingleDigitOrTwoDigit{

	public static void main(String[] args){

		int num = -90;
	
		String res = (num >=-9 && num <=9) ? "single digit" : "Two digit";
		System.out.println(res);

	}
}