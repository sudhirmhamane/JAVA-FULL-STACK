/*
	Double datatype can store upto 15/16(depends of jvm) decimal value 
	and onces it is cross 15/16 decimal value then it will do the
	roundoff.

	When we are using double datatype then it is optional to suffix value wit
	'd' and 'D'.

	When we are writing decimal data in java then by default it is considered as double
	type of data, that's why it is optional to suffix value with 'd' or 'D'.

	----

	Q. WHY THE DOUBLE TAKING ONLY 15/16 DIGITS?

	->
	1. Internally JVM will distribute 64 bytes into multiple parts.
		1 bit-> sign(+/-)
		11 bit -> exponent
		52 bit -> Mantissa
	2. Mantissa is responsible to store decimal data in memory.
	3. 52 bit mantissa jvm can store 15 decimal value.

*/

class DoubleDemo1{
	public static void main(String args[]){
		double data = 10.1;
		System.out.println(data);

		double data1 = 20.0D; //optional, jvm treat every decimal value as double by default.
		System.out.println(data1);

		double data2 = 30.0D;
		System.out.println(data2);
		
	}
}