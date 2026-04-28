/*
10)Working Day (1–5)  (condition day >= 1 && day <= 5 )
Input: day= 3  output: working day
Input: day= 8 output: NOT WORKING DAY
*/

class WorkingDay{

	public static void main(String [] args){
		int day = 4;
		String res = (day >= 1 && day <= 5) ? "working day" : "NOT WORKING DAY";
		System.out.println(res);
	}
}
// o/p => working day