/*
15)Eligible to Marry
Input: 15 output: not eligible
Input: 20 output: eligible
*/

class EligbleToMarry{

	public static void main(String [] args){
		int a = 15;
		
		String res = a > 18 ? "eligible" : "not eligible";
		System.out.println(res);
	}
}