import java.util.Scanner;
class MissingDigits{


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		for(int i=0; i<=9; i++){
			int ld = 0;
			boolean flag = true;
			int temp = num;
			while(temp > 0){																	ld = temp % 10;
				if(ld == i){
					flag = false;
					break;
				}
				temp /= 10;			
			}
			if(flag){
	
				System.out.println("missing digit: " + i);
				
			}
			
		}
	}
}