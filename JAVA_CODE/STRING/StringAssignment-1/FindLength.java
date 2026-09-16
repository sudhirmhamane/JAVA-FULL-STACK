class FindLength{
    public static void main(String[] args){
        String s = new String("Java");
        printLength(s);
    }

    public static void printLength(String s){
        char[] ch = s.toCharArray();
        int count = 0;
        for(char c: ch){
            count++;
        }
        System.out.println("Total length of String: "+ count);
    }
}