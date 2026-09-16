public class PrintCharacter {
    public static void main(String[] args) {
        String s = new String("Java");
        printCharLineByLine(s);
    }

    public static void printCharLineByLine(String s){

        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
