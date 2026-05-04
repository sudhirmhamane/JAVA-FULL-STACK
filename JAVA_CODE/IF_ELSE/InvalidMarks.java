// 6)Invalid Marks  (marks < 0 || marks > 100 )

import java.util.Scanner;
class InvalidMarks{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks: ");
		int marks = sc.nextInt();
	
		if(marks < 0 || marks > 100){
			System.out.println("Invalid marks");
		} else{
			System.out.println("valid marks");
		}
	}
}

/*
o/p ->

Enter a marks:
23
valid marks

*/