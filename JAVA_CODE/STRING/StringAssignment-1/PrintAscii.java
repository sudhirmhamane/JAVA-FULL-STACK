public class PrintAscii {
    public static void main(String[] args) {
        String s = new String("JAVA9hjkb");
        printAsciiValue(s);
    }

    public static void printAsciiValue(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch +" => " + (int) ch);
        }
    }
}
