public class UpperCaseIndex {
    public static void main(String[] args) {
        String s = new String("Java Dev Engg");
        printUpperCaseCharIndex(s);
    }

    public static void printUpperCaseCharIndex(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                System.out.println(ch+" : "+ i);
            }
        }
    }
}
