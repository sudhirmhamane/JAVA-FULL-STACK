// 15. Multiply double and float, store in int.

class MulDoubleAndFloatStoreInt{
	
	public static void main(String[] args){

		double d = 12.34;
		float f = 100.0f;

		int sum = (int) (d+f);
		System.out.println(sum); // o/p => 112
	}
}