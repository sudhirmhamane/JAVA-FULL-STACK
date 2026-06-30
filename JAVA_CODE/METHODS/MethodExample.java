import java.util.Scanner;

class MethodExample{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a num: ");
		double num = sc.nextDouble();

		System.out.println("Enter power: ");
		double pow = sc.nextDouble();

		double op = pow(num, pow);
		System.out.println(num+"^"+pow+"="+String.format("%.3f",op));
		System.out.println(num+"^"+pow+"="+(Math.pow(num,pow)));	
		
	}
	
	public static double pow(double num, double pow){
		
		if(pow < 0){
			pow *= -1;
			num = 1/num;
		}

		double op = 1;
		for(int i=1; i<=pow; i++){
			op *= num;
		}

		return op;
	
	}
}