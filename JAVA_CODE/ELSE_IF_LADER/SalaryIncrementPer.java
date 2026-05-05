
// 13. Determine salary increment percentage based on performance rating.
import java.util.Scanner;
class SalaryIncrementPer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Performance Ratings(out of 10): ");
		int ratings = sc.nextInt();
		
		if(ratings <= 3){
			System.out.println("salary increment percentage is: 20%");
		} else if(ratings <= 5){
			System.out.println("salary increment percentage is:30%");
		} if(ratings <= 7){
			System.out.println("salary increment percentage is: 50%");
		} if(ratings <= 8){
			System.out.println("salary increment percentage is: 65%");
		} else {
			System.out.println("salary increment percentage is: 85%");
		}
	}
}

/*
o/p:

Enter Performance Ratings(out of 10):
9
salary increment percentageis: 85%
*/