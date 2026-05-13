class ProductOfFirstFiveNum{

	public static void main(String [] args){
		
		int p = 1;
		for(int i=1; i<=5; i++){
			p *= i;
		}
		System.out.println("Product of first Five number is: " + p);
	}
}