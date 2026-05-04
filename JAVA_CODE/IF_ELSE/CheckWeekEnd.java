// 7)Weekend Check  (day == 6 || day == 7 )

import java.util.Scanner;
class CheckWeekEnd{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day: ");
		int day = sc.nextInt();
	
		if(day == 6 || day ==7){
			System.out.println("Week End");
		} else{
			System.out.println("Not Week End");
		}
	}
}

/*

Enter a day:
4
Not Week End

*/