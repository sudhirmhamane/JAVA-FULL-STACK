public class CountSpecialChar {
    public static void main(String[] args) {
        String s = new String("Developer__JAVA");
        countSpecialChar(s);
    }
    public static void countSpecialChar(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))){
                count++;
            }
        }
        System.out.println("Special count: "+ count);
    }
}
