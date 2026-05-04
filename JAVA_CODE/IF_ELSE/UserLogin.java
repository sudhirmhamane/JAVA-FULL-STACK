// 9)Check login where:  username correct  password wrong


import java.util.Scanner;
class UserLogin{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username(true or false): ");
		boolean username = sc.nextBoolean();
		
		System.out.println("Enter a password(true or false): ");
		boolean password = sc.nextBoolean();
	
		if(username == true && password == true){
			System.out.println("User Login Successfully");
		} else {
			System.out.println("username or password is wrong!");

		}
		
		sc.close();
		
	}
}