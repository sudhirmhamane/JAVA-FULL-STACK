class NumberProgram2{

	public static void main(String[] args){

		int n = 4;
		
		for(int i=1; i<=n; i++){

			int a = 1;
			for(int j=1; j<=n; j++){
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}