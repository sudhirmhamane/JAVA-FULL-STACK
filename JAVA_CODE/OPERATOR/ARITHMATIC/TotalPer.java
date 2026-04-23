// Total Percentages

class TotalPer{

	public static void main(String[] agrs){
		double m1 = 70;
		double m2 = 80;
		double m3 = 65; 
		double m4 = 90;
		double m5 = 75;
		
		double totalMarks = m1 + m2 + m3 + m4 + m5;

		double percentage = (totalMarks / 500) * 100;

		System.out.println("Total Percentage is: "+ percentage);
	}
}

// o/p -> Total Percentage is: 76.0