// 6. Convert char to byte.

class CharToByte{
	
	public static void main(String args[]){
		
		// without narrowing
		//char a = 'a';
		//byte b = a; // error: incompatible types: possible lossy conversion from char to byte
		//System.out.println(b);

		// with narrowing
		char a1 = 127;
		byte b1 = (byte) a1; // no error
		System.out.println(b1); //  127

	}

}