public class AsciiOfConsonants {
    public static void main(String[] args) {
        String s = new String("Java Developer");
        printAsciiConsonants(s);
    }

    public static void printAsciiConsonants(String s){

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            ){
                 System.out.println(ch + " -> "+ (int)ch);
            }
        }
    }
}
