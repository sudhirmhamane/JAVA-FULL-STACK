class LargestOfThree{

	public static void main(String[] args){
		int a = 45;
		int b = 34;
		int c = 23;
		int d = 99;

		//int res = (a>b && a>c ) ? a : (b>c ? b : c);
		int res = (a>b && a>c && a>d) ? a : ((b>c && b>d) ? b : (c>d) ? c : d);
		System.out.println(res);
	}
}