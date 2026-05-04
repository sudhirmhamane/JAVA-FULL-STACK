/*
2) Even OR Divisible by 5
Condition: num % 2 == 0 || num % 5 == 0

Input: num = 10 → Output: True (even & divisible by 5)
Input: num = 7 → Output: False (not even, not divisible by 5)
*/


import java.util.Scanner;
class EvenOrDivisibleBy5{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if((num % 2 == 0 || num % 5 == 0)){
			System.out.println("even or divisible by 5");
		} else{
			System.out.println("not even, not divisible by 5");
		}
	}
}

/*
Enter a number:
125
even or divisible by 5
*/