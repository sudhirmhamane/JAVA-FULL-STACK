public class CountConsonants {
    public static void main(String[] args) {
        String s = new String("Java Developer");
        countConsonants(s);
    }

    public static void countConsonants(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                count++;
            }
        }
        System.out.println("consonants: " + count);
    }
}
