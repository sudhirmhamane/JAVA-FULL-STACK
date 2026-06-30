import java.util.Arrays;
import java.util.Scanner;

class Example32{

	static String str;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Str: ");
		str = sc.next();
		System.out.println(str);
		char ch[] arr1 = toCharArray();
		System.out.println(arr1);
	}

	public static char[] toCharArray(){
		char []arr = new char[str.length()];

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			arr[i] = ch;
		}
		return arr;
	}
}