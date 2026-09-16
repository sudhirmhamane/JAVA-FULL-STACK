class ExceptSpecialChar{
    public static void main(String[] args) {
        String s = new String("Java@#120@#44");
        exceptSpecialChar(s);
    }

    public static void exceptSpecialChar(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(((ch >='0' && ch <= '9') || (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <='z'))){
                System.out.print(ch+ " ");
            }
        }
    }
}