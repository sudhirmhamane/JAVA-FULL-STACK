class NumberProgram4{

	public static void main(String[] args){

		int n = 3;
		int a = 1;
		for(int i=n*n; i>=1; ){

			
			for(int j=1; j<=n; j++){
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}