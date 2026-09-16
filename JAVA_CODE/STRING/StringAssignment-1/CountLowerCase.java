public class CountLowerCase {
    public static void main(String[] args) {
        String s = new String("Java Developer");
        countUpperCase(s);
    }

    public static void countUpperCase(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
