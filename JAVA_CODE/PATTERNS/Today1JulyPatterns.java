
/*
class PatternsStarOne{

	public static void main(String [] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i == j) System.out.print("1 ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
}

1 * * * *
* 1 * * *
* * 1 * *
* * * 1 *
* * * * 1
*/

/*
class PatternsStarOne{

	public static void main(String [] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i+j == (n+1)) System.out.print("1 ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
}

* * * * 1
* * * 1 *
* * 1 * *
* 1 * * *
1 * * * *
*/

/*
class Today1JulyPatterns{

	public static void main(String [] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if((i+j == (n+1)) && (i == j)) System.out.print("1 ");
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/

/*
class PatternsStarOne{

	public static void main(String [] args){
		int n = 4;
		int a = 1;
		char ch = 'a';
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j%2!=0) System.out.print(a++ +" ");
				else System.out.print((char) ch++ +" ");
			}
			System.out.println();
		}
	}
}

1 a 2 b
3 c 4 d
5 e 6 f
7 g 8 h

*/

/*
class Today1JulyPatterns{

	public static void main(String [] args){
		int n = 5;
		for(int i=1; i<=n; i++){
			int a = i;
			for(int j=1; j<=n; j++){
				System.out.print((a+= n) +" ");
				if(a<=9) System.out.print(" ");
			}
			System.out.println();
		}
	}
}

1  6  11 16 21
2  7  12 17 22
3  8  13 18 23
4  9  14 19 24
5  10 15 20 25
*/


class Today1JulyPatterns{

	public static void main(String [] args){
		int n = 5;
		int a = (n*2) - 1, b = 1;
		for(int i=1; i<=n; i++){
			int c = i;
			for(int j=1; j<=n; j++){
				if(j%2!=0){ 
					System.out.print(c+" ");
					if(c<=9) System.out.print(" ");
					c+=a;
				} else {
					System.out.print(c+" ");
					if(c<=9) System.out.print(" ");
					c+= b;
				}
			}
			a-= 2;
			b+= 2;
			System.out.println();
			
			
		}
	}
}





