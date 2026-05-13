class OddByDivOneToTwenty{

	public static void main(String [] args){
		
		int i = 1;
		while(i<=20){
			if((i/2.0) != (i/2)){
				System.out.println("Odd nums: " + i);
			}
		i++;
		}
	}
}