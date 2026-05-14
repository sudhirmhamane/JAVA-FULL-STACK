// 13. product of first 5 even numbers

class ProductOfFirstFiveEvenNum{

	public static void main(String [] args){
		
		int prod = 1;
		int i = 1;
		do{	
			if(i%2 == 0){
				prod *= i;
			}
			i++;

		}while(i <= 5);
		System.out.println("Product of First Five Even number is: " + prod);
	}

}