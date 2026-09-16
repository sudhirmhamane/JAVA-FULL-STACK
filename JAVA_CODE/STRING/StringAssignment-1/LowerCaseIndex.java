public class LowerCaseIndex {
    public static void main(String[] args) {
        String s = new String("Java Dev Engg");
        printLowerCaseCharIndex(s);
    }

    public static void printLowerCaseCharIndex(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <='z'){
                System.out.println(ch+" : "+ i);
            }
        }
    }
}
