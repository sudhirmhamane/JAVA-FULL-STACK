// 3. Print even numbers (1–20) using division operator

class PrintNumByDivOp{

	public static void main(String [] args){
		
		int i = 1;
		do{	
			if((i/2.0) == (i/2)){
				System.out.println("i: "+ i);
			}
			i++;

		}while(i < 20);
	}

}