class ProductOfFirstFiveEvenNum{

	public static void main(String [] args){
		
		int p = 1;
		for(int i=1; i<=5; i++){
			if(i %2 == 0){
				p *= i;
			}
			
		}
		System.out.println("Product of first Five even number is: " + p);
	}
}