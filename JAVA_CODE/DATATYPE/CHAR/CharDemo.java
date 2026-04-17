/*

	CHAR dATATYPE:

	It is a primitive datatype.
	It's default value is \u0000 or null.
	Memory allocation is 2 byte i.e 16 bit.
	It will help us to create charactor type of container where we can store charactors.
	
	---

	In java each and every character us having fixed integer valaue called as ASCII value.
	ASCII stands for 'American standard code information interchange'.
	we were having 128 ASCII value which will start from 0 to 127.
	ASCII value of uppercase char is 65 - 90
	ASCII value of lowercase char is 97 - 122
	ASCII value of char digits is 48 to 57
	
	---

	ASCII is having a limited characters
	ASCII will support only English character
	In Java, we can also write or store other language characters because java support Unicode
	
	Syntax of Unicode:
	/uxxxx	
	x-> 0-9 or A-F/a-f
	
	In java, char support Unicode and it will store 65536 character
	The range of char in java is 0 to 65355 or in Unicode \u0000 to \uFFFF
	All 65536 Unicode character is having their own unique integer value.

	To store all Unicode char 1 byte memory is not sufficient that's why java char datatype
	is having 2 byte of memory.


*/

class CharDemo{

	public static void main(String args[]){

		char ch = '\u0041';
		System.out.println("ch:" + ch);

		char ch1 = '\u0042';
		System.out.println("ch1:" + ch1);

		char ch2 = '\u0905';
		System.out.println("ch2:" + ch2);

		char ch3 = '\u0906';
		System.out.println("ch3:" + ch3);
		

	}

}








