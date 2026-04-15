class IntegerDemo1{
	public static void main(String[] args){

		// when we are using the byte+int datatypes so always we have to store the value in int only
		/*
			byte 	  +   int 	=> 		int
			short 	  +   int 	=> 		int
			int 	  +   int 	=> 		int
			long 	  +   int 	=> 		long
			float 	  +   int 	=> 		float
			double 	  +   int 	=> 		double
			boolean   +   int 	=> 		C.T.E
			char 	  +   int 	=> 		int
		
		*/

		// otherwise it will give the compile time error for possible lossy conversion byte to int.
		byte a = 10; 
		int b = 20;
		int c = a + b;
		System.out.println(c);

		short d = 20;
		int e = 34;
		int f = d + e;
		System.out.println(f);

		int g = 30;
		int h = 23; 
		int i = g + h;
		System.out.println(i);

	}
}