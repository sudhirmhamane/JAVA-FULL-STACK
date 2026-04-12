class ShortEx{
	public static void main(String[]args){
		short a = 10;
		//byte b = a;// error: incompatible types: possible lossy conversion from short to byte
		int c = a;
		long d = a;
		float e = a;
		double f = a; 
		//char g = a; // error: incompatible types: possible lossy conversion from short to char
		//boolean h = a; // incompatible types: short cannot be converted to boolean
		
	}
}