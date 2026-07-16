class NumberPrograms{

	public static void main(String[] args){
		int num = 13430383;
		frequencyDigit(num);
		uniqueDigit(num);
		duplicateDigit(num);
		highestRepeatingDigit(num);
		leastRepeatingDigit(num);
		distinctDigit(num);


	}

	public static void leastRepeatingDigit(int num){
		int ld = -1;
		int freq = 9;
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10;
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt != 0 && freq > cnt){
				freq = cnt;
				ld = i;
			}
			
		}
		System.out.println(ld + " : " + freq);
		
	}

	public static void highestRepeatingDigit(int num){
		int hd = 1;
		int freq = 0;
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10;
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt != 0 && freq < cnt){
				freq = cnt;
				hd = i;
			}
			
		}
		System.out.println(hd + " : " + freq);
		
	}

	public static void distinctDigit(int num){
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10;
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt != 0) System.out.println(i+ " : " + cnt);
		}
	}

	

	public static void duplicateDigit(int num){
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10;
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt > 1) System.out.println(i+" ");
		}
	}

	public static void uniqueDigit(int num){
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10; 
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt == 1) System.out.println(i+" ");
		}
	}

	public static void frequencyDigit(int num){
		for(int i=0; i<=9; i++){
			int dup = num, cnt = 0;
			while(dup != 0){
				int rem = dup%10;
				if(i == rem) cnt++;
				dup/=10;
			}
			if(cnt != 0){
				System.out.println(i + " : " + cnt);
			}
			
		}
	}

}