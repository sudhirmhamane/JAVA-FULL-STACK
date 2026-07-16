class SnakePatternNumber{

	public static void main(String[] args){

		int n = 4;
		int a = 1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i%2!=0)
					System.out.print(a++ +" ");
				else 
					System.out.print(a-- +" ");
			}
			System.out.println();
			if(i%2!=0) a+= (n-1);
			else a+= (n+1);
		}
	}
}