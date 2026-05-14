// 11. Sum of first 10 odd numbers

class SumOfFirstTenOddNum{

	public static void main(String [] args){
		
		int sum = 0;
		int i = 1;
		do{	
	
			if(i%2 != 0){
				sum += i;
			}
			
			i++;

		}while(i <= 10);
		System.out.println("Sum is: " + sum);
	}

}