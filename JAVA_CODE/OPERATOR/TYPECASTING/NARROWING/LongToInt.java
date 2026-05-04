// 4. Convert long to int.

class LongToInt{
	
	public static void main(String args[]){
		
		// without narrowing
		// long a = 128;
		// int b = a; // error: incompatible types: possible lossy conversion from long to int
		// System.out.println(b);

		// with narrowing
		long a1 = 127;
		int b1 = (int) a1; // no error
		System.out.println(b1); // 127

	}

}