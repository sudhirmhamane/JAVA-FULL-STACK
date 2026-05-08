// 7. Determine loan eligibility based on salary range

import java.util.Scanner;
class Loan{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		
		sc.close();
		if(salary <= 18000){
			System.out.println("40000 RS Loan can get");
		} else if(salary <= 30000){
			System.out.println("60000 RS Loan can get");
		} else if(salary <= 50000){
			System.out.println("100000 RS Loan can get");
		} else if(salary <= 100000){
			System.out.println("150000 RS Loan can get");
		} else{
			System.out.println("300000 RS Loan can get");
		}
	}
}

/*

o/p: 

Enter Weight:
20
35 per Kg

*/
