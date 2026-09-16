public class CountVowels {
    public static void main(String[] args) {
        String s = new String("Java Developer2.0");
        countVowels(s);
    }

    public static void countVowels(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            ){
                count++;
            }
        }
        System.out.println("vowel count: "+ count);
    }
}
