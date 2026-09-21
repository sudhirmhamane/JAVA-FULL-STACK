public class PrintSpaces {
    public static void main(String[] args) {
        String s = new String("e ()#$12 a s 3y5 @,!");
        printLowerCase(s);
    }

    public static void printLowerCase(String s){
        char[] ch  = s.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++){
            
            if(ch[i] == ' '){
                count++;
            }
        }
        System.out.println("Total Spaces: " + count);
    }
}
