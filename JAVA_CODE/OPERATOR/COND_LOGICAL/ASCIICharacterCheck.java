
/*
14)ASCII Character Check 
Input:  ch=’A’ output:- ASCII 
Input ch=’\u0902’ output: NOT ASCII
*/


class ASCIICharacterCheck{

	public static void main(String [] args){
		char ch = '\u0902';
	
		String res = (ch >= 0 && ch <= 127) ? "ASCII " : "NOT ASCII";
		System.out.println(res);
	}
}
// o/p => ASCII