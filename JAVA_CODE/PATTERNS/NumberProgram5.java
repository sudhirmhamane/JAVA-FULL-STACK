class NumberProgram5{

	public static void main(String[] args){

		int n = 3;
		int a = n*n;
		for(int i=1; i<=n; i++){

			
			for(int j=1; j<=n; j++){
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}