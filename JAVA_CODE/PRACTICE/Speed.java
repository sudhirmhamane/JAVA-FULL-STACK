import java.util.*;

public class Speed {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double D = sc.nextDouble();
		double T = sc.nextDouble();
		sc.close();
		if(T<1 || T>60){
			System.out.println("Invalid data");
		return;
		}

		double speed = (D/T)*18/5;
		System.out.println(speed);
		
		
	}
}