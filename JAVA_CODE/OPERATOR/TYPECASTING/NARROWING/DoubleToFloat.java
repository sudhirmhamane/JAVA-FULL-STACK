// 5. Convert double to float.

class DoubleToFloat{
	
	public static void main(String args[]){
		
		// without narrowing
		//double a = 128;
		//float b = a; //  error: incompatible types: possible lossy conversion from double to float
		//System.out.println(b);

		// with narrowing
		double a1 = 127;
		float b1 = (float) a1; // no error
		System.out.println(b1); // 127.0

	}

}