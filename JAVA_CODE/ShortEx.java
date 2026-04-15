class ShortEx{
	public static void main(String[]args){
		short a = 10;
		//byte b = a;// error: incompatible types: possible lossy conversion from short to byte
		int c = a;
		System.out.println(c);
		long d = a;
		System.out.println(d);
		float e = a;
		System.out.println(e);
		double f = a;
		System.out.println(f);
		// char g = a; // error: incompatible types: possible lossy conversion from short to char
		// boolean h = a; // incompatible types: short cannot be converted to boolean 
	}
}