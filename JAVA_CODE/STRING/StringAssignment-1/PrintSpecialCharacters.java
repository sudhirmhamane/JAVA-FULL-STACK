public class PrintSpecialCharacters {
    public static void main(String[] args) {
        String s = new String("e ()#$12 as3y5 @,!");
        printLowerCase(s);
    }

    public static void printLowerCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))){
                System.out.print(ch + " ");
            }
        }
    }
}
