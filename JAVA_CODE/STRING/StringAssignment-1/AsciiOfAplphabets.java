public class AsciiOfAplphabets {
    public static void main(String[] args) {
        String s = new String("Java");
        printAsciiOfAlphabets(s);
    }
    public static void printAsciiOfAlphabets(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                System.out.println(ch+" -> "+ (int) ch);
            }
        }
    }
}
