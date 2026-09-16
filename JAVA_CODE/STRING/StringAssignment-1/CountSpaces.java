public class CountSpaces {
    public static void main(String[] args) {
        String s = new String("J a v a");
        countSpaces(s);
    }
    public static void countSpaces(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.println("Total Spaces: " + count);
    }
}
