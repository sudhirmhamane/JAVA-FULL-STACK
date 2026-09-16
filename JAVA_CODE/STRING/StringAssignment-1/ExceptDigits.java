public class ExceptDigits {
    public static void main(String[] args) {
        String s = new String("Java Developer0000");
        exceptDigits(s);
    }

    public static void exceptDigits(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(ch >= '0' && ch <= '9')){
                System.out.print(ch+" ");
            }
        }
    }
}
