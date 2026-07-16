class HighestRepDigit{

	public static void main(String[]args){

		int num = 1223;
		highestRepDigit(num, 0);
		
	}

	public static void highestRepDigit(int num, int i){
		if(i>9) return;
		int hd = 1; int freq = 0;
		int cnt = findFreq(i, num, 0);
		if(cnt !=0 && freq < cnt){
			freq = cnt;
			hd = i;
		}
		System.out.println(hd + " : " + freq);
		highestRepDigit(num, ++i);
	}
	public static int findFreq(int i, int num, int cnt){

		if(num == 0) return cnt;
		if(i == (num%10)) cnt++;
		return findFreq(i, num/10, cnt);
	}
}