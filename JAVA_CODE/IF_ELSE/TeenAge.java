import java.util.Scanner;
class TeenAge{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age = sc.nextInt();
	
		if((age >= 20)){
			System.out.println("NOT TEEN AGE");
		} else{
			System.out.println("TEEN AGE");
		}
	}
}

/*

o/p -> 

Enter a age:
23
NOT TEEN AGE
*/
