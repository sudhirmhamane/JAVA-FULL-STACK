public interface CountAlphabets {
    public static void main(String[] args) {
        String s = new String("000Java Develo");
        countAlphabets(s);
    }

    public static void countAlphabets(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                count++;
            }
        }
        System.out.println("Alphabets count: "+ count);
    }
}
