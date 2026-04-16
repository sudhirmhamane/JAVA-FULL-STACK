/*

Double Datatype:

	Double is a primitive datatype.
	It's default value is 0.0 .
	It's memory allocation is 8 byte -> 64bits.
	It will help to create double type of container where we can store decimal data.


	byte 	  +   double 	=> 		double
	short 	  +   double 	=> 		double
	int 	  +   double 	=> 		double
	long 	  +   double 	=> 		double
	float 	  +   double 	=> 		fdouble
	double 	  +   double 	=> 		double
	boolean   +   double 	=> 		C.T.E
	char 	  +   double 	=> 		double




*/

class DoubleDemo{

	public static void main(String[] args){
		System.out.println("Max value: " + Double.MAX_VALUE);
		System.out.println("Min value: " + Double.MIN_VALUE);
	}
}

/*

	OUTPUT: 

	Max value: 1.7976931348623157E308
	Min value: 4.9E-324

*/