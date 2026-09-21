class ToUpperCase{
    public static void main(String[] args) {
        String s = new String("java");
        String ns = toUpperCase(s);
        System.out.println(s);
        System.out.println(ns);
    }

    public static String toUpperCase(String s){
        char[] ch = s.toCharArray();
        char[] modified = new char[ch.length];
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                modified[i] = (char)(ch[i]-32);
            } else{
                modified[i] = ch[i];
            }
        }
        return new String(modified);
    }
}