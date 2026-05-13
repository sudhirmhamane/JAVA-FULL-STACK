import java.util.Scanner;
class Arithmetic{

	public static void main(String [] args){
		
		boolean flag = true;
		while(flag){
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Addition \n 2.Substraction \n 3.Exit ");
			int choice = sc.nextInt();
	
			switch(choice){
				case 1:{
					System.out.println("Enter 1st Number: ");
					int num1 = sc.nextInt();
					System.out.println("Enter 2nd Number: ");
					int num2 = sc.nextInt();
					int res1 = num1 + num2;
					System.out.println("Addition of: " + num1 + " and " + num2 + " is : " +  res1);
				}
				break;
					
				case 2:{
					System.out.println("Enter 1st Number: ");
					int num3 = sc.nextInt();
					System.out.println("Enter 2nd Number: ");
					int num4 = sc.nextInt();
					int res = num3 - num4;
					System.out.println("Substraction of: "+ res);
				}
				break;
				
				case 3:{
					System.out.println("Do you really wants to exits? 1.Yes \n Press anyother number to continue");
					int exit = sc.nextInt();
					if(exit == 1){
						flag = false;
						System.out.println("Thank you!✌️✌️");
						System.out.println("Visit Again👍👍");
					}
				}
				break;
				
				default:{
					System.out.println("Invalid choice");
				}
			}
		}
	}
}



