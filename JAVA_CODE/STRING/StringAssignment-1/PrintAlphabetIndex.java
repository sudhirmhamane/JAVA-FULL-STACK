public class PrintAlphabetIndex {
    public static void main(String[] args) {
        String s = new String("e12as3y5");
        printAlphabetIndex(s);
    }

    public static void printAlphabetIndex(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                System.out.println(ch + " => "+i);
            }
        }
    }
}
