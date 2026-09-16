public class IterateStringLastToFirst {
    public static void main(String[] args) {
        String s = new String("JavaDeveloper");
        printBackward(s);
    }

    public static void printBackward(String s){
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            System.out.print(ch+" ");
        }
    }
}
