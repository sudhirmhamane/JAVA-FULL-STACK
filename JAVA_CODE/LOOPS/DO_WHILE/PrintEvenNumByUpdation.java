// 5. Print even numbers (1–10) using updation statement

class PrintEvenNumByUpdation{

	public static void main(String [] args){
		
		int i = 2;
		do{	
			if((i/2.0) == (i/2)){
				System.out.println("i: "+ i);
			}
			i+=2;

		}while(i < 10);
	}

}