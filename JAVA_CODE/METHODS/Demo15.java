
class Demo15{

	public static void main(String[] args){

		int a = 15, b = 20, c = 30;
		System.out.println(min(a,b));
		System.out.println(min(a,b,c));


	}

	public static int min(int a, int b, int c){
		return a<b?a<c?a:c:b<c?b:c;
	}

	
	public static int min(int a, int b){
		return a<b? a : b;
	}
}