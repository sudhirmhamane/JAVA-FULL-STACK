public class AsciiOfDigits {
    public static void main(String[] args) {
        String s = new String("Java Devel93-35320oper");
        printAsciiDigits(s);
    }

    public static void printAsciiDigits(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                 System.out.println(ch + " -> "+ (int)ch);
            }
        }
    }
}
