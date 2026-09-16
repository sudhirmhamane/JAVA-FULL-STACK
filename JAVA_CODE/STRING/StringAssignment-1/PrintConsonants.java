public class PrintConsonants {
    public static void main(String[] args) {
        String s = new String("Java Developer");
        printConsonants(s);
    }

    public static void printConsonants(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            )){
                 System.out.print(ch + " ");
            }
        }
    }
}
