public class PrintSpecialCharIndex {
    public static void main(String[] args) {
        String s = new String("Javed32#@4$#");
        printSpecialCharIndex(s);
    }

    public static void printSpecialCharIndex(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))){
                System.out.println(ch+" => "+ i);
            }
        }
    }
}
