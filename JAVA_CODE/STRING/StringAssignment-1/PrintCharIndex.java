public class PrintCharIndex {
    public static void main(String[] args) {
        String s = new String("Java");
        printCharIndex(s);
    }

    public static void printCharIndex(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch+" : "+ i);
        }
        // char[] ch = s.toCharArray();
        // for(int i=0; i<ch.length; i++){
        //     System.out.println(ch[i]+ " : " + i);
        // }
    }
}
