// 31. WAP to check given number is perfect square or not


import java.util.Scanner;
class PerfectSquare{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		boolean flag = false;


		for(int i=1; i<=num; i++){
			if((i*i) == num ){
				flag = true;
				break;
			}
		}

		if(flag){
			System.out.println(num + " is a perfect square");
		} else {
			System.out.println(num + " is not a perfect square");
		}
		sc.close();

	}

}