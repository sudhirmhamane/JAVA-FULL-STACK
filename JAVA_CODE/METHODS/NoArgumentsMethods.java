import java.util.Scanner;

class NoArgumentsMethods{

	static String str;
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str = sc.next();

		System.out.println("str before: " + str);
		//toUpperCase();
		toLowerCase();
		System.out.println("str after: " + str);

	}

	public static void toUpperCase(){
		String newStr = "";
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
	
			if(ch>=97 && ch<=122){
				newStr += (char)(ch-32);
			}else{
				newStr += ch;
			}
		}
		str = newStr;
	}


	public static void toLowerCase(){
		String newStr = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);

			if(ch>=65 && ch<=97){
				newStr += (char)(ch + 32);
			} else {
				newStr += ch;
			}
		}
		str = newStr;
	}
}












