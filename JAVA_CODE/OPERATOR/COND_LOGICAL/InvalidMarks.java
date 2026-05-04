// 6)Invalid Marks  (marks < 0 || marks > 100 )

class InvalidMarks{

	public static void main(String[] args){

		int marks = 0;
		String res = (marks < 0 || marks > 100 ) ? "Invalid marks" : "valid marks";
		System.out.println(res);
	}
}