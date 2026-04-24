/*
20)Passing with Distinction 
Input: marks=80 output: Distinction
Input: marks=50  output: Normal
Input: marks=45  output: Normal
*/

class PassWithDist{

	public static void main(String[] args){
		int marks = 80;
		
		String res =  marks >= 80 ? "Distinction" : "Normal";
		System.out.println(res);
	}
}