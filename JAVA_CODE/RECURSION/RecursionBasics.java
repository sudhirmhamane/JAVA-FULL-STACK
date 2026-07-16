/*
class RecursionBasics{

	static int num = 1;

	public static void main(String [] args){
		printNumber();
	}
	public static void printNumber(){

		System.out.print(num+ " ");
		if(num++ == 10) return;
		printNumber();
	}
}
/*


/*
class RecursionBasics{
	
	public static void main(String[]args){
		printNumber(1);
	}
	
	public static void printNumber(int num){
		System.out.print(num+" ");
		if(num++ == 10) return;
		printNumber(num);
	}
}

*/

/*

class RecursionBasics{
	static char ch = 'A';

	public static void main(String[]args){
		printAlphabets();
	}	

	public static void printAlphabets(){
		System.out.print(ch+" ");
		if(ch++ == 'Z') return;
		printAlphabets();
	}

}
*/


/*
class RecursionBasics{

	public static void main(String[]args){
		printAlphabets('A');
	}	

	public static void printAlphabets(char ch){
		System.out.print(ch+" ");
		if(ch++ == 'Z') return;
		printAlphabets(ch);
	}

}

*/

/*
import java.util.Scanner;
class RecursionBasics{
	static int fact = 1;

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		findFactorial(num, 1);
		System.out.println(num + " : "+ fact);

	}	

	public static void findFactorial(int num, int i){
		fact = fact * i;
		if(i++ == num) return;
		findFactorial(num, i);
	}

}
*/

/*

class RecursionBasics{
	public static void main(String[]args){
		int num = 5;
		int fact = findFactorial(num, 1, 1);
		System.out.println(num+ " : " + fact);
	}	

	public static int findFactorial(int num, int i, int op){
		if(i > num) return op;
		op = op * i;
		return findFactorial(num, ++i, op);
	}

}

*/
/*
class RecursionBasics{
	public static void main(String[]args){
		int num = 1234;
		int rev = reverseNumber(num, 0);
		System.out.println(num+ " : " + rev);
	}	

	public static int reverseNumber(int num, int rev){

		if(num == 0) return rev;
		rev = rev * 10 + (num%10);
		return reverseNumber(num/10, rev);
	}

}*/

/*

class RecursionBasics{
	public static void main(String[]args){
		evenNum(1);
	}	

	public static void evenNum(int num){

		if(num%2==0){
			System.out.println   (num + " ");
		}
		if(num++ == 100) return;
		evenNum(num);
	}

}*/



class RecursionBasics{
	public static void main(String[]args){
		int num = 5555;
		int sum = sumOfDigit(num, 0);
		System.out.println(num + " : " + sum);
	}	

	public static int sumOfDigit(int num, int sum){

		if(num == 0) return sum;
		sum += num % 10;
		return sumOfDigit(num/10, sum);
	}

}




