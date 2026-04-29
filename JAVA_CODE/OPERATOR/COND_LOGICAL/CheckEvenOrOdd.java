// check given number is even or odd by not operator

class CheckEvenOrOdd{

	public static void main(String[] args){
		int num = 69;
		// String res = !(num%2==0)? "Odd": "Even";
		String res = !(num%2!=0)? "EVEN" : "ODD";
		System.out.println(res);
	}
}