// 7. Convert int to short.

class IntToShort{
	public static void main(String[] agrs){
		// without narrowing
		//int a = 100;
		//short b = a; // error: incompatible types: possible lossy conversion from int to short
		//System.out.println(b);

		// with narrowing
		int a1 = 127;
		short b1 = (byte) a1; // no error
		System.out.println(b1); //  127
		
	}
}