
// 12. Categorize internet speed into Slow, Moderate, Fast, Ultra-Fast.
import java.util.Scanner;
class InternetSpeed 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Speed in MBPS: ");
		int speed = sc.nextInt();

		sc.close();
		if(speed <= 2)
			System.out.println("Slow");
		else if(speed <= 5)
			System.out.println("Moderate");
		else if(speed <= 10)
		   System.out.println("Fast");
		else
			System.out.println("Ultra-Fast");

	}
}

/*

o/p:

Enter Speed in MBPS:
12
Ultra-Fast

*/