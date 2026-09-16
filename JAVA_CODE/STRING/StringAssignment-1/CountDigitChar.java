public class CountDigitChar {
    public static void main(String[] args) {
        String s = new String("Java Developer2.0");
        countDigits(s);
    }
    public static void countDigits(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                count++;
            }
        }
        System.out.println("digit count: " + count);
    }
}
