class LongDemo1{

	public static void main(String[] args){
		/*
			byte 	  +   long 	=> 		long
			short 	  +   long 	=> 		long
			int 	  +   long 	=> 		long
			long 	  +   long 	=> 		long
			float 	  +   long 	=> 		float
			double 	  +   long 	=> 		double
			boolean   +   long 	=> 		C.T.E
			char 	  +   long 	=> 		long


			When we are using long datatype to store data then 
			it is optional to write or use 'l' or 'L' to suffix of long datatype.

		
		*/

		byte a = 20;
		long b = 10;
		long c = a - b;
		System.out.println(c);

		short d = 30;
		long e = 10;
		long f = d - e;
		System.out.println(f);

		int g = 40;
		long h = 20;
		long i = g - h;
		System.out.println(i);

		long j = 50; 
		long k = 10;
		long l = j - k;
		System.out.println(l);

	}
}