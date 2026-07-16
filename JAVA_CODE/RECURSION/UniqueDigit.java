class UniqueDigit{

	public static void main(String [] args){
		int num = 1235244;
		uniqueDigit(num,0);
	}

	public static void uniqueDigit(int num, int i){
		if(i>9) return;
		int cnt = findFreq(i, num, 0);
		if(cnt == 1) System.out.println(i+ " ");
		uniqueDigit(num, ++i);
	}

	public static int findFreq(int i, int num, int cnt){

		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return findFreq(i, num/10, cnt);
	}

}