public class DigitChar {
    public static void main(String[] args) {
        String s = new String("Java9987389");
        printChar(s);
    }

    public static void printChar(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<= '9')
            System.out.println(ch);
        }
    }
}
