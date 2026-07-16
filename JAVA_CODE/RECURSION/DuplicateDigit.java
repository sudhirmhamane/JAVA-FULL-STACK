class DuplicateDigit{

	public static void main(String [] args){
		int num = 1235244;
		duplicateDigit(num,0);
	}

	public static void duplicateDigit(int num, int i){
		if(i>9) return;
		int cnt = findFreq(i, num, 0);
		if(cnt > 1) System.out.println(i+ " ");
		duplicateDigit(num, ++i);
	}

	public static int findFreq(int i, int num, int cnt){

		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return findFreq(i, num/10, cnt);
	}

}