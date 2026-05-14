// 7. Print odd numbers (1–10) using mod operator

class PrintOddNumByMod{

	public static void main(String [] args){
		
		int i = 1;
		do{	
			if(i%2 != 0){
				System.out.println("i: "+ i);
			}
			i++;

		}while(i < 10);
	}

}