public class ExceptAlphabets {
    public static void main(String[] args) {
        String s = new String("J 903@!$%");
        exceptAlphabets(s);
    }
    public static void exceptAlphabets(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                System.out.println(ch+" ");
            }
        }
    }
}
