import java.util.Scanner;
class ProductOfOddNum{

	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int p = 1;
	
		for(int i=1; i<=num; i++){
			if(i%2 != 0){
				p *= i;
			}
		}
		System.out.println("product of odd num: " + p);
	}
}