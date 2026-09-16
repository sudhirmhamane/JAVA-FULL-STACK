public class ExceptLowerCase {
    public static void main(String[] args) {
        String s = new String("Java DevSDDelopWfFer");
        exceptUpperCase(s);
    }

    public static void exceptUpperCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch >= 'a' && ch <= 'z')){
                System.out.print(ch+" ");
            }
        }
    }
}
