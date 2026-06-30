import java.util.Scanner;
class Solution{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int x = sc.nextInt();
	
		boolean res = isPalindrome(x);
	
		if(res){
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
		
	}

	public static boolean isPalindrome(int x){
			
		if(x < 0) return false;

		String str = x+"";
		for(int i=0,j=str.length()-1; i<j; i++,j--){
			
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			
		}

		return true;
	}
}