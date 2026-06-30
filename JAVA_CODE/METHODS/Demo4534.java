import java.util.Scanner;

class Demo4534{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: " );
		int num = sc.nextInt();
		String words = numberToWords(num);
		System.out.println(num+ " : " + words);
	}

	public static String numberToWords(int num){
		String words = "";
		
		while(num !=0){
			int rem = num%10;
			words = switch(rem){
				case 1 -> "One " +words;
				case 2 -> "Two " +words;
				case 3 -> "Three " + words;
				case 4 -> "Four " + words;
				case 5 -> "Five " + words;
				case 6 -> "Six " + words;
				case 7 -> "Seven " + words;
				case 8 -> "Eight " + words;
				case 9 -> "Nine " + words;
				case 0 -> "Zero " + words;
				default -> words;
			};
			num /= 10;
		}
		return words;
	}
}