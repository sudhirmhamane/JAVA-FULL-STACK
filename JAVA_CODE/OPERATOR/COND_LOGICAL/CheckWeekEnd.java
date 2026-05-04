// 7)Weekend Check  (day == 6 || day == 7 )

class CheckWeekEnd{

	public static void main(String[] args){
		int day = 5;
		
		String res = (day == 6 || day ==7)? "Week End" : "Not Week End";
		System.out.println(res);
	}
}