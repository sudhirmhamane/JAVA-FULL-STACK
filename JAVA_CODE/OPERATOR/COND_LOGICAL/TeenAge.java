/*
11)Teen Age (13–19) 
Input: age=20 output: NOT TEEN AGE
Input: age=17 output: TEEN AGE
*/

class TeenAge{

	public static void main(String [] args){
		int age = 19;
		String res = (age >= 20) ? "NOT TEEN AGE" : "TEEN AGE";
		System.out.println(res);
	}
}
// o/p => TEEN AGE