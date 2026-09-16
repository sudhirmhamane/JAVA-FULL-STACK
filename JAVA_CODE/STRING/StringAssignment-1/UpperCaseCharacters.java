public class UpperCaseCharacters {
    public static void main(String[] args) {
        String s = new String("Java Developer");
        printUpperCase(s);
    }

    public static void printUpperCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                System.out.println(ch);
            }
        }
    }
}
