/*
13)Check Equality 
Input:  a=5 b=5  output: equal
In[ut  a=6 b=10  output: not equal
*/

class CheckEquality {

	public static void main(String[] args){

		int a = 5, b = 15;
		
		String res = (a == b) ? "equal" : "not equal";	
		System.out.println(res);
	}

}