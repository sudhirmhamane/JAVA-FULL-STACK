// 11. Age based ticket price
import java.util.Scanner;
class AgeBasedTicket 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();

		sc.close();
		if(age < 12)
			System.out.println("Child Ticket");
		else if(age <= 60)
			System.out.println("Adult Ticket");
		else
			System.out.println("Senior Citizen Discount");

	}
}


/*

o/p:

Enter Age:
23
Adult Ticket

*/