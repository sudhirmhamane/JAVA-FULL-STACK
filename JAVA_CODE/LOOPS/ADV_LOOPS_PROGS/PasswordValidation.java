import java.util.Scanner;
class PasswordValidation{

	public static void main(String[] args)throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		int duration = 2000;

		outerLoop:
		while(true){
			int attempt = 3;
			do{
				System.out.println("Enter your Password: ");
				String userPassword = sc.next();
				
				if(userPassword.equals(System.getenv("mypassword"))){
					System.out.println("\n phone unlocked \n");
					break outerLoop;
				}
				attempt--;

				System.out.println("\n Invalid Password \n");
				System.out.println("Attemp left: " + attempt+"\n");
			}while(attempt >= 1);

			System.out.println("\n Phone Disabled " + (duration/1000) + " Seconds \n");
			Thread.sleep(duration);
			duration *=2;
		}
	}
}