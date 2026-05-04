// 4)Multiple of 3 OR 7

class MultipleOfThreeOrSeven{

	public static void main(String args[]){

		int num = 13;

		String res = (num %3 == 0 || num %7 == 0) ? "Yes" : "No";
		System.out.println(res);
	}

}