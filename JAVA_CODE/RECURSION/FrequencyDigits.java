class FrequencyDigit{

	public static void main(String[]args){

		int num = 1244345325;
		freqDgt(num, 0);
		
	}

	public static void freqDgt(int num, int i){
		if(i>9) return;
		int cnt = findFreq(i, num, 0);
		if(cnt !=0) System.out.println(i+" : "+cnt);
		freqDgt(num, ++i);
	}
	public static int findFreq(int i, int num, int cnt){

		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return findFreq(i, num/10, cnt);
	}
}