public class PrintSpaces {
    public static void main(String[] args) {
        String s = new String("e ()#$12 a s 3y5 @,!");
        printLowerCase(s);
    }

    public static void printLowerCase(String s){
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
