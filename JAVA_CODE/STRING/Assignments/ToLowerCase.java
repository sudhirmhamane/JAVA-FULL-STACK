public class ToLowerCase {
    public static void main(String[] args) {
        String s = new String("JAVA");
        String res = toLowerCase(s);
        System.out.println(s);
        System.out.println(res);

    }

    public static String toLowerCase(String s){
        char[] ch = s.toCharArray();
        char[] modified = new char[ch.length];

        for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                modified[i] = (char)(ch[i]+32);
            } else{
                modified[i] = ch[i];
            }
        }
        return new String(modified);
    }
}
