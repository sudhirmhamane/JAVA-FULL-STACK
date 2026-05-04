// 8) Vowel Check (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )


class CheckVowel{

	public static void main(String args[]){
		char ch = 'a';
		
		String res = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ) ? "Vowel" : "Not Vowel";
		System.out.println(res);
	}
}