
import java.util.Scanner;
class TwoParts{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;

		while(num > 0){

			count++;
			num /= 10;
		}
		num = temp;

		if(count %2 == 0){	
			System.out.println(num + " can divide into two parts");
		} else{
			System.out.println(num + " cannot divide into two parts");
		}
	}

}